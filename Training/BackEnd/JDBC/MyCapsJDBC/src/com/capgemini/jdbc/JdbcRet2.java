package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcRet2 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");
			System.out.println("*****************");

			//Getting the connection 
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("Connection established...");
			System.out.println("*****************");


			//Issue SQL query via Connection
			String query = "INSERT INTO users_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter userid: ");
			pstmt.setInt(1 , Integer.parseInt(sc.nextLine()));
			System.out.println("Enter username: ");
			pstmt.setString(2, sc.nextLine());
			System.out.println("Enter email: ");
			pstmt.setString(3, sc.nextLine());
			System.out.println("Enter password: ");
			pstmt.setString(4, sc.nextLine());
			 
			int count = pstmt.executeUpdate();
			
			//Process the Results
			if(count>0) {
				System.out.println("Data Inserted...");

				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(conn != null ) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		sc.close();
		}
	}

}
