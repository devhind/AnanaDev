package com.hospital.webflux.controller;

import com.hospital.webflux.entity.Patient;
import com.hospital.webflux.dto.PatientRequest;
import com.hospital.webflux.dto.PatientResponse;
import com.hospital.webflux.service.PatientService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/patients")
@CrossOrigin(origins = "http://localhost:5173")
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    // ===============================
    // POST: SAVE PATIENT + DETAILS
    // ===============================
    @PostMapping
    public Mono<ResponseEntity<String>> savePatientWithDetails(
            @RequestBody PatientRequest request
    ) {
        return service.savePatientWithDetails(request)
                .thenReturn(ResponseEntity.ok("Patient saved"));
    }

    // ===============================
    // GET: PATIENT ONLY (OLD)
    // ===============================
    @GetMapping
    public Flux<Patient> getAllPatients() {
        return service.findAll();
    }

    // ===============================
    // ✅ GET: PATIENT + ADDITIONAL DETAILS
    // ===============================
    @GetMapping("/with-details")
    public Flux<PatientResponse> getAllPatientsWithDetails() {
        return service.findAllWithDetails();
    }

    @GetMapping("/test")
    public String test() {
        return "API WORKING";
    }
}
