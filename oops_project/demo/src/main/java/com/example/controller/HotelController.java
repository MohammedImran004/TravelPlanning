package com.example.controller;

import java.util.List;
import java.util.Scanner;

import com.example.dao.HotelDAO;
import com.example.model.Hotel;

public class HotelController {
    private HotelDAO hotelDAO;
    private Scanner sc;

    public HotelController() {
        this.hotelDAO = new HotelDAO();
        this.sc = new Scanner(System.in);
    }

    public void addHotel() {
        System.out.print("Enter Hotel Name: ");
        String name = sc.next();
        System.out.print("Enter Location: ");
        String location = sc.next();
        System.out.print("Enter Rating (out of 5): ");
        double rating = sc.nextDouble();

        Hotel hotel = new Hotel(name, location, rating);
        if (hotelDAO.addHotel(hotel)) {
            System.out.println("Hotel added successfully!");
        } else {
            System.out.println("Failed to add hotel.");
        }
    }

    public void viewHotels() {
        List<Hotel> hotels = hotelDAO.getAllHotels();
        for (Hotel h : hotels) {
            System.out.println(h);
        }
    }

    public void updateHotel() {
        System.out.print("Enter Hotel ID to update: ");
        int id = sc.nextInt();
        Hotel hotel = hotelDAO.getHotelById(id);

        if (hotel != null) {
            System.out.print("Enter New Name (or press Enter to keep existing): ");
            String name = sc.next();
            System.out.print("Enter New Location (or press Enter to keep existing): ");
            String location = sc.next();
            System.out.print("Enter New Rating (or press Enter to keep existing): ");
            double rating = sc.nextDouble();

            if (!name.isEmpty()) hotel.setName(name);
            if (!location.isEmpty()) hotel.setLocation(location);
            if (rating > 0) hotel.setRating(rating);

            if (hotelDAO.updateHotel(hotel)) {
                System.out.println("Hotel updated successfully!");
            } else {
                System.out.println("Failed to update hotel.");
            }
        } else {
            System.out.println("Hotel not found!");
        }
    }

    public void deleteHotel() {
        System.out.print("Enter Hotel ID to delete: ");
        int id = sc.nextInt();
        if (hotelDAO.deleteHotel(id)) {
            System.out.println("Hotel deleted successfully!");
        } else {
            System.out.println("Failed to delete hotel.");
        }
    }
}
