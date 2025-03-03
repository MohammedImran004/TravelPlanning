package com.example;

import java.util.Scanner;

import com.example.controller.AdminController;
import com.example.controller.UserController;
import com.example.model.Admin;
import com.example.model.User;
import com.example.view.AdminView;

public class App {
    private int role;
    private Scanner sc;
    private AdminController adminController;
    private UserController userController;

    // Constructor
    public App(int role) {
        this.sc = new Scanner(System.in);
        this.role = role;
        this.adminController = new AdminController(); // Initializing AdminController
        this.userController = new UserController(); // Initializing UserController
    }

    public void run() {
        Admin admin = new Admin();
        User user = new User();
        AdminView adminView = new AdminView();
        // UserView userView = new UserView();

        if (role == 1) {
            System.out.println("Enter 1 for Admin login And 2 for Admin Signup");
            int adc = sc.nextInt();
            if (adc == 1) {
                adminController.login();
            } else {
                adminController.signup();
            }
        } else if (role == 2) {
            System.out.println("Enter 1 for User login And 2 for User Signup");
            int adc = sc.nextInt();
            if (adc == 1) {
                userController.login();
            } else {
                userController.signup();
            }
        } else {
            System.out.println("Invalid choice. Exiting...");
        }
    }
}
