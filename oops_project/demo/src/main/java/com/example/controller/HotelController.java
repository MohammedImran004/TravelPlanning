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

    // Add a new hotel
    public void addHotel() {
        System.out.print("Enter Hotel Name: ");
        String name = sc.next();
        System.out.print("Enter Hotel Type: ");
        String type = sc.next();

        Hotel hotel = new Hotel(0, name, type); // Assuming ID is auto-generated
        if (hotelDAO.addHotel(hotel)) {
            System.out.println("Hotel added successfully!");
        } else {
            System.out.println("Failed to add hotel.");
        }
    }

    // View all hotels
    public void viewHotels() {
        List<Hotel> hotels = hotelDAO.getAllHotels();
        if (hotels.isEmpty()) {
            System.out.println("No hotels available.");
        } else {
            for (Hotel h : hotels) {
                System.out.println(h);
            }
        }
    }

    // Update an existing hotel
    public void updateHotel() {
        System.out.print("Enter Hotel ID to update: ");
        int id = sc.nextInt();
        Hotel hotel = hotelDAO.getHotelById(id);

        if (hotel != null) {
            System.out.print("Enter New Name (or press Enter to keep existing): ");
            sc.nextLine(); // Consume the newline character
            String name = sc.nextLine();

            System.out.print("Enter New Type (or press Enter to keep existing): ");
            String type = sc.nextLine();

            if (!name.isEmpty()) hotel.setName(name);
            if (!type.isEmpty()) hotel.setType(type);

            if (hotelDAO.updateHotel(hotel)) {
                System.out.println("Hotel updated successfully!");
            } else {
                System.out.println("Failed to update hotel.");
            }
        } else {
            System.out.println("Hotel not found!");
        }
    }

    // Delete a hotel
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
