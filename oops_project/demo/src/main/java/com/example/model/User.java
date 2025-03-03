package com.example.model;

public class User {
    private int id;  // Added ID field
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;

    // Constructor for login (email & password)
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Default constructor
    public User() {
    }

    // Constructor with all fields including ID
    public User(int id, String name, String email, String password, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    // Constructor without ID (for new users before insertion)
    public User(String name, String email, String password, String phone, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    // Constructor for ID, name, and email
    public User(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public User(String name2, String email2, String password2) {
        //TODO Auto-generated constructor stub
    }

    // Getter & Setter for ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter & Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter & Setter for Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter & Setter for Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter & Setter for Phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter & Setter for Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + 
               ", phone=" + phone + ", address=" + address + "]";
    }
}
