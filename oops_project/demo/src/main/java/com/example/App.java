package com.example;

import com.example.controller.AdminController;
import com.example.controller.UserController;
import com.example.model.Admin;
import com.example.model.User;
import com.example.view.AdminView;
import com.example.view.UserView;

public class App {
    private int role;

    public App(int role) {
        this.role = role;
    }

    public void run() {
        Admin admin = new Admin();
        User user = new User();

        AdminView adminView = new AdminView();
        UserView userView = new UserView();

        AdminController adminController = new AdminController(admin, adminView);
        UserController userController = new UserController(user, userView);

        if (role == 1) {
            adminController.handleAdminActions();
        } else if (role == 2) {
            userController.handleUserActions();
        } else {
            System.out.println("Invalid choice. Exiting...");
        }
    }
}
