package com.artica.telesalud.tph.android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import com.artica.telesalud.tph.android.R;
import com.artica.telesalud.tph.android.activity.ListEventsActivity;
import com.artica.telesalud.tph.android.lightweightmodel.EventDto;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by interoperabilidad on 27/05/14.
 */
public class EventArrayAdapter extends ArrayAdapter<EventDto> {

    private EventFilter eventFilter;
    @Override
    public Filter getFilter() {

        if(eventFilter == null)
        {
            eventFilter = new EventFilter(events, this, context);
        }
        return eventFilter;
    }



    private List<EventDto> events = new ArrayList<EventDto>();
    private final Context context;
    public EventArrayAdapter(Context context, List<EventDto> events) {
        super(context, R.layout.event_row, events);
        this.events.addAll(events);
        this.context = context;
    }
    private String getDateFormatted(Date date)
    {
        DateTime dateTime = new DateTime(date);
        DateTimeFormatter dtf = DateTimeFormat.forPattern(context.getString(R.string.date_time_format));
        return dtf.print(dateTime);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.event_row, parent, false);
            TextView textViewState = (TextView) rowView.findViewById(R.id.textViewStateEventList);
            TextView textViewCaseNumber = (TextView) rowView.findViewById(R.id.textViewCaseNumberEventList);
            TextView textViewAddress = (TextView) rowView.findViewById(R.id.textViewAddressEventList);
            TextView textViewCity = (TextView) rowView.findViewById(R.id.textViewCityEventList);
            TextView textViewCause = (TextView) rowView.findViewById(R.id.textViewCauseEventList);
            TextView textViewDate = (TextView) rowView.findViewById(R.id.textViewDateEventList);
            EventDto event = getItem(position);
            textViewState.setText(textViewState.getText() + event.getState());
            textViewCaseNumber.setText(textViewCaseNumber.getText() + event.getCaseNumber());
            textViewCity.setText(textViewCity.getText() + event.getCity().getName()+" ("+event.getCity().getState().getName()+")");
            textViewAddress.setText(textViewAddress.getText() + event.getDireccion());
            textViewCause.setText(textViewCause.getText() + event.getCausaAtencion().getName());
            textViewDate.setText(textViewDate.getText() + getDateFormatted(event.getCallDate()));
            return rowView;
    }


}
