package com.capgemini.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableExample {

	public static void main(String[] args) {
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		CallableStatement cstmt = null;
		ResultSet rs = null;

		try {
			//Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");
			System.out.println("****************");

			//Get the connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db";
			System.out.println("Enter the user and password ");
			String user = sc.nextLine();
			String password = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl,user,password);
			System.out.println("Connection Estd...");
			System.out.println("****************");

			//Issue SQL query
			String query = "call getAllInfo() ";
			cstmt = conn.prepareCall(query);
			boolean b = cstmt.execute();

			if(b) {
				rs = cstmt.getResultSet();
				while(rs.next()) {
					System.out.println("Userid :"+rs.getInt(1));
					System.out.println("Username :"+rs.getString(2));
					System.out.println("Email :"+rs.getString(3));
					System.out.println("password :"+rs.getString(4));
					System.out.println("*********************");
				}
			}
			else {
				int count = cstmt.getUpdateCount();
				if (count>0) {
					System.out.println("Operation Successfull...");
				}
				else {
					System.out.println("Operation Failed...");
				}
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
			if (cstmt != null) {
				try {
					cstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			sc.close();
		}
	}
}


