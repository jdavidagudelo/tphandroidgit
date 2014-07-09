package com.artica.telesalud.tph.android.model.patient;

import com.artica.telesalud.tph.android.model.concept.Concept;
import com.artica.telesalud.tph.android.model.person.Person;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Patient implements Serializable {

    private Integer patientId;
    private Person person;
    private Tribe tribe;
    private Concept maritalStatus;
    private String ocupation;
    private Concept userType;
    private Concept afiliateType;
    private Concept externalCause;
    private String momId;
    private String momName;
    private String dadId;
    private String dadName;
    private String responsableName;
    private String responsableFamily;
    private String responsablePhone;
    private String responsablePhone2;
    private String responsableKin;
    private Boolean hasAttendat;
    private String attendatName;
    private String attendatFamily;
    private String attendatPhone;
    private String attendatKin;
    private Integer creator;
    private Date dateCreated;
    private Integer changedBy;
    private Date dateChanged;
    private Boolean voided;
    private Integer voidedBy;
    private Date dateVoided;
    private String voidReason;

    private PatientIdentifier preferredIdentifier;

    private Set<PatientIdentifier> patientIdentifiers = new HashSet<PatientIdentifier>();

    public Tribe getTribe() {
        return tribe;
    }

    public void setTribe(Tribe tribe) {
        this.tribe = tribe;
    }

    public Concept getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Concept status) {
        this.maritalStatus = status;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public Concept getUserType() {
        return userType;
    }

    public void setUserType(Concept userType) {
        this.userType = userType;
    }

    public Concept getAfiliateType() {
        return afiliateType;
    }

    public void setAfiliateType(Concept afiliateType) {
        this.afiliateType = afiliateType;
    }

    public String getMomId() {
        return momId;
    }

    public void setMomId(String momId) {
        this.momId = momId;
    }

    public String getMomName() {
        return momName;
    }

    public void setMomName(String momName) {
        this.momName = momName;
    }

    public String getDadId() {
        return dadId;
    }

    public void setDadId(String dadId) {
        this.dadId = dadId;
    }

    public String getDadName() {
        return dadName;
    }

    public void setDadName(String dadName) {
        this.dadName = dadName;
    }

    public String getResponsableName() {
        return responsableName;
    }

    public void setResponsableName(String responsableName) {
        this.responsableName = responsableName;
    }

    public void setResponsablePhone(String responsablePhone) {
        this.responsablePhone = responsablePhone;
    }

    public String getResponsablePhone() {
        return responsablePhone;
    }

    public void setResponsableKin(String responsableKin) {
        this.responsableKin = responsableKin;
    }

    public String getResponsableKin() {
        return responsableKin;
    }

    public String getAttendatName() {
        return attendatName;
    }

    public void setAttendatName(String attendatName) {
        this.attendatName = attendatName;
    }

    public void setAttendatPhone(String attendatPhone) {
        this.attendatPhone = attendatPhone;
    }

    public String getAttendatPhone() {
        return attendatPhone;
    }

    public void setExternalCause(Concept externalCause) {
        this.externalCause = externalCause;
    }

    public Concept getExternalCause() {
        return externalCause;
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

    public Integer getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(Integer changedBy) {
        this.changedBy = changedBy;
    }

    public Date getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
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

    public Set<PatientIdentifier> getPatientIdentifiers() {
        return patientIdentifiers;
    }

    public void setPatientIdentifiers(Set<PatientIdentifier> patientIdentifiers) {

        patientIdentifiers.clear();
        for (PatientIdentifier patientIdentifier : patientIdentifiers) {
            patientIdentifiers.add(patientIdentifier);
        }

    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.patientId = person.getPersonId();
        this.person = person;
    }

    public PatientIdentifier getPreferredIdentifier() {
        return preferredIdentifier;
    }

    public void setPreferredIdentifier(PatientIdentifier preferredIdentifier) {
        this.preferredIdentifier = preferredIdentifier;
    }

    public void setResponsableFamily(String responsableFamily) {
        this.responsableFamily = responsableFamily;
    }

    public String getResponsableFamily() {
        return responsableFamily;
    }

    public void setHasAttendat(Boolean hasAttendat) {
        this.hasAttendat = hasAttendat;
    }

    public Boolean getHasAttendat() {
        return hasAttendat;
    }

    public void setAttendatFamily(String attendatFamily) {
        this.attendatFamily = attendatFamily;
    }

    public String getAttendatFamily() {
        return attendatFamily;
    }

    public String getAttendatKin() {
        return attendatKin;
    }

    public void setAttendatKin(String attendatKin) {
        this.attendatKin = attendatKin;
    }

    public String getResponsablePhone2() {
        return responsablePhone2;
    }

    public void setResponsablePhone2(String responsablePhone2) {
        this.responsablePhone2 = responsablePhone2;
    }
}
