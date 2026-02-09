package com.hospital.webflux.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hospital.webflux.entity.Patient;
import com.hospital.webflux.entity.PatientAdditionalDetails;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientRequest {

    @JsonProperty("patient")
    private Patient patient;

    @JsonProperty("additionalDetails")
    private PatientAdditionalDetails additionalDetails;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public PatientAdditionalDetails getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(PatientAdditionalDetails additionalDetails) {
        this.additionalDetails = additionalDetails;
    }
}
