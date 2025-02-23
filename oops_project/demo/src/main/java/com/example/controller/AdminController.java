package com.example.controller;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;
import com.example.controller.*;
import com.example.dao.AdminDAO;
import com.example.model.Admin;
import com.example.view.AdminView;
public class AdminController {
    private AdminDAO adminDAO;
    private AdminView adminView;
    private DestinationController destinationController;
    private HotelController hotelController;
    private UserController userController;
    private BookingController bookingController;
    private Scanner sc;
    // Default constructor
    public AdminController() {
        this.sc = new Scanner(System.in);
        this.adminView = new AdminView();
        this.adminDAO = new AdminDAO();
        this.destinationController = new DestinationController();
        this.hotelController = new HotelController();
        this.userController = new UserController();
        this.bookingController = new BookingController();
    }


    // Admin login
    public void login() {
        System.out.print("Enter Email: ");
        String email = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();

        if (adminView.validateEmail(email) && adminView.validatePassword(password)) {
            Admin admin = adminDAO.getAdminByEmail(email, password);
            if (admin != null) {
                System.out.println("Login successful! Welcome, " + admin.getName());

                while (true) {
                    adminView.displayMenu();
                    System.out.print("Enter your choice: ");
                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1: destinationController.addDestination(); break;
                        case 2: destinationController.viewDestinations(); break;
                        case 3: destinationController.updateDestination(); break;
                        case 4: destinationController.deleteDestination(); break;
                        // case 5: userController.addUser(); break;
                        // case 6: userController.viewUsers(); break;
                        // case 7: userController.updateUser(); break;
                        // case 8: userController.deleteUser(); break;
                        case 9: addAdmin(); break;
                        case 10: viewAdmins(); break;
                        case 11: updateAdmin(); break;
                        case 12: deleteAdmin(); break;
                        case 13: hotelController.addHotel(); break;
                        case 14: hotelController.viewHotels(); break;
                        case 15: hotelController.updateHotel(); break;
                        case 16: hotelController.deleteHotel(); break;
                        case 17: bookingController.addBooking(); break;
                        case 18: bookingController.viewBookings(); break;
                        case 19: bookingController.updateBooking(); break;
                        case 20: bookingController.deleteBooking(); break;
                        case 21: System.out.println("Exiting system..."); return;
                        default: System.out.println("Invalid choice. Please try again.");
                    }
                }
            } else {
                System.out.println("Invalid credentials! Please sign up.");
                signup();
            }
        } else {
            System.out.println("Invalid email or password format!");
        }
    }

    // Admin signup
    public void signup() {
        System.out.println("===== Admin Signup =====");
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Email: ");
        String email = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();

        if (adminView.validateEmail(email) && adminView.validatePassword(password)) {
            Admin admin = new Admin(name, email, password);
            if (adminDAO.addAdmin(admin)) {
                System.out.println("Admin signup successful! Please log in.");
            } else {
                System.out.println("Signup failed. Email may already exist.");
            }
        } else {
            System.out.println("Invalid email or password format!");
        }
    }

    // Add an admin
    public void addAdmin() {
        System.out.println("===== Add New Admin =====");
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Email: ");
        String email = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();

        if (adminView.validateEmail(email) && adminView.validatePassword(password)) {
            Admin admin = new Admin(name, email, password);
            if (adminDAO.addAdmin(admin)) {
                System.out.println("Admin added successfully!");
            } else {
                System.out.println("Failed to add admin. Email may already exist.");
            }
        } else {
            System.out.println("Invalid email or password format!");
        }
    }

    // View all admins
    public void viewAdmins() {
        List<Admin> admins = adminDAO.getAllAdmins();
        adminView.displayAdmins(admins);
    }

    // Update an admin
    public void updateAdmin() {
        System.out.print("Enter Admin ID to update: ");
        int id = sc.nextInt();

        Admin admin = adminDAO.getAdminById(id);
        if (admin != null) {
            System.out.print("Enter New Name (or press Enter to keep existing: " + admin.getName() + "): ");
            String name = sc.next();
            System.out.print("Enter New Email (or press Enter to keep existing: " + admin.getEmail() + "): ");
            String email = sc.next();
            System.out.print("Enter New Password (or press Enter to keep existing password): ");
            String password = sc.next();

            if (name.isEmpty()) name = admin.getName();
            if (email.isEmpty()) email = admin.getEmail();
            if (password.isEmpty()) password = admin.getPassword();

            Admin updatedAdmin = new Admin(name, email, password);
            if (adminDAO.updateAdmin(updatedAdmin)) {
                System.out.println("Admin updated successfully!");
            } else {
                System.out.println("Failed to update admin.");
            }
        } else {
            System.out.println("Admin not found!");
        }
    }

    // Delete an admin
    public void deleteAdmin() {
        System.out.print("Enter Admin ID to delete: ");
        int id = sc.nextInt();
        if (adminDAO.deleteAdmin(id)) {
            System.out.println("Admin deleted successfully!");
        } else {
            System.out.println("Failed to delete admin.");
        }
    }
}
