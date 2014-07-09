package com.artica.telesalud.tph.android.model.person;

import com.artica.telesalud.tph.android.model.concept.Concept;
import com.artica.telesalud.tph.android.model.location.Location;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Person implements Serializable {

    private Integer personId;
    private String gender;
    private Date birthdate;
    private Boolean birthdateEstimated;
    private Integer specialty;
    private String identification;
    private Boolean dead;
    private Date deathDate;
    private Concept causeOfDeath;
    private Integer creator;
    private Date dateCreated;
    private Integer changedBy;
    private Date dateChanged;
    private Boolean voided;
    private Integer voidedBy;
    private Date dateVoided;
    private String voidReason;
    private String Uuid;
    private Integer age;
    private Location location;
    private String registro;
    private String firma;
    private Concept erp;
    private Concept nivel;
    private Concept controlAph;


    private PersonName preferredName;
    private PersonAddress preferredAddress;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Boolean getBirthdateEstimated() {
        return birthdateEstimated;
    }

    public void setBirthdateEstimated(Boolean birthdateEstimated) {
        this.birthdateEstimated = birthdateEstimated;
    }

    public Boolean getDead() {
        return dead;
    }

    public void setDead(Boolean dead) {
        this.dead = dead;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public Concept getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(Concept causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
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

    public String getUuid() {
        return Uuid;
    }

    public void setUuid(String uuid) {
        Uuid = uuid;
    }

    public PersonName getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(PersonName preferredName) {
        this.preferredName = preferredName;
    }

    public PersonAddress getPreferredAddress() {
        return preferredAddress;
    }

    public void setPreferredAddress(PersonAddress preferredAddress) {
        this.preferredAddress = preferredAddress;
    }

    public void setPersonAttributes(Set<PersonAttribute> personAttributes) {

        personAttributes.clear();
        for (PersonAttribute personAttribute : personAttributes) {
            personAttributes.add(personAttribute);
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSpecialty(Integer specialty) {
        this.specialty = specialty;
    }

    public Integer getSpecialty() {
        return specialty;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getIdentification() {
        return identification;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }

    public void setErp(Concept erp) {
        this.erp = erp;
    }

    public Concept getErp() {
        return erp;
    }

    public void setNivel(Concept nivel) {
        this.nivel = nivel;
    }

    public Concept getNivel() {
        return nivel;
    }

    public Concept getControlAph() {
        return controlAph;
    }

    public void setControlAph(Concept controlAph) {
        this.controlAph = controlAph;
    }
}
