package com.example;
import com.example.controller.AdminController;
import com.example.model.Admin;
import com.example.model.User;
import com.example.view.AdminView;
public class App {
    private int role;
    public App(int role) {
        this.role = role;
    }

    public void run() {
        Admin admin = new Admin();
        User user = new User();

        AdminView adminView = new AdminView();
        // UserView userView = new UserView();
        AdminController adminController = new AdminController();
        // UserController userController = new UserController();
        if (role == 1) {
            adminController.login();
        } else if (role == 2) {
            // userController.login();
        } else {
            System.out.println("Invalid choice. Exiting...");
        }
    }
}
