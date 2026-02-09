package com.hospital.webflux.repository;

import com.hospital.webflux.entity.Patient;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository
        extends ReactiveCrudRepository<Patient, Long> {
}
