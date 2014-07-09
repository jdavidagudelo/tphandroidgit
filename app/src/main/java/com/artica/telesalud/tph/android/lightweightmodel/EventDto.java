package com.artica.telesalud.tph.android.lightweightmodel;

import android.util.Log;

import com.artica.telesalud.tph.android.model.EventoSpringDto;
import com.j256.ormlite.field.DatabaseField;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.util.Date;

/**
 * Created by interoperabilidad on 21/05/14.
 */
public class EventDto {
    @DatabaseField(id = true)
    private Integer eventId;
    public static final String ESTADO_ACTIVO = "Activo";
    public static final String ESTADO_FINALIZADO = "Finalizado";
    @DatabaseField(index = true)
    private String direccion;
    @DatabaseField(index = true, foreign = true)
    private CityDto city;
    @DatabaseField()
    private String zone;
    @DatabaseField(index = true, foreign = true)
    private CausaAtencionDto causaAtencion;
    @DatabaseField()
    private String caseNumber;
    @DatabaseField()
    private Date callDate;
    @DatabaseField()
    private String state;
    @DatabaseField()
    private Date dateCreated;
    @DatabaseField()
    private Integer creator;
    @DatabaseField()
    private Boolean isSynchronized = Boolean.FALSE;

    public Boolean getIsSynchronized() {
        return isSynchronized;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public void setIsSynchronized(Boolean isSynchronized) {
        this.isSynchronized = isSynchronized;
    }

    public static final EventDto EMPTY_EVENT = new EventDto();
    public EventDto(EventoSpringDto evento) {
        this.callDate = evento.getFechaLlamada();
        this.caseNumber = evento.getNumeroCaso();
        this.causaAtencion = new CausaAtencionDto(evento.getCausaAtencion());
        this.city = new CityDto(evento.getCiudad());
        //this.dateCreated = evento.getDateCreated();
        this.direccion = evento.getDireccion();
        this.eventId = evento.getEventoId();
        this.state = evento.getEstado();
        this.zone = evento.getZona().getShortName();
        //this.creator = evento.getCreator();
        this.isSynchronized = Boolean.TRUE;
    }
    public String[] getParamKeys()
    {
        DateTime dateTime = new DateTime(callDate);
        DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
        String dateFormatted = fmt.print(dateTime);
        Log.e("My Tag: ", (city==null)+" "+(causaAtencion == null)+" "+(state==null)+" "+String.valueOf(city.getCityId())+" "+String.valueOf(causaAtencion.getConceptId()));
        return new String[]{
                direccion,
                String.valueOf(city.getCityId()),
                city.getName(),
                zone,
                String.valueOf(causaAtencion.getConceptId()),
                causaAtencion.getName(),
                city.getState().getName(),
                caseNumber, dateFormatted,
                String.valueOf(city.getState().getCountry().getName()),
                String.valueOf(creator)
        };
    }
    public EventDto() {
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public CityDto getCity() {
        return city;
    }

    public void setCity(CityDto city) {
        this.city = city;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public CausaAtencionDto getCausaAtencion() {
        return causaAtencion;
    }

    public void setCausaAtencion(CausaAtencionDto causaAtencion) {
        this.causaAtencion = causaAtencion;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCallDate() {
        return callDate;
    }

    public void setCallDate(Date callDate) {
        this.callDate = callDate;
    }


    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EventDto)) return false;

        EventDto eventDto = (EventDto) o;

        if (callDate != null ? !callDate.equals(eventDto.callDate) : eventDto.callDate != null)
            return false;
        if (caseNumber != null ? !caseNumber.equals(eventDto.caseNumber) : eventDto.caseNumber != null)
            return false;
        if (causaAtencion != null ? !causaAtencion.equals(eventDto.causaAtencion) : eventDto.causaAtencion != null)
            return false;
        if (city != null ? !city.equals(eventDto.city) : eventDto.city != null) return false;
        if (creator != null ? !creator.equals(eventDto.creator) : eventDto.creator != null)
            return false;
        if (dateCreated != null ? !dateCreated.equals(eventDto.dateCreated) : eventDto.dateCreated != null)
            return false;
        if (direccion != null ? !direccion.equals(eventDto.direccion) : eventDto.direccion != null)
            return false;
        if (eventId != null ? !eventId.equals(eventDto.eventId) : eventDto.eventId != null)
            return false;
        if (isSynchronized != null ? !isSynchronized.equals(eventDto.isSynchronized) : eventDto.isSynchronized != null)
            return false;
        if (state != null ? !state.equals(eventDto.state) : eventDto.state != null) return false;
        if (zone != null ? !zone.equals(eventDto.zone) : eventDto.zone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventId != null ? eventId.hashCode() : 0;
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (zone != null ? zone.hashCode() : 0);
        result = 31 * result + (causaAtencion != null ? causaAtencion.hashCode() : 0);
        result = 31 * result + (caseNumber != null ? caseNumber.hashCode() : 0);
        result = 31 * result + (callDate != null ? callDate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (isSynchronized != null ? isSynchronized.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "Número de caso: " + caseNumber + "\n" +
                "Dirección: " + direccion + "\n" +
                "Ciudad: " + city.getName() + " (" + city.getState().getName() + ")" + "\n" +
                "Causa: " + causaAtencion.getName() + "\n"+
                "Estado: "+state;
    }
}
