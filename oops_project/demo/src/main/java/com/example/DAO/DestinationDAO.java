package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Destination;

public class DestinationDAO {

    public boolean addDestination(Destination destination) {
        String query = "INSERT INTO destination (name, description, location) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, destination.getName());
            ps.setString(3, destination.getLocation());
            ps.setString(2, destination.getDescription());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Destination> getAllDestinations() {
        List<Destination> destinations = new ArrayList<>();
        String query = "SELECT * FROM destination";
        try (Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    int id = rs.getInt("destination_id");
                    String name = rs.getString("name");
                    String location = rs.getString("location");
                    String description = rs.getString("description");
                    // System.out.println("Retrieved: ID=" + id + ", Name=" + name + "Location="+location+", Description=" + description);
                destinations.add(new Destination(
                    rs.getInt("destination_id"), 
                    rs.getString("name"), 
                    rs.getString("location"),
                    rs.getString("description")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return destinations;
    }

    public Destination getDestinationById(int id) {
        String query = "SELECT * FROM destination WHERE destination_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Destination(
                    rs.getInt("destination_id"), 
                    rs.getString("name"), 
                    rs.getString("location"),
                    rs.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean updateDestination(Destination destination) {
        String query = "UPDATE destination SET name = ?, description = ?, location = ? WHERE destination_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(4, destination.getId());
            ps.setString(1, destination.getName());
            ps.setString(3, destination.getLocation());
            ps.setString(2, destination.getDescription());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteDestination(int id) {
        String query = "DELETE FROM destination WHERE destination_id = ?";
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
