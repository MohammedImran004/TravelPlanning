package com.example.controller;

import com.example.model.Admin;
import com.example.view.AdminView;

public class AdminController {
    AdminView view;
    Admin admin;
    AdminController(Admin admin,AdminView view){
        this.view = view;
        this.admin = admin;
    }
    public void login(String email,String Password){
        if(admin.getEmail().equals(email),admin.getPassword().equalsPassword())){

        }
    }
    public void loginflow(){
        System.out.print("Enter Email: ");
        String email = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();
        
        boolean loggedIn = login(email, password);
        if (loggedIn) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials!");
        }
    }
}
