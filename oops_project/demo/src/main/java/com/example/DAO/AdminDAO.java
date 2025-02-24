package com.example.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Admin;

public class AdminDAO {
    private Connection connection;

    public AdminDAO(){
        this.connection = DBConnection.getConnection();
    }

    public Admin getAdminByEmail(String email, String password) {
        Admin admin = null;
        try {
            String query = "SELECT name, email, password FROM admin WHERE email = ? AND password = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                admin = new Admin(rs.getString("name"), rs.getString("email"), rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admin;
    }

    public boolean registerAdmin(Admin admin) {
        try {
            String query = "INSERT INTO admin (name, email, password) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, admin.getName());
            stmt.setString(2, admin.getEmail());
            stmt.setString(3, admin.getPassword());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0; // True if successful
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addAdmin(Admin admin) {
        return registerAdmin(admin);
    }

    public List<Admin> getAllAdmins() {
        List<Admin> admins = new ArrayList<>();
        try {
            String query = "SELECT id, name, email, password FROM admin";
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                admins.add(new Admin(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("password")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admins;
    }

    public Admin getAdminById(int id) {
        Admin admin = null;
        try {
            String query = "SELECT id, name, email, password FROM admin WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                admin = new Admin(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admin;
    }

    public boolean updateAdmin(Admin updatedAdmin) {
        try {
            String query = "UPDATE admin SET name = ?, email = ?, password = ? WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, updatedAdmin.getName());
            stmt.setString(2, updatedAdmin.getEmail());
            stmt.setString(3, updatedAdmin.getPassword());
            stmt.setInt(4, updatedAdmin.getId());
            System.out.println("id"+updatedAdmin.getId());
            int rowsUpdated = stmt.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteAdmin(int id) {
        try {
            String query = "DELETE FROM admin WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
