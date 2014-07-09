package com.artica.telesalud.tph.android.model.evento;

import com.artica.telesalud.tph.android.model.concept.Concept;
import com.artica.telesalud.tph.android.model.location.City;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Evento {

    public static String ESTADO_ACTIVO = "Activo";
    public static String ESTADO_FINALIZADO = "Finalizado";

    private Integer eventoId;
    private String direccion;
    private City ciudad;
    private Concept zona;
    private Concept causaAtencion;
    private String numeroCaso;
    private Date fechaLlamada;
    private String estado;
    private Integer creator;
    private Date dateCreated;
    private Integer changedBy;
    private Date dateChanged;
    private Boolean voided;
    private Integer voidedBy;
    private Date dateVoided;
    private String voidReason;
    private String Uuid;
    @JsonIgnore
    private Integer localId;

    public Integer getLocalId() {
        return localId;
    }

    public void setLocalId(Integer localId) {
        this.localId = localId;
    }

    public Integer getEventoId() {
        return eventoId;
    }

    public void setEventoId(Integer eventoId) {
        this.eventoId = eventoId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public City getCiudad() {
        return ciudad;
    }

    public void setCiudad(City ciudad) {
        this.ciudad = ciudad;
    }

    public Concept getZona() {
        return zona;
    }

    public void setZona(Concept zona) {
        this.zona = zona;
    }

    public Concept getCausaAtencion() {
        return causaAtencion;
    }

    public void setCausaAtencion(Concept causaAtencion) {
        this.causaAtencion = causaAtencion;
    }

    public String getNumeroCaso() {
        return numeroCaso;
    }

    public void setNumeroCaso(String numeroCaso) {
        this.numeroCaso = numeroCaso;
    }

    public Date getFechaLlamada() {
        return fechaLlamada;
    }

    public void setFechaLlamada(Date fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

}