package com.artica.telesalud.tph.android.model.patient;

import java.io.Serializable;
import java.util.Date;

public class PatientIdentifier implements Serializable {

    private Integer PatientIdentifierId;
    private Patient patient;
    private String identifier;
    private PatientIdentifierType patientIdentifierType;
    private Boolean preferred;
    private Integer country;
    private Integer creator;
    private Date dateCreated;
    private Boolean voided;
    private Integer voidedBy;
    private Date dateVoided;
    private String voidReason;
    private String Uuid;


    public Integer getPatientIdentifierId() {
        return PatientIdentifierId;
    }

    public void setPatientIdentifierId(Integer patientIdentifierId) {
        PatientIdentifierId = patientIdentifierId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public PatientIdentifierType getPatientIdentifierType() {
        return patientIdentifierType;
    }

    public void setPatientIdentifierType(PatientIdentifierType patientIdentifierType) {
        this.patientIdentifierType = patientIdentifierType;
    }

    public Boolean getPreferred() {
        return preferred;
    }

    public void setPreferred(Boolean preferred) {
        this.preferred = preferred;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Boolean getVoided() {
        return voided;
    }

    public void setVoided(Boolean voided) {
        this.voided = voided;
    }

    public Integer getVoidedBy() {
        return voidedBy;
    }

    public void setVoidedBy(Integer voidedBy) {
        this.voidedBy = voidedBy;
    }

    public Date getDateVoided() {
        return dateVoided;
    }

    public void setDateVoided(Date dateVoided) {
        this.dateVoided = dateVoided;
    }

    public String getVoidReason() {
        return voidReason;
    }

    public void setVoidReason(String voidReason) {
        this.voidReason = voidReason;
    }

    public String getUuid() {
        return Uuid;
    }

    public void setUuid(String uuid) {
        Uuid = uuid;
    }

}
