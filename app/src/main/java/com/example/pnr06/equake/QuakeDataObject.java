package com.example.pnr06.equake;

/**
 * Created by PNR06 on 11/18/2017.
 */

public class QuakeDataObject {
    private String location;
    private String magnitude;
    private String description;

    public QuakeDataObject(String magnitude, String location, String description) {
        this.location = magnitude;
        this.magnitude = magnitude;
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
