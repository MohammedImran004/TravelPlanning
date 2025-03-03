package com.example.controller;

import java.util.List;
import java.util.Scanner;

import com.example.dao.BookingDAO;
import com.example.model.Booking;
import com.example.view.BookingView;

public class BookingController {
    private BookingDAO bookingDAO;
    private BookingView bookingView;
    private Scanner sc;

    public BookingController() {
        this.bookingDAO = new BookingDAO();
        this.bookingView = new BookingView();
        this.sc = new Scanner(System.in);
    }
    public void viewBookings() {
        List<Booking> bookings = bookingDAO.getAllBookings();
        bookingView.displayBookings(bookings);
    }

    public void updateBooking() {
        System.out.print("Enter Booking ID to update: ");
        int bookingId = sc.nextInt();
        System.out.print("Enter new Hotel ID: ");
        int newHotelId = sc.nextInt();
        System.out.print("Enter new Booking Date (YYYY-MM-DD): ");
        String newDate = sc.next();

        if (bookingDAO.updateBooking(bookingId, newHotelId, newDate)) {
            System.out.println("Booking updated successfully!");
        } else {
            System.out.println("Failed to update booking.");
        }
    }

    public void deleteBooking() {
        System.out.print("Enter Booking ID to delete: ");
        int bookingId = sc.nextInt();

        if (bookingDAO.deleteBooking(bookingId)) {
            System.out.println("Booking deleted successfully!");
        } else {
            System.out.println("Failed to delete booking.");
        }
    }
}
