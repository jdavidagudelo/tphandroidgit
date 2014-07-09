package com.artica.telesalud.tph.android.model;

public class AntecedenteSpringDto {
	private Integer year;
	private String tipoAntecedente;
	private Integer idTipoAntecedente;
	private String observacion;
	
	public AntecedenteSpringDto() {
		super();
	}
	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	/**
	 * @return the tipoAntecedente
	 */
	public String getTipoAntecedente() {
		return tipoAntecedente;
	}
	/**
	 * @param tipoAntecedente the tipoAntecedente to set
	 */
	public void setTipoAntecedente(String tipoAntecedente) {
		this.tipoAntecedente = tipoAntecedente;
	}
	/**
	 * @return the idTipoAntecedente
	 */
	public Integer getIdTipoAntecedente() {
		return idTipoAntecedente;
	}
	/**
	 * @param idTipoAntecedente the idTipoAntecedente to set
	 */
	public void setIdTipoAntecedente(Integer idTipoAntecedente) {
		this.idTipoAntecedente = idTipoAntecedente;
	}
	/**
	 * @return the observacion
	 */
	public String getObservacion() {
		return observacion;
	}
	/**
	 * @param observacion the observacion to set
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
}
