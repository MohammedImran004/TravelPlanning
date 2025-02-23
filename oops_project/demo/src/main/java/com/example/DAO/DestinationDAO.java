package com.example.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Destination;

public class DestinationDAO {

    public boolean addDestination(Destination destination) {
        String query = "INSERT INTO destinations (name, description, location) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, destination.getName());
            ps.setString(2, destination.getDescription());
            ps.setString(3, destination.getLocation());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Destination> getAllDestinations() {
        List<Destination> destinations = new ArrayList<>();
        String query = "SELECT * FROM destinations";
        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                destinations.add(new Destination(
                    rs.getInt("id"), 
                    rs.getString("name"), 
                    rs.getString("description"), 
                    rs.getString("location")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return destinations;
    }

    public Destination getDestinationById(int id) {
        String query = "SELECT * FROM destinations WHERE id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Destination(
                    rs.getInt("id"), 
                    rs.getString("name"), 
                    rs.getString("description"), 
                    rs.getString("location"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean updateDestination(Destination destination) {
        String query = "UPDATE destinations SET name = ?, description = ?, location = ? WHERE id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, destination.getName());
            ps.setString(2, destination.getDescription());
            ps.setString(3, destination.getLocation());
            ps.setInt(4, destination.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteDestination(int id) {
        String query = "DELETE FROM destinations WHERE id = ?";
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
