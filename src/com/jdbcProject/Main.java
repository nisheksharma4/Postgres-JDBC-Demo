package com.jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:postgresql://localhost:5432/testdb";
        String user = "postgres";
        String password = "root";	
        
        try(Connection conn = DriverManager.getConnection(url, user, password)){
        	
        	System.out.println("Connected to the postgreSql successfully!");
        	
        } catch (SQLException e) {
			// TODO Auto-generated catch block
        	System.out.println("Connection Failed!");
			e.printStackTrace();
			
		}
        
	}

}
