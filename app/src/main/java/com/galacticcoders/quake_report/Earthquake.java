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

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /**
     * Create a new earthquake object
     * @param magnitude is the magnitude of the earthquake
     * @param location is the location of the earthquake
     * @param timeInMilliseconds is the time in miliseconds (from the Epoch) when the
     *                           earthquake happened.
     */
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * Get the magnitude of the earthquake
     */
    public String getMagnitude() { return mMagnitude; }

    /**
     * Get the location of the earthquake
     */
    public String getLocation() { return mLocation; }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


}
