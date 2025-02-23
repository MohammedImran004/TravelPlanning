package com.example.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'addAdmin'");
	}
    public List<Admin> getAllAdmins() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAdmins'");
    }
    public Admin getAdminById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAdminById'");
    }
    public boolean updateAdmin(Admin updatedAdmin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAdmin'");
    }
    public boolean deleteAdmin(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAdmin'");
    }
}
