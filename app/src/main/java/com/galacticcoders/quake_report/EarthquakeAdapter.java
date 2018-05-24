package com.galacticcoders.quake_report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

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

        // Find the TextView in the earthquake_list_item.xml layout with the ID date_text_view
        TextView dateTextView = listIntemView.findViewById(R.id.date_text_view);
        // Get the magnitude from the currentEarthquake object and set this text on
        // the magnitude_text_view
        dateTextView.setText(currentEarthquake.getDate());


        return listIntemView;
    }
}
