package com.example.model;
public class Destination {
    private int id;
    private String name;
    private String description;
    private String location;

    // Constructor with all fields
    public Destination(int id, String name, String location, String description) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
    }

    // Constructor without id (for cases where ID is auto-generated)
    public Destination(String name, String location, String destination) {
        this.name = name;
        this.location = location;
        this.description = description;
    }

    // Default constructor (optional)
    public Destination() {
    }

    // Getters and Setters (optional but recommended)
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Destination [id=" + id + ", name=" + name + ", description=" + description + ", location=" + location
                + "]";
    }
    
}
