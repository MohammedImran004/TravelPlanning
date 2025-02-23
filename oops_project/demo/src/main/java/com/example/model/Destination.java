package com.example.model;

public class Destination {
    private int id;
    private String name;
    private String description;
    private  String location;
    // Constructor for adding a new destination (without ID)
    public Destination(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Constructor for retrieving/updating destination (with ID)
    public Destination(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Destination(String name2, String location2, String description2) {
        //TODO Auto-generated constructor stub
    }

    public Destination(int int1, String string, String string2, String string3) {
        //TODO Auto-generated constructor stub
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Destination [ID=" + id + ", Name=" + name + ", Description=" + description + "]";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
