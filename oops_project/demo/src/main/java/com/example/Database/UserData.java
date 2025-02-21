package com.example.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserData {
      public void saveLoginDetails(String email, String password) {
        String query = "INSERT INTO USERS (email, password) VALUES (?,?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
             stmt.setString(1,email);
             stmt.setString(2,password);
             stmt.executeUpdate();
             System.out.println("Login details saved successfully.");
        } catch (SQLException e) {
            System.err.println("Error saving login details!");
            e.printStackTrace();
        }
    }
    public boolean validateLogin(String email,String password){
        String query="Select password from users where email=?";
        try(Connection connection = DatabaseConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(query)){
                stmt.setString(1,email);
                ResultSet rs = stmt.executeQuery();
                if(rs.next()){
                    String pass = rs.getString("password");
                    if(pass.equals(password)){
                        return true;
                    }
                }else{
                    return false;
                }
        }catch(SQLException e){
            System.err.println("Error validating login details!");
            e.printStackTrace();
        }
        return false;
    }
    public void saveUserDetails(String email,String password,String name,String age,String address,String phone,int members){
        String query = "INSERT INTO USERS (email,password,name,age,address,phone,members) VALUES (?,?,?,?,?,?,?)";
        try(Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1, email);       // Set email value
            stmt.setString(2, password);    // Set password value
            stmt.setString(3, name);        // Set name value
            stmt.setString(4, age);         // Set age value
            stmt.setString(5, address);     // Set address value
            stmt.setString(6, phone);       // Set phone value
            stmt.setInt(7, members);        // Set members value
            stmt.executeUpdate();
                System.out.println("User details saved successfully.");
                }catch(SQLException e){
                    System.err.println("Error saving user details!");
                    e.printStackTrace();
                }
        }  
    }

