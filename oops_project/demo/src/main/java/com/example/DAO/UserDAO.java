package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.model.Booking;
import com.example.model.User;
public class UserDAO {
    private Connection connection;
    public UserDAO(){
        this.connection = DBConnection.getConnection();
    }
    public User getbyUsername(String Username){
        User user = null;
        try {
            String query = "Select user_id,email,password from user where email= ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, Username);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                user = new User(rs.getInt("user_id"),rs.getString("email"),rs.getString("password"));
            }
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    public boolean SignupUser(User user){
        try {
            String query = "Insert into user(email,password,name) values (?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1,user.getEmail());
            stmt.setString(2,user.getPassword());
            stmt.setString(3,user.getName());
            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean addBooking(Booking booking){
        try {
            String query = "Insert into booking(user_id,destination_id,hotel_id,travel_mode,members,booking_date) values (?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1,booking.getUserId());
            stmt.setInt(2,booking.getDestinationId());
            stmt.setInt(3,booking.getHotelId());
            stmt.setString(4,booking.getTravelMode());
            stmt.setInt(5,booking.getMembers());
            stmt.setString(6,booking.getBookingDate());
            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
