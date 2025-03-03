package com.example.model;
public class Hotel {
    private int id;
    private String name;
    private String type;

    // Constructor to fetch using destination ID
    public Hotel(int id) {
        this.id = id;
    }

    // Constructor to fetch all hotels
    public Hotel(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    public Hotel(String name, String type) {
        this.name = name;
        this.type = type;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hotel {ID=" + id + ", Name='" + name + "', Type='" + type + "'}";
    }
}
