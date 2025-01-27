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
}
