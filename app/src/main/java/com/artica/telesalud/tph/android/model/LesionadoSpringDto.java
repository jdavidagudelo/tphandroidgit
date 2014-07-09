package com.artica.telesalud.tph.android.model;


public class LesionadoSpringDto {
	private Integer lesionadoId;
	private EncounterSpringDto encuentro;
	private EventoSpringDto evento;
	private TripulacionSpringDto tripulacion;
	private ConceptSpringDto resultado;
	private ConceptSpringDto dispositivoTransporte;
	private Boolean niegaAtencion;
	private ConceptSpringDto tipoNegacion;
	private String observacionNegacion;
	private HospitalSpringDto entidadRecepcion;
	private String recibidoPor;
	private String registroRecibe;
	private ConceptSpringDto eps;
	private ConceptSpringDto aseguradora;
	private ConceptSpringDto planBeneficios;
	private Boolean solicitaTeleasistencia;



	/**
	 * @return the lesionadoId
	 */
	public Integer getLesionadoId() {
		return lesionadoId;
	}

	/**
	 * @param lesionadoId
	 *            the lesionadoId to set
	 */
	public void setLesionadoId(Integer lesionadoId) {
		this.lesionadoId = lesionadoId;
	}

	/**
	 * @return the encuentro
	 */
	public EncounterSpringDto getEncuentro() {
		return encuentro;
	}

	/**
	 * @param encuentro
	 *            the encuentro to set
	 */
	public void setEncuentro(EncounterSpringDto encuentro) {
		this.encuentro = encuentro;
	}

	/**
	 * @return the evento
	 */
	public EventoSpringDto getEvento() {
		return evento;
	}

	/**
	 * @param evento
	 *            the evento to set
	 */
	public void setEvento(EventoSpringDto evento) {
		this.evento = evento;
	}

	/**
	 * @return the tripulacion
	 */
	public TripulacionSpringDto getTripulacion() {
		return tripulacion;
	}

	/**
	 * @param tripulacion
	 *            the tripulacion to set
	 */
	public void setTripulacion(TripulacionSpringDto tripulacion) {
		this.tripulacion = tripulacion;
	}

	/**
	 * @return the resultado
	 */
	public ConceptSpringDto getResultado() {
		return resultado;
	}

	/**
	 * @param resultado
	 *            the resultado to set
	 */
	public void setResultado(ConceptSpringDto resultado) {
		this.resultado = resultado;
	}

	/**
	 * @return the dispositivoTransporte
	 */
	public ConceptSpringDto getDispositivoTransporte() {
		return dispositivoTransporte;
	}

	/**
	 * @param dispositivoTransporte
	 *            the dispositivoTransporte to set
	 */
	public void setDispositivoTransporte(ConceptSpringDto dispositivoTransporte) {
		this.dispositivoTransporte = dispositivoTransporte;
	}

	/**
	 * @return the niegaAtencion
	 */
	public Boolean getNiegaAtencion() {
		return niegaAtencion;
	}

	/**
	 * @param niegaAtencion
	 *            the niegaAtencion to set
	 */
	public void setNiegaAtencion(Boolean niegaAtencion) {
		this.niegaAtencion = niegaAtencion;
	}

	/**
	 * @return the tipoNegacion
	 */
	public ConceptSpringDto getTipoNegacion() {
		return tipoNegacion;
	}

	/**
	 * @param tipoNegacion
	 *            the tipoNegacion to set
	 */
	public void setTipoNegacion(ConceptSpringDto tipoNegacion) {
		this.tipoNegacion = tipoNegacion;
	}

	/**
	 * @return the observacionNegacion
	 */
	public String getObservacionNegacion() {
		return observacionNegacion;
	}

	/**
	 * @param observacionNegacion
	 *            the observacionNegacion to set
	 */
	public void setObservacionNegacion(String observacionNegacion) {
		this.observacionNegacion = observacionNegacion;
	}

	/**
	 * @return the entidadRecepcion
	 */
	public HospitalSpringDto getEntidadRecepcion() {
		return entidadRecepcion;
	}

	/**
	 * @param entidadRecepcion
	 *            the entidadRecepcion to set
	 */
	public void setEntidadRecepcion(HospitalSpringDto entidadRecepcion) {
		this.entidadRecepcion = entidadRecepcion;
	}

	/**
	 * @return the recibidoPor
	 */
	public String getRecibidoPor() {
		return recibidoPor;
	}

	/**
	 * @param recibidoPor
	 *            the recibidoPor to set
	 */
	public void setRecibidoPor(String recibidoPor) {
		this.recibidoPor = recibidoPor;
	}

	/**
	 * @return the registroRecibe
	 */
	public String getRegistroRecibe() {
		return registroRecibe;
	}

	/**
	 * @param registroRecibe
	 *            the registroRecibe to set
	 */
	public void setRegistroRecibe(String registroRecibe) {
		this.registroRecibe = registroRecibe;
	}

	/**
	 * @return the eps
	 */
	public ConceptSpringDto getEps() {
		return eps;
	}

	/**
	 * @param eps
	 *            the eps to set
	 */
	public void setEps(ConceptSpringDto eps) {
		this.eps = eps;
	}

	/**
	 * @return the aseguradora
	 */
	public ConceptSpringDto getAseguradora() {
		return aseguradora;
	}

	/**
	 * @param aseguradora
	 *            the aseguradora to set
	 */
	public void setAseguradora(ConceptSpringDto aseguradora) {
		this.aseguradora = aseguradora;
	}

	/**
	 * @return the planBeneficios
	 */
	public ConceptSpringDto getPlanBeneficios() {
		return planBeneficios;
	}

	/**
	 * @param planBeneficios
	 *            the planBeneficios to set
	 */
	public void setPlanBeneficios(ConceptSpringDto planBeneficios) {
		this.planBeneficios = planBeneficios;
	}

	/**
	 * @return the solicitaTeleasistencia
	 */
	public Boolean getSolicitaTeleasistencia() {
		return solicitaTeleasistencia;
	}

	/**
	 * @param solicitaTeleasistencia
	 *            the solicitaTeleasistencia to set
	 */
	public void setSolicitaTeleasistencia(Boolean solicitaTeleasistencia) {
		this.solicitaTeleasistencia = solicitaTeleasistencia;
	}

}
