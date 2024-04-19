package com.example.hw5;

public class Location {
    String name;
    double longitude;
    double latitude;
    int imageResource;
    public Location(String name, double latitude, double longitude, int imageResource){
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imageResource = imageResource;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getName(){
        return name;
    }
    public int getImageResource() {
        return imageResource;
    }
}
