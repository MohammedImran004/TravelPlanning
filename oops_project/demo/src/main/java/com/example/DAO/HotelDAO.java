package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Hotel;

public class HotelDAO {
    public List<Hotel> getAllHotels() {
        List<Hotel> hotels = new ArrayList<>();
        String query = "SELECT * FROM hotel";
        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                hotels.add(new Hotel(rs.getInt("hotel_id"), rs.getString("name"), rs.getString("type")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hotels;
    }

    // Get hotel by ID
    public Hotel getHotelById(int id) {
        String query = "SELECT * FROM hotel WHERE id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Hotel(rs.getInt("hotel_id"), rs.getString("name"), rs.getString("type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Hotel> getHotelByDestinationId(int id) {
        List<Hotel> hotels = new ArrayList<>();
        String query = "SELECT * FROM hotel WHERE destination_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
             ps.setInt(1, id);
             ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                hotels.add(new Hotel(rs.getInt("hotel_id"), rs.getString("name"), rs.getString("type")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hotels;
    }
    public boolean updateHotel(Hotel hotel) {
        String query = "UPDATE hotel SET name = ?, type = ? WHERE hotel_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, hotel.getName());
            ps.setString(2, hotel.getType());
            ps.setInt(3, hotel.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteHotel(int id) {
        String query = "DELETE FROM hotel WHERE hotel_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
