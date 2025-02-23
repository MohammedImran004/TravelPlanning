package com.example.model;

public class Hotel {
    private int id;
    private String name;
    private String location;
    private double rating;

    // Constructor for adding a new hotel (without ID)
    public Hotel(String name, String location, double rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    // Constructor for retrieving/updating hotel (with ID)
    public Hotel(int id, String name, String location, double rating) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Hotel [ID=" + id + ", Name=" + name + ", Location=" + location + ", Rating=" + rating + "]";
    }
}
