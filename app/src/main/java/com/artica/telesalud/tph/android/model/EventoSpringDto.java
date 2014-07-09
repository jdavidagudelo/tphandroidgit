package com.artica.telesalud.tph.android.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;


public class EventoSpringDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String ESTADO_ACTIVO = "Activo";
	public static String ESTADO_FINALIZADO = "Finalizado";

    @JsonIgnore
	private Integer localId;

	private Integer eventoId;
	
	private String direccion;
	private CitySpringDto ciudad;
	private ConceptSpringDto zona;
	private ConceptSpringDto causaAtencion;
	private String numeroCaso;
	private Date fechaLlamada;
	private String estado;
	

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
	public CitySpringDto getCiudad() {
		return ciudad;
	}
	public void setCiudad(CitySpringDto ciudad) {
		this.ciudad = ciudad;
	}
	public ConceptSpringDto getZona() {
		return zona;
	}
	public void setZona(ConceptSpringDto zona) {
		this.zona = zona;
	}
	public ConceptSpringDto getCausaAtencion() {
		return causaAtencion;
	}
	public void setCausaAtencion(ConceptSpringDto causaAtencion) {
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

    public Integer getLocalId() {
        return localId;
    }

    public void setLocalId(Integer localId) {
        this.localId = localId;
    }
}
