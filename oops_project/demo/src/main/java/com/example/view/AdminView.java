package com.example.view;

import java.util.List;

import com.example.model.Admin;

public class AdminView {
    public void displayMenu() {
        System.out.println("1. Add Destination");
        System.out.println("2. View Destinations");
        System.out.println("3. Update Destinations");
        System.out.println("4. Delete Destinations");
        System.out.println("5. Add User");
        System.out.println("6. View Users");
        System.out.println("7. Update Users");
        System.out.println("8. Delete Users");
        System.out.println("9. Add Admin");
        System.out.println("10. View Admins");
        System.out.println("11. Update Admins");
        System.out.println("12. Delete Admins");
        System.out.println("13. Add Hotel");
        System.out.println("14. View Hotels");
        System.out.println("15. Update Hotel");
        System.out.println("16. Delete Hotel");
        System.out.println("17. Add Booking");
        System.out.println("18. View Bookings");
        System.out.println("19. Update Booking");
        System.out.println("20. Delete Booking");
        System.out.println("21. Exit");
    }

    public boolean validateEmail(String email) {
        return email != null && email.contains("@");
    }

    public boolean validatePassword(String password) {
        return password != null && password.length() >= 5;
    }

    public boolean validateName(String name) {
        return name != null && !name.isEmpty();
    }

    public void displayAdmins(List<Admin> admins) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayAdmins'");
    }
}
