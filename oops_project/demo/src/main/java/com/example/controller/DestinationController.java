package com.example.controller;

import java.util.List;
import java.util.Scanner;

import com.example.dao.DestinationDAO;
import com.example.model.Destination;

public class DestinationController {
    private DestinationDAO destinationDAO;
    private Scanner sc;

    public DestinationController() {
        this.destinationDAO = new DestinationDAO();
        this.sc = new Scanner(System.in);
    }

    public void viewDestinations() {
        List<Destination> destinations = destinationDAO.getAllDestinations();
        for (Destination d : destinations) {
            System.out.println(d);
        }
    }

    public void updateDestination() {
        System.out.print("Enter Destination ID to update: ");
        int id = sc.nextInt();
        Destination destination = destinationDAO.getDestinationById(id);

        if (destination != null) {
            System.out.print("Enter New Name (or press Enter to keep existing): ");
            String name = sc.nextLine();
            System.out.print("Enter New Location (or press Enter to keep existing): ");
            String location = sc.nextLine();
            System.out.print("Enter New Description (or press Enter to keep existing): ");
            String description = sc.nextLine();

            if (!name.isEmpty()) destination.setName(name);
            if (!location.isEmpty()) destination.setLocation(location);
            if (!description.isEmpty()) destination.setDescription(description);

            if (destinationDAO.updateDestination(destination)) {
                System.out.println("Destination updated successfully!");
            } else {
                System.out.println("Failed to update destination.");
            }
        } else {
            System.out.println("Destination not found!");
        }
    }

    public void deleteDestination() {
        System.out.print("Enter Destination ID to delete: ");
        int id = sc.nextInt();
        if (destinationDAO.deleteDestination(id)) {
            System.out.println("Destination deleted successfully!");
        } else {
            System.out.println("Failed to delete destination.");
        }
    }
}
