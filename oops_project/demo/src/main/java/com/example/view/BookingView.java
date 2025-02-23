package com.example.view;

import java.util.List;
import java.util.Scanner;

import com.example.model.Booking;

public class BookingView {
    private Scanner scanner;

    public BookingView() {
        this.scanner = new Scanner(System.in);
    }

    
    // Get booking details from user
    public Booking getBookingDetails() {
        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter Destination ID: ");
        int destinationId = scanner.nextInt();
        System.out.print("Enter Hotel ID: ");
        int hotelId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Travel Mode (Flight/Train/Bus): ");
        String travelMode = scanner.nextLine();
        System.out.print("Enter Number of Members: ");
        int members = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Booking Date (YYYY-MM-DD): ");
        String bookingDate = scanner.nextLine();

        return new Booking(userId, destinationId, hotelId, travelMode, members, bookingDate);
    }

    // Get Booking ID from User
    public int getBookingId() {
        System.out.print("Enter Booking ID: ");
        return scanner.nextInt();
    }

    // Display Booking Details
    public void displayBooking(Booking booking) {
        if (booking == null) {
            System.out.println("Booking not found!");
        } else {
            System.out.println("\n===== Booking Details =====");
            System.out.println("Booking ID: " + booking.getBookingId());
            System.out.println("User ID: " + booking.getUserId());
            System.out.println("Destination ID: " + booking.getDestinationId());
            System.out.println("Hotel ID: " + booking.getHotelId());
            System.out.println("Travel Mode: " + booking.getTravelMode());
            System.out.println("Members: " + booking.getMembers());
            System.out.println("Booking Date: " + booking.getBookingDate());
        }
    }

    // Display all bookings
    public void displayAllBookings(List<Booking> bookings) {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            System.out.println("\n===== All Bookings =====");
            for (Booking booking : bookings) {
                displayBooking(booking);
                System.out.println("--------------------------");
            }
        }
    }

    // Get Updated Booking Details
    public Booking updateBooking(Booking existingBooking) {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new Travel Mode (or press Enter to keep existing: " + existingBooking.getTravelMode() + "): ");
        String travelMode = scanner.nextLine();
        System.out.print("Enter new Number of Members (or -1 to keep existing: " + existingBooking.getMembers() + "): ");
        int members = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new Booking Date (YYYY-MM-DD) (or press Enter to keep existing: " + existingBooking.getBookingDate() + "): ");
        String bookingDate = scanner.nextLine();

        // Keep existing values if no input provided
        if (travelMode.isEmpty()) travelMode = existingBooking.getTravelMode();
        if (members == -1) members = existingBooking.getMembers();
        if (bookingDate.isEmpty()) bookingDate = existingBooking.getBookingDate();

        return new Booking(
            existingBooking.getBookingId(),
            existingBooking.getUserId(),
            existingBooking.getDestinationId(),
            existingBooking.getHotelId(),
            travelMode,
            members,
            bookingDate
        );
    }

    // Display success or failure message
    public void showMessage(String message) {
        System.out.println(message);
    }


	public void displayBookings(List<Booking> bookings) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'displayBookings'");
	}
}
