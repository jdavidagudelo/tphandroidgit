package com.artica.telesalud.tph.android.model;


public class PatientSpringDto {
	private Integer patientId;
	private PersonSpringDto person;
	private ConceptSpringDto maritalStatus;
	private String ocupation;
	private ConceptSpringDto userType;
	private ConceptSpringDto afiliateType;
	private ConceptSpringDto externalCause;
	private String momId;
	private String momName;
	private String dadId;
	private String dadName;
	private String responsableName;
	private String responsableFamily;
	private String responsablePhone;
	private String responsablePhone2;
	private String responsableKin;
	private Boolean hasAttendat;
	private String attendatName;
	private String attendatFamily;
	private String attendatPhone;
	private String attendatKin;
	private PatientIdentifierSpringDto preferredIdentifier;

	/**
	 * @return the patientId
	 */
	public Integer getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	/**
	 * @return the person
	 */
	public PersonSpringDto getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(PersonSpringDto person) {
		this.person = person;
	}
	/**
	 * @return the maritalStatus
	 */
	public ConceptSpringDto getMaritalStatus() {
		return maritalStatus;
	}
	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(ConceptSpringDto maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	/**
	 * @return the ocupation
	 */
	public String getOcupation() {
		return ocupation;
	}
	/**
	 * @param ocupation the ocupation to set
	 */
	public void setOcupation(String ocupation) {
		this.ocupation = ocupation;
	}
	/**
	 * @return the userType
	 */
	public ConceptSpringDto getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(ConceptSpringDto userType) {
		this.userType = userType;
	}
	/**
	 * @return the afiliateType
	 */
	public ConceptSpringDto getAfiliateType() {
		return afiliateType;
	}
	/**
	 * @param afiliateType the afiliateType to set
	 */
	public void setAfiliateType(ConceptSpringDto afiliateType) {
		this.afiliateType = afiliateType;
	}
	/**
	 * @return the externalCause
	 */
	public ConceptSpringDto getExternalCause() {
		return externalCause;
	}
	/**
	 * @param externalCause the externalCause to set
	 */
	public void setExternalCause(ConceptSpringDto externalCause) {
		this.externalCause = externalCause;
	}
	/**
	 * @return the momId
	 */
	public String getMomId() {
		return momId;
	}
	/**
	 * @param momId the momId to set
	 */
	public void setMomId(String momId) {
		this.momId = momId;
	}
	/**
	 * @return the momName
	 */
	public String getMomName() {
		return momName;
	}
	/**
	 * @param momName the momName to set
	 */
	public void setMomName(String momName) {
		this.momName = momName;
	}
	/**
	 * @return the dadId
	 */
	public String getDadId() {
		return dadId;
	}
	/**
	 * @param dadId the dadId to set
	 */
	public void setDadId(String dadId) {
		this.dadId = dadId;
	}
	/**
	 * @return the dadName
	 */
	public String getDadName() {
		return dadName;
	}
	/**
	 * @param dadName the dadName to set
	 */
	public void setDadName(String dadName) {
		this.dadName = dadName;
	}
	/**
	 * @return the responsableName
	 */
	public String getResponsableName() {
		return responsableName;
	}
	/**
	 * @param responsableName the responsableName to set
	 */
	public void setResponsableName(String responsableName) {
		this.responsableName = responsableName;
	}
	/**
	 * @return the responsableFamily
	 */
	public String getResponsableFamily() {
		return responsableFamily;
	}
	/**
	 * @param responsableFamily the responsableFamily to set
	 */
	public void setResponsableFamily(String responsableFamily) {
		this.responsableFamily = responsableFamily;
	}
	/**
	 * @return the responsablePhone
	 */
	public String getResponsablePhone() {
		return responsablePhone;
	}
	/**
	 * @param responsablePhone the responsablePhone to set
	 */
	public void setResponsablePhone(String responsablePhone) {
		this.responsablePhone = responsablePhone;
	}
	/**
	 * @return the responsablePhone2
	 */
	public String getResponsablePhone2() {
		return responsablePhone2;
	}
	/**
	 * @param responsablePhone2 the responsablePhone2 to set
	 */
	public void setResponsablePhone2(String responsablePhone2) {
		this.responsablePhone2 = responsablePhone2;
	}
	/**
	 * @return the responsableKin
	 */
	public String getResponsableKin() {
		return responsableKin;
	}
	/**
	 * @param responsableKin the responsableKin to set
	 */
	public void setResponsableKin(String responsableKin) {
		this.responsableKin = responsableKin;
	}
	/**
	 * @return the hasAttendat
	 */
	public Boolean getHasAttendat() {
		return hasAttendat;
	}
	/**
	 * @param hasAttendat the hasAttendat to set
	 */
	public void setHasAttendat(Boolean hasAttendat) {
		this.hasAttendat = hasAttendat;
	}
	/**
	 * @return the attendatName
	 */
	public String getAttendatName() {
		return attendatName;
	}
	/**
	 * @param attendatName the attendatName to set
	 */
	public void setAttendatName(String attendatName) {
		this.attendatName = attendatName;
	}
	/**
	 * @return the attendatFamily
	 */
	public String getAttendatFamily() {
		return attendatFamily;
	}
	/**
	 * @param attendatFamily the attendatFamily to set
	 */
	public void setAttendatFamily(String attendatFamily) {
		this.attendatFamily = attendatFamily;
	}
	/**
	 * @return the attendatPhone
	 */
	public String getAttendatPhone() {
		return attendatPhone;
	}
	/**
	 * @param attendatPhone the attendatPhone to set
	 */
	public void setAttendatPhone(String attendatPhone) {
		this.attendatPhone = attendatPhone;
	}
	/**
	 * @return the attendatKin
	 */
	public String getAttendatKin() {
		return attendatKin;
	}
	/**
	 * @param attendatKin the attendatKin to set
	 */
	public void setAttendatKin(String attendatKin) {
		this.attendatKin = attendatKin;
	}
	/**
	 * @return the preferredIdentifier
	 */
	public PatientIdentifierSpringDto getPreferredIdentifier() {
		return preferredIdentifier;
	}
	/**
	 * @param preferredIdentifier the preferredIdentifier to set
	 */
	public void setPreferredIdentifier(
			PatientIdentifierSpringDto preferredIdentifier) {
		this.preferredIdentifier = preferredIdentifier;
	}
	
}
