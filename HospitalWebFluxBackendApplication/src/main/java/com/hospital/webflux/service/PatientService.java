package com.hospital.webflux.service;

import com.hospital.webflux.entity.Patient;
import com.hospital.webflux.entity.PatientAdditionalDetails;
import com.hospital.webflux.repository.PatientAdditionalDetailsRepository;
import com.hospital.webflux.repository.PatientRepository;
import com.hospital.webflux.dto.PatientRequest;
import com.hospital.webflux.dto.PatientResponse;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class PatientService {

    private final PatientRepository patientRepository;
    private final PatientAdditionalDetailsRepository additionalDetailsRepository;

    // ✅ MANUAL CONSTRUCTOR
    public PatientService(
            PatientRepository patientRepository,
            PatientAdditionalDetailsRepository additionalDetailsRepository
    ) {
        this.patientRepository = patientRepository;
        this.additionalDetailsRepository = additionalDetailsRepository;
    }

    // ===============================
    // SAVE: PATIENT ONLY
    // ===============================
    public Mono<Patient> save(Patient patient) {
        patient.setCreatedAt(LocalDateTime.now());
        return patientRepository.save(patient);
    }

    // ===============================
    // SAVE: PATIENT + ADDITIONAL DETAILS
    // ===============================
    public Mono<Void> savePatientWithDetails(PatientRequest request) {

        Patient patient = request.getPatient();
        patient.setCreatedAt(LocalDateTime.now());

        return patientRepository.save(patient)
                .flatMap(savedPatient -> {

                    PatientAdditionalDetails details =
                            request.getAdditionalDetails();

                    if (details == null) {
                        return Mono.empty();
                    }

                    details.setPatientId(savedPatient.getId());
                    return additionalDetailsRepository.save(details).then();
                });
    }

    // ===============================
    // GET: PATIENT ONLY
    // ===============================
    public Flux<Patient> findAll() {
        return patientRepository.findAll();
    }

    // ===============================
    // ✅ GET: PATIENT + ADDITIONAL DETAILS
    // ===============================
    public Flux<PatientResponse> findAllWithDetails() {

        return patientRepository.findAll()
                .flatMap(patient ->
                        additionalDetailsRepository
                                .findByPatientId(patient.getId())
                                .map(details -> new PatientResponse(patient, details))
                                .switchIfEmpty(
                                        Mono.just(new PatientResponse(patient, null))
                                )
                );
    }

}
