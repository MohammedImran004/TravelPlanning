package com.example.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DestinationData {
    public void destinationDetails(String name,String Description,String local_sightseeeing,String fooddetails){
        String query = "INSERT INTO destinations (name,description,local_sightseeing,food_details,customer_reviews) VALUES (?,?,?,?,?)"; 
        try(Connection conn = DatabaseConnection.getConnection();){
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, Description);
            pstmt.setString(3, local_sightseeeing);
            pstmt.setString(4, fooddetails);
            pstmt.executeUpdate();
            System.out.println("Destination details saved successfully.");
        }
        catch(SQLException e){
            System.err.println("Error saving destination details!");
            e.printStackTrace();
        }
    }
        public void addReviews(String name,String review){
            String query = "INSERT INTO DESTINATIONS (customer_reviews) values (?) where name=?";
            try(Connection conn = DatabaseConnection.getConnection();){
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, review);
                pstmt.setString(2, name);
                pstmt.executeUpdate();
                System.out.println("Review added successfully.");
            }
            catch(SQLException e){
                System.err.println("Error adding review!");
                e.printStackTrace();
            }                 
        }
        public void getReviews(String name){
            String query = "SELECT customer_reviews from destinations where name=?";
            try(Connection conn = DatabaseConnection.getConnection();){
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, name);
                ResultSet rs = pstmt.executeQuery();
                System.out.println("Reviews:");
                while(rs.next()){
                    System.out.println(rs.getString("customer_reviews"));
                }
            }
            catch(SQLException e){
                System.err.println("Error viewing reviews!");
                e.printStackTrace();
            }
        }
       public void viewDestinationDetails(String name, String packageName) {
    String query = "SELECT * FROM destinations WHERE name = ? AND package_type = ?";
    
    try (Connection conn = DatabaseConnection.getConnection()) {
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, name);
        pstmt.setString(2, packageName);

        ResultSet rs = pstmt.executeQuery();

        boolean found = false; 
        while (rs.next()) {
            found = true;
            System.out.println("Destination Details:");
            // Print the details from the result set (adjust column names as needed)
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Package Type: " + rs.getString("package_type"));
            System.out.println("Cost: " + rs.getDouble("PRICE"));
            System.out.println("LocalSightseeing " + rs.getString("local_sightseeing"));
            System.out.println("food: " + rs.getString("food_details"));
            // Add other fields as necessary based on your database schema
            System.out.println("-------------------------");
        }

        // If no records were found, display a message
        if (!found) {
            System.out.println("No destination found with the specified name and package type.");
        }

    } catch (SQLException e) {
        System.err.println("Error viewing destination details!");
        e.printStackTrace();
    }
}

    
}
