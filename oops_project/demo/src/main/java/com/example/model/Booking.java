package com.example.model;

public class Booking {
    private int bookingId;
    private int userId;
    private int destinationId;
    private int hotelId;
    private String travelMode;
    private int members;
    private String bookingDate;

    // Constructor without bookingId (for inserting new records)
    public Booking(int userId, int destinationId, int hotelId, String travelMode, int members, String bookingDate) {
        this.userId = userId;
        this.destinationId = destinationId;
        this.hotelId = hotelId;
        this.travelMode = travelMode;
        this.members = members;
        this.bookingDate = bookingDate;
    }

    // Constructor with bookingId (for updating/retrieving records)
    public Booking(int bookingId, int userId, int destinationId, int hotelId, String travelMode, int members, String bookingDate) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.destinationId = destinationId;
        this.hotelId = hotelId;
        this.travelMode = travelMode;
        this.members = members;
        this.bookingDate = bookingDate;
    }

    public Booking(int userId2, int hotelId2, String bookingDate2) {
        //TODO Auto-generated constructor stub
    }

    public Booking(int int1, int int2, int int3, String string) {
        //TODO Auto-generated constructor stub
    }

    // Getters and Setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(String travelMode) {
        this.travelMode = travelMode;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", userId=" + userId +
                ", destinationId=" + destinationId +
                ", hotelId=" + hotelId +
                ", travelMode='" + travelMode + '\'' +
                ", members=" + members +
                ", bookingDate='" + bookingDate + '\'' +
                '}';
    }
}
