package com.example.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AdminData {
    public boolean validateAdminLogin(String email, String password) {
        String query = "SELECT password FROM admin WHERE email=?";
         try(Connection conn = DatabaseConnection.getConnection();){
              PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, email);
                ResultSet rs = pstmt.executeQuery();
                if(rs.next()){
                    String pass = rs.getString("password");
                    if(pass.equals(password)){
                        return true;
                    }
                }
            }catch(SQLException e){
                System.err.println("Error validating admin login details!");
                e.printStackTrace();
            }
            return false;
        }
}
