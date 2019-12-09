package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcRetrieval {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		ResultSet rs = null;
		try {

			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");
			System.out.println("*****************");

			//Getting the connection 
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("Connection established...");
			System.out.println("*****************");

			//Issue SQL query via Connection
			String query = "select * from users_info where userid = ?";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter the User Id: ");
			pstmt.setInt(1, sc.nextInt());
			rs = pstmt.executeQuery();

			//Process the results
			if(rs.next()) {
				System.out.println("User is: "+rs.getInt(1));
				System.out.println("User Name: "+rs.getString(2));
				System.out.println("User Email: "+rs.getString(3));
				System.out.println("Password: "+rs.getString(4));

			}
			else {
				System.out.println("Somthing went wrong");
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(conn != null ) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

				if(rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {		
						e.printStackTrace();
					}
				}

				if(pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {		
						e.printStackTrace();
					}
				}
			}
		}
	}
}


