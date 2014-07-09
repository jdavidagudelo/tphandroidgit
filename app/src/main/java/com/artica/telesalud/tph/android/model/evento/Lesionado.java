package com.artica.telesalud.tph.android.model.evento;


import com.artica.telesalud.tph.android.model.concept.Concept;
import com.artica.telesalud.tph.android.model.encounter.Encounter;

import java.util.Date;

public class Lesionado {

    private Integer lesionadoId;
    private Encounter encuentro;
    private Evento evento;
    private Tripulacion tripulacion;
    private Concept resultado;
    private Concept dispositivoTransporte;
    private Boolean niegaAtencion;
    private Concept tipoNegacion;
    private String observacionNegacion;
    private Hospital entidadRecepcion;
    private String recibidoPor;
    private String registroRecibe;
    private Concept eps;
    private Concept aseguradora;
    private Concept planBeneficios;
    private Boolean solicitaTeleasistencia;
    private Integer creator;
    private Date dateCreated;
    private Integer changedBy;
    private Date dateChanged;
    private Boolean voided;
    private Integer voidedBy;
    private Date dateVoided;
    private String voidReason;
    private String Uuid;


    public Integer getLesionadoId() {
        return lesionadoId;
    }

    public void setLesionadoId(Integer lesionadoId) {
        this.lesionadoId = lesionadoId;
    }

    public Encounter getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(Encounter encuentro) {
        this.encuentro = encuentro;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Tripulacion getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(Tripulacion tripulacion) {
        this.tripulacion = tripulacion;
    }

    public Concept getResultado() {
        return resultado;
    }

    public void setResultado(Concept resultado) {
        this.resultado = resultado;
    }

    public Concept getDispositivoTransporte() {
        return dispositivoTransporte;
    }

    public void setDispositivoTransporte(Concept dispositivoTransporte) {
        this.dispositivoTransporte = dispositivoTransporte;
    }

    public Boolean getNiegaAtencion() {
        return niegaAtencion;
    }

    public void setNiegaAtencion(Boolean niegaAtencion) {
        this.niegaAtencion = niegaAtencion;
    }

    public Concept getTipoNegacion() {
        return tipoNegacion;
    }

    public void setTipoNegacion(Concept tipoNegacion) {
        this.tipoNegacion = tipoNegacion;
    }

    public String getObservacionNegacion() {
        return observacionNegacion;
    }

    public void setObservacionNegacion(String observacionNegacion) {
        this.observacionNegacion = observacionNegacion;
    }

    public Hospital getEntidadRecepcion() {
        return entidadRecepcion;
    }

    public void setEntidadRecepcion(Hospital entidadRecepcion) {
        this.entidadRecepcion = entidadRecepcion;
    }

    public String getRecibidoPor() {
        return recibidoPor;
    }

    public void setRecibidoPor(String recibidoPor) {
        this.recibidoPor = recibidoPor;
    }

    public String getRegistroRecibe() {
        return registroRecibe;
    }

    public void setRegistroRecibe(String registroRecibe) {
        this.registroRecibe = registroRecibe;
    }

    public Concept getEps() {
        return eps;
    }

    public void setEps(Concept eps) {
        this.eps = eps;
    }

    public Concept getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Concept aseguradora) {
        this.aseguradora = aseguradora;
    }

    public Concept getPlanBeneficios() {
        return planBeneficios;
    }

    public void setPlanBeneficios(Concept planBeneficios) {
        this.planBeneficios = planBeneficios;
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

    public Boolean getSolicitaTeleasistencia() {
        return solicitaTeleasistencia;
    }

    public void setSolicitaTeleasistencia(Boolean solicitaTeleasistencia) {
        this.solicitaTeleasistencia = solicitaTeleasistencia;
    }
}