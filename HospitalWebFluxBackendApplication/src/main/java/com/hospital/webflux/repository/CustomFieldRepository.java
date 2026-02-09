package com.hospital.webflux.repository;

import com.hospital.webflux.entity.CustomField;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomFieldRepository extends ReactiveCrudRepository<CustomField, Long> {
}
