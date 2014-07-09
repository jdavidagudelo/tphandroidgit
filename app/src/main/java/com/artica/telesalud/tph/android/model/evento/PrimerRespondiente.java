package com.artica.telesalud.tph.android.model.evento;

import com.artica.telesalud.tph.android.model.concept.Concept;

import java.util.Date;

public class PrimerRespondiente {

    Integer primerRespondienteId;
    Lesionado lesionado;
    Concept primerRespondiente;
    private Integer creator;
    private Date dateCreated;
    private Integer changedBy;
    private Date dateChanged;
    private Boolean voided;
    private Integer voidedBy;
    private Date dateVoided;
    private String voidReason;
    private String Uuid;


    public Integer getPrimerRespondienteId() {
        return primerRespondienteId;
    }

    public void setPrimerRespondienteId(Integer primerRespondienteId) {
        this.primerRespondienteId = primerRespondienteId;
    }

    public Lesionado getLesionado() {
        return lesionado;
    }

    public void setLesionado(Lesionado lesionado) {
        this.lesionado = lesionado;
    }

    public Concept getPrimerRespondiente() {
        return primerRespondiente;
    }

    public void setPrimerRespondiente(Concept primerRespondiente) {
        this.primerRespondiente = primerRespondiente;
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

}
