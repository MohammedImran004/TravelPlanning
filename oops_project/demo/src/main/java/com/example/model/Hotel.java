package com.example.model;

public class Hotel {
    private String name;
    private String Type;
    private String price_per_night;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }
    public String getPrice_per_night() {
        return price_per_night;
    }
    public void setPrice_per_night(String price_per_night) {
        this.price_per_night = price_per_night;
    }
    @Override
    public String toString() {
        return "Hotel [name=" + name + ", Type=" + Type + ", price_per_night=" + price_per_night + "]";
    }
}
