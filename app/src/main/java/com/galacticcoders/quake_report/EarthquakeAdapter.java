package com.galacticcoders.quake_report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * {@link EarthquakeAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Earthquake} objects.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    /**
     * Create a new {@link EarthquakeAdapter} object.
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param earthquakes is the list of {@link Earthquake}s to be displayed.
     */
    public EarthquakeAdapter (Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
                // Check if an existing view is being reused, otherwise inflate the view
        View listIntemView = convertView;
        if (listIntemView == null) {
            listIntemView = LayoutInflater.from(getContext()).inflate(
                    android.R.layout.simple_list_item_1, parent, false);
        }

        // Get the {@link Earthquake} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID


        return listIntemView;
    }
}
