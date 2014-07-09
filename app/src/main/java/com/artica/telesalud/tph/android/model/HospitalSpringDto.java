package com.artica.telesalud.tph.android.model;


public class HospitalSpringDto {
	private Integer hospitalId;
	private String nombre;
	private CitySpringDto ciudad;
	private String direccion;
	private ConceptSpringDto nivelComplejidad;

	/**
	 * @return the hospitalId
	 */
	public Integer getHospitalId() {
		return hospitalId;
	}
	/**
	 * @param hospitalId the hospitalId to set
	 */
	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the ciudad
	 */
	public CitySpringDto getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(CitySpringDto ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the nivelComplejidad
	 */
	public ConceptSpringDto getNivelComplejidad() {
		return nivelComplejidad;
	}
	/**
	 * @param nivelComplejidad the nivelComplejidad to set
	 */
	public void setNivelComplejidad(ConceptSpringDto nivelComplejidad) {
		this.nivelComplejidad = nivelComplejidad;
	}
	
}
