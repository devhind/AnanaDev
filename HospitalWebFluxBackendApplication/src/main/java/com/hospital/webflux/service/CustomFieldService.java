package com.hospital.webflux.service;

import com.hospital.webflux.entity.CustomField;
import com.hospital.webflux.repository.CustomFieldRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class CustomFieldService {

    private final CustomFieldRepository repository;

    public CustomFieldService(CustomFieldRepository repository) {
        this.repository = repository;
    }

    public Mono<CustomField> save(CustomField field) {
        if (field.getCreatedAt() == null) {
            field.setCreatedAt(LocalDateTime.now());
        }
        return repository.save(field);
    }

    public Flux<CustomField> findAll() {
        return repository.findAll();
    }
}
