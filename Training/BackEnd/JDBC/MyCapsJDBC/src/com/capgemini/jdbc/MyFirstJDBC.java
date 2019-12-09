package com.capgemini.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class MyFirstJDBC {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Connection conn =  null;
		Statement stmt =   null;
		ResultSet rs =     null;


		try {
			//load the driver
			java.sql.Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Loaded...");
			System.out.println("*******************");

			// get the DB connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("Connection Established...");
			System.out.println("*******************");

			//Issue SQL Query via Connection
			String query = "Select * from users_info ";
			stmt = conn.createStatement(); 
			rs = stmt.executeQuery(query);		

			//Process the results returned by SQL Query
			while(rs.next()) {
				System.out.println("USER ID : "+rs.getInt(1));
				System.out.println("USER NAME : "+rs.getString("username"));
				System.out.println("EMAIL : "+rs.getString(3));
				System.out.println("PASSWORD: " +rs.getString("password"));
				System.out.println("***********************");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			
			//close the JDBC objects
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {		
					e.printStackTrace();
				}
			}
		}
	}
}

