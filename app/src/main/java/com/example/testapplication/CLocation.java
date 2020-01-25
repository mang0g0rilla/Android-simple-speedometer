package com.example.testapplication;

import android.location.Location;

public class CLocation extends Location {
    private boolean bUserMetricsUnits = false;

    public CLocation(Location location){
        this(location, true);
    }

    public CLocation(Location location, boolean bUserMetricsUnits){
        super(location);
        this.bUserMetricsUnits = bUserMetricsUnits;
    }

    public boolean getUseMetrics(){
        return this.bUserMetricsUnits;
    }

    public void setUserMetricsUnits(boolean bUserMetricsUnits){
        this.bUserMetricsUnits = bUserMetricsUnits;
    }

    @Override
    public float distanceTo(Location dest) {
        float nDistance = super.distanceTo(dest);

        if(!this.getUseMetrics()){
//            Convert metrics to feet
            nDistance = nDistance * 3.2808398f;
        }

        return nDistance;
    }

    @Override
    public double getAltitude() {
        double nAltitude = super.getAltitude();

        if(!this.getUseMetrics()){
//            Convert metrics to feet
            nAltitude = nAltitude * 3.2808398d;
        }

        return nAltitude;
    }

    @Override
    public float getSpeed() {
        float nSpeed = super.getSpeed();

        if(!this.getUseMetrics()){
//            Convert meters/second to miles/hour
            nSpeed = nSpeed * 2.23693629f;
        }

        return nSpeed;
    }

    @Override
    public float getAccuracy() {
        float nAccuracy = super.getAccuracy();

        if(!this.getUseMetrics()){
//            Convert metrics to feet
            nAccuracy = nAccuracy * 3.2808398f;
        }

        return nAccuracy;
    }
}
