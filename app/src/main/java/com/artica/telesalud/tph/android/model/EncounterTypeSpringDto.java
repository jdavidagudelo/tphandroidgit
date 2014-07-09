package com.artica.telesalud.tph.android.model;



public class EncounterTypeSpringDto {
	private Integer encounterTypeId;
	private String name;
	private String description;

	/**
	 * @return the encounterTypeId
	 */
	public Integer getEncounterTypeId() {
		return encounterTypeId;
	}
	/**
	 * @param encounterTypeId the encounterTypeId to set
	 */
	public void setEncounterTypeId(Integer encounterTypeId) {
		this.encounterTypeId = encounterTypeId;
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
