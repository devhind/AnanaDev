package com.hospital.webflux.dto;

import com.hospital.webflux.entity.Patient;
import com.hospital.webflux.entity.PatientAdditionalDetails;

public class PatientResponse {

    private Patient patient;
    private PatientAdditionalDetails additionalDetails; // can be null

    public PatientResponse(Patient patient, PatientAdditionalDetails additionalDetails) {
        this.patient = patient;
        this.additionalDetails = additionalDetails;
    }

    public Patient getPatient() {
        return patient;
    }

    public PatientAdditionalDetails getAdditionalDetails() {
        return additionalDetails;
    }
}
