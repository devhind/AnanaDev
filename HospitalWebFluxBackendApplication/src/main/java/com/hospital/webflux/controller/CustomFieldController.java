package com.hospital.webflux.controller;

import com.hospital.webflux.dto.CustomFieldRequest;
import com.hospital.webflux.entity.CustomField;
import com.hospital.webflux.service.CustomFieldService;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/custom-fields")
@CrossOrigin(origins = "http://localhost:5173")
public class CustomFieldController {

    private final CustomFieldService service;

    public CustomFieldController(CustomFieldService service) {
        this.service = service;
    }

    // ================= CREATE =================
    @PostMapping
    public Mono<CustomField> create(@RequestBody CustomFieldRequest request) {

        // 🔍 DEBUG — MUST appear in backend console
        System.out.println("🔥 LabelName received = " + request.getLabelName());

        // ✅ VALIDATION (prevents DB error)
        if (request.getLabelName() == null || request.getLabelName().isBlank()) {
            return Mono.error(new IllegalArgumentException("Label Name is required"));
        }

        // ✅ MANUAL MAPPING (NO BUILDER, NO LOMBOK ISSUES)
        CustomField field = new CustomField();
        field.setLabelName(request.getLabelName());
        field.setDataType(request.getDataType());
        field.setHelpText(request.getHelpText());
        field.setExternalField(request.getExternalField());
        field.setExternalService(request.getExternalService());

        field.setAttachmentImage(request.getAttachmentImage());
        field.setAttachmentPdf(request.getAttachmentPdf());
        field.setAttachmentDocument(request.getAttachmentDocument());
        field.setAttachmentAll(request.getAttachmentAll());

        field.setLookupModule(request.getLookupModule());
        field.setAutoPrefix(request.getAutoPrefix());
        field.setAutoStart(request.getAutoStart());
        field.setAutoSuffix(request.getAutoSuffix());
        field.setAutoApplyToExisting(request.getAutoApplyToExisting());

        field.setColorPlacement(request.getColorPlacement());
        field.setPii(request.getPii());
        field.setEphi(request.getEphi());

        field.setPreventDuplicate(request.getPreventDuplicate());
        field.setInputFormat(request.getInputFormat());
        field.setDefaultValue(request.getDefaultValue());
        field.setInheritFrom(request.getInheritFrom());
        field.setMandatory(request.getMandatory());
        field.setShowInPdf(request.getShowInPdf());

        field.setCreatedAt(LocalDateTime.now());

        return service.save(field);
    }

    // ================= READ =================
    @GetMapping
    public Flux<CustomField> getAll() {
        return service.findAll();
    }
}
