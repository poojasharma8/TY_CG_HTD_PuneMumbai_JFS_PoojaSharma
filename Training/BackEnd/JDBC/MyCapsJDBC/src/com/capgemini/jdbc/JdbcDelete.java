package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDelete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");
			System.out.println("****************");

			//Get Connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);

			//issue the connection via query
			String query = "delete from users_info where userid = ? ";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter userid ");
			pstmt.setInt(1, sc.nextInt());
			int count = pstmt.executeUpdate();

			//Process the Results
			if(count>0) {
				System.out.println("Data Deleted...");


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

