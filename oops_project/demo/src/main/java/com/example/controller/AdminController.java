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
    public void login(){
        if(view.loginDetails(admin.getEmail(),admin.getPassword())){

        }
    }
}
