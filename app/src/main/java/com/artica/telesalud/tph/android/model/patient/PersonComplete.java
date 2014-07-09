package com.artica.telesalud.tph.android.model.patient;

import java.io.Serializable;
import java.util.Date;

public class PersonComplete implements Serializable {

    private Integer patientId;
    private Integer creator;
    private String identifier;
    private Integer patientIdentifierType;
    private String givenName;
    private String middleName;
    private String familyName;
    private String familyName2;
    private String gender;
    private Date birthdate;
    private String address;
    private Integer city;
    private Integer state;
    private String zone;
    private String phone1;
    private String phone2;
    private String email;
    private Integer maritalStatus;
    private String ocupation;
    private Integer userType;
    private Integer afiliateType;
    private Integer externalCause;
    private String momId;
    private String momName;
    private String dadId;
    private String dadName;
    private String responsableName;
    private String responsableFamily;
    private String responsablePhone;
    private String responsablePhone1;
    private String responsableKin;
    private Boolean hasAttendat;
    private String attendatName;
    private String attendatFamily;
    private String attendatPhone;
    private String attendatKin;
    private Integer sede;
    private String registro;
    private Integer especialidad;
    private Integer erp;
    private Integer nivel;
    private String firma;
    private Integer aseguradora;
    private Integer eps;
    private Integer planBenficios;

    public String toString() {

        String completeName = "";

        if (this.givenName != null)
            completeName += this.givenName;

        if (this.middleName != null)
            completeName += " " + this.middleName;

        if (this.familyName != null)
            completeName += " " + this.familyName;

        if (this.familyName2 != null)
            completeName += " " + this.familyName2;

        return completeName;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setPatientIdentifierType(Integer patientIdentifierType) {
        this.patientIdentifierType = patientIdentifierType;
    }

    public Integer getPatientIdentifierType() {
        return this.patientIdentifierType;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getGivenName() {
        return this.givenName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName2(String familyName2) {
        this.familyName2 = familyName2;
    }

    public String getFamilyName2() {
        return familyName2;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getCity() {
        return city;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setExternalCause(Integer externalCause) {
        this.externalCause = externalCause;
    }

    public Integer getExternalCause() {
        return externalCause;
    }

    public void setAfiliateType(Integer afiliateType) {
        this.afiliateType = afiliateType;
    }

    public Integer getAfiliateType() {
        return afiliateType;
    }

    public void setMomId(String momId) {
        this.momId = momId;
    }

    public String getMomId() {
        return momId;
    }

    public void setMomName(String momName) {
        this.momName = momName;
    }

    public String getMomName() {
        return momName;
    }

    public void setDadId(String dadId) {
        this.dadId = dadId;
    }

    public String getDadId() {
        return dadId;
    }

    public void setDadName(String dadName) {
        this.dadName = dadName;
    }

    public String getDadName() {
        return dadName;
    }

    public void setResponsableName(String responsableName) {
        this.responsableName = responsableName;
    }

    public String getResponsableName() {
        return responsableName;
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

    public void setAttendatName(String attendatName) {
        this.attendatName = attendatName;
    }

    public String getAttendatName() {
        return attendatName;
    }

    public void setAttendatPhone(String attendatPhone) {
        this.attendatPhone = attendatPhone;
    }

    public String getAttendatPhone() {
        return attendatPhone;
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

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setSede(Integer sede) {
        this.sede = sede;
    }

    public Integer getSede() {
        return sede;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setEspecialidad(Integer especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getEspecialidad() {
        return especialidad;
    }

    public void setErp(Integer erp) {
        this.erp = erp;
    }

    public Integer getErp() {
        return erp;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }

    public String getAttendatKin() {
        return attendatKin;
    }

    public void setAttendatKin(String attendatKin) {
        this.attendatKin = attendatKin;
    }

    public String getResponsablePhone1() {
        return responsablePhone1;
    }

    public void setResponsablePhone1(String responsablePhone1) {
        this.responsablePhone1 = responsablePhone1;
    }

    public Integer getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Integer aseguradora) {
        this.aseguradora = aseguradora;
    }

    public Integer getEps() {
        return eps;
    }

    public void setEps(Integer eps) {
        this.eps = eps;
    }

    public Integer getPlanBenficios() {
        return planBenficios;
    }

    public void setPlanBenficios(Integer planBenficios) {
        this.planBenficios = planBenficios;
    }

}
