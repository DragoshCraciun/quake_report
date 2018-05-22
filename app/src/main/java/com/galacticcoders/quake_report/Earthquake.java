package com.galacticcoders.quake_report;

/**
 * {@link Earthquake} represents information about earthquake
 * It contains a magnitude, a location and a date.
 */

public class Earthquake {

    /**
     * Magnitude of the earthquake
     */
    private String mMagnitude;

    /**
     * Location of the earthquake
     */
    private String mLocation;

    /**
     * Date of the earthquake
     */
    private String mDate;

    /**
     * Create a new earthquake object
     * @param magnitude is the magnitude of the earthquake
     * @param location is the location of the earthquake
     * @param date is the date of the earthquake
     */
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Get the magnitude of the earthquake
     */
    public String getmagnitude() { return mMagnitude; }

    /**
     * Get the location of the earthquake
     */
    public String getLocation() { return mLocation; }

    /**
     * Get the date of the earthquake
     */
    public String getDate() { return mDate; }


}
