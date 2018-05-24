package com.galacticcoders.quake_report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * {@link EarthquakeAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Earthquake} objects.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    /**
     * Create a new {@link EarthquakeAdapter} object.
     *
     * @param context     is the current context (i.e. Activity) that the adapter is being created in.
     * @param earthquakes is the list of {@link Earthquake}s to be displayed.
     */
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listIntemView = convertView;
        if (listIntemView == null) {
            listIntemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Get the {@link Earthquake} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the earthquake_list_item.xml layout with the ID magnitude_text_view
        TextView magnitudeTextView = listIntemView.findViewById(R.id.magnitude_text_view);
        // Get the magnitude from the currentEarthquake object and set this text on
        // the magnitude_text_view
        magnitudeTextView.setText(currentEarthquake.getMagnitude());

        // Find the TextView in the earthquake_list_item.xml layout with the ID location_text_view
        TextView locationTextView = listIntemView.findViewById(R.id.location_text_view);
        // Get the magnitude from the currentEarthquake object and set this text on
        // the magnitude_text_view
        locationTextView.setText(currentEarthquake.getLocation());

        // Create a new Date object from the time in milliseconds of the earthquake
        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());

        // Find the TextView with the view ID date_text_view
        TextView dateView = (TextView) listIntemView.findViewById(R.id.date_text_view);
        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);
        // Display the date of the current earthquake in that TextView
        dateView.setText(formattedDate);

        // Find the TextView with the ID time_text_view
        TextView timeView = (TextView) listIntemView.findViewById(R.id.time_text_view);
        // Format the time string (i.e. "4:30PM")
        String formattedTime = formatDate(dateObject);
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);


        return listIntemView;
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
