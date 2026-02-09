package com.hospital.webflux.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("patient_additional_details")
public class PatientAdditionalDetails {

    @Id
    private Long id;

    @Column("patient_id")
    private Long patientId;

    @Column("marital_status")
    private String maritalStatus;

    @Column("anniversary_date")
    private LocalDate anniversaryDate;

    @Column("blood_group")
    private String bloodGroup;

    @Column("spouse_name")
    private String spouseName;

    @Column("spouse_blood_group")
    private String spouseBloodGroup;

    @Column("referring_doctor")
    private String referringDoctor;

    @Column("speciality")
    private String speciality;

    @Column("channel")
    private String channel;

    @Column("c_o")
    private String co;
    
    @Column("occupation")
    private String occupation;

    @Column("tag")
    private String tag;

    @Column("alternate_mobile")
    private String alternateMobile;

    @Column("aadhar_number")
    private String aadharNumber;

    // ===== GETTERS & SETTERS =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public LocalDate getAnniversaryDate() {
        return anniversaryDate;
    }

    public void setAnniversaryDate(LocalDate anniversaryDate) {
        this.anniversaryDate = anniversaryDate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseBloodGroup() {
        return spouseBloodGroup;
    }

    public void setSpouseBloodGroup(String spouseBloodGroup) {
        this.spouseBloodGroup = spouseBloodGroup;
    }

    public String getReferringDoctor() {
        return referringDoctor;
    }

    public void setReferringDoctor(String referringDoctor) {
        this.referringDoctor = referringDoctor;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAlternateMobile() {
        return alternateMobile;
    }

    public void setAlternateMobile(String alternateMobile) {
        this.alternateMobile = alternateMobile;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }
}
