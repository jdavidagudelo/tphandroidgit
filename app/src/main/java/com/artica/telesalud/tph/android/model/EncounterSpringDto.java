package com.artica.telesalud.tph.android.model;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;


public class EncounterSpringDto {
	public static String STATE_ACTIVE = "ACTIVO";
	public static String STATE_TERMINATED = "TERMINADO";
	public static String STATE_NO_ATTENDED = "NO ATENDIDO";
	public static String STATE_ATTENDED_NEW = "ATENDIDO CON NOVEDAD";
	public static String STATE_ATTENDED_REVISED = "ATENDIDO REVISADO";

	private Integer encounterId;
	private EncounterTypeSpringDto encounterType;
	private PatientSpringDto patient;
	private PersonSpringDto provider;
	private CitySpringDto location;
	private Date encounterDatetime;
	private String state;



	/**
	 * @return the encounterId
	 */
	public Integer getEncounterId() {
		return encounterId;
	}

	/**
	 * @param encounterId
	 *            the encounterId to set
	 */
	public void setEncounterId(Integer encounterId) {
		this.encounterId = encounterId;
	}

	/**
	 * @return the encounterType
	 */
	public EncounterTypeSpringDto getEncounterType() {
		return encounterType;
	}

	/**
	 * @param encounterType
	 *            the encounterType to set
	 */
	public void setEncounterType(EncounterTypeSpringDto encounterType) {
		this.encounterType = encounterType;
	}

	/**
	 * @return the patient
	 */
	public PatientSpringDto getPatient() {
		return patient;
	}

	/**
	 * @param patient
	 *            the patient to set
	 */
	public void setPatient(PatientSpringDto patient) {
		this.patient = patient;
	}

	/**
	 * @return the provider
	 */
	public PersonSpringDto getProvider() {
		return provider;
	}

	/**
	 * @param provider
	 *            the provider to set
	 */
	public void setProvider(PersonSpringDto provider) {
		this.provider = provider;
	}

	/**
	 * @return the location
	 */
	public CitySpringDto getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(CitySpringDto location) {
		this.location = location;
	}

	public Date getEncounterDatetime() {
		return encounterDatetime;
	}

	/**
	 * @param encounterDatetime
	 *            the encounterDatetime to set
	 */
	public void setEncounterDatetime(Date encounterDatetime) {
		this.encounterDatetime = encounterDatetime;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

}
