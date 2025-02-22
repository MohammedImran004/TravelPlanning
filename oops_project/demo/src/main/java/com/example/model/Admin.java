package com.example.model;

import com.example.controller.AdminController;
import com.example.view.AdminView;

public class Admin {
    AdminController adminController;
    AdminView adminView;
    private String name;
    private String email;
    private String password;
    public Admin(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public String getName() {
        if(adminView.getName(name)){
            return name;
        }
        else{
            return "Invalid Name";
        }
    }
    public void getEmail(email){
        if(adminView.getEmail(email)){
            return email;
        }
        else{
            return "Invalid Email";
        }
    }
    public void getPassword(password){
        if(adminView.getPassword(email,password)){
            return password;
        }
        else{
            return "Invalid Password";
        }
    }
    public void setEmailAndPassWord(String email,String password) {
        adminController.setEmailAndPassword(email,password);
    }
    @Override
    public String toString() {
        return "Admin [name=" + name + ", email=" + email + "]";
    }
}
