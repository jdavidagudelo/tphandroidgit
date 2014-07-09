package com.artica.telesalud.tph.android.model;


public class PatientIdentifierSpringDto {
	private Integer PatientIdentifierId;
	private Integer patientId;
	private String identifier;
	private PatientIdentifierTypeSpringDto patientIdentifierType;
	private Boolean preferred;
	private Integer country;

	/**
	 * @return the patientIdentifierId
	 */
	public Integer getPatientIdentifierId() {
		return PatientIdentifierId;
	}
	/**
	 * @param patientIdentifierId the patientIdentifierId to set
	 */
	public void setPatientIdentifierId(Integer patientIdentifierId) {
		PatientIdentifierId = patientIdentifierId;
	}
	/**
	 * @return the patient
	 */
	public Integer getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patient to set
	 */
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	/**
	 * @return the identifier
	 */
	public String getIdentifier() {
		return identifier;
	}
	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	/**
	 * @return the patientIdentifierType
	 */
	public PatientIdentifierTypeSpringDto getPatientIdentifierType() {
		return patientIdentifierType;
	}
	/**
	 * @param patientIdentifierType the patientIdentifierType to set
	 */
	public void setPatientIdentifierType(
			PatientIdentifierTypeSpringDto patientIdentifierType) {
		this.patientIdentifierType = patientIdentifierType;
	}
	/**
	 * @return the preferred
	 */
	public Boolean getPreferred() {
		return preferred;
	}
	/**
	 * @param preferred the preferred to set
	 */
	public void setPreferred(Boolean preferred) {
		this.preferred = preferred;
	}
	/**
	 * @return the country
	 */
	public Integer getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Integer country) {
		this.country = country;
	}
	
}
