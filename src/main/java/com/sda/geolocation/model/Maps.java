package com.sda.geolocation.model;

public class Maps {
    private double lat;
    private double lng;

    public Maps() {
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Maps{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
