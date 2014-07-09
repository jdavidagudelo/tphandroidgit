package com.artica.telesalud.tph.android.model;



public class PatientIdentifierTypeSpringDto {
	private Integer patientIdentifierTypeId;
	private String name;
	private String description;

	/**
	 * @return the patientIdentifierTypeId
	 */
	public Integer getPatientIdentifierTypeId() {
		return patientIdentifierTypeId;
	}
	/**
	 * @param patientIdentifierTypeId the patientIdentifierTypeId to set
	 */
	public void setPatientIdentifierTypeId(Integer patientIdentifierTypeId) {
		this.patientIdentifierTypeId = patientIdentifierTypeId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
