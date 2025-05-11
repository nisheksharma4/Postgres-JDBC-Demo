package com.jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:postgresql://localhost:5432/testdb";
        String user = "postgres";
        String password = "root";	
        
        try(Connection conn = DriverManager.getConnection(url, user, password)){
        	
        	System.out.println("Connected to the postgreSql successfully!");
        	
        	// create table
        	String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" + "id SERIAL PRIMARY KEY, " + "name VARCHAR(100), " + "email VARCHAR(100) UNIQUE)";
        	
        	Statement stmt = conn.createStatement();
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'users' created or already exists.");
            
         // Insert data
            String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?) ON CONFLICT DO NOTHING";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, "Nishek");
            pstmt.setString(2, "Nishek@google.com");
            pstmt.executeUpdate();
            System.out.println("Data inserted.");
            
         // Read data
            String selectSQL = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(selectSQL);
            System.out.println("User Records:");
            
            while (rs.next()) {
                System.out.printf("ID: %d, Name: %s, Email: %s%n", rs.getInt("id"), rs.getString("name"), rs.getString("email"));
            }

        	
        } catch (SQLException e) {
			// TODO Auto-generated catch block
        	System.out.println("Connection Failed!");
			e.printStackTrace();
			
		}
        
	}

}
