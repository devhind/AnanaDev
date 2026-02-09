package com.hospital.webflux.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

import com.hospital.webflux.entity.PatientAdditionalDetails;

import reactor.core.publisher.Mono;

public interface PatientAdditionalDetailsRepository
        extends ReactiveCrudRepository<PatientAdditionalDetails, Long> {

    Mono<PatientAdditionalDetails> findByPatientId(Long patientId);
}
