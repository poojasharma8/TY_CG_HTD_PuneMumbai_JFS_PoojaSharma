package com.capgemini.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcUpdate {

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
				String dbUrl = "jdbc:mysql://localhost:3306/capg_db";
				System.out.println("Enter username");
				String user = sc.nextLine();
				System.out.println("Enter password");
				String password = sc.nextLine();
				
				conn = DriverManager.getConnection(dbUrl,user,password);

				//issue the connection via query
				String query = "Update users_info set email = ? where userid = ? AND password = ? ";
				pstmt = conn.prepareStatement(query);
				
				System.out.println("Enter userid");
				pstmt.setInt(1,sc.nextInt());
				
				System.out.println("Enter name ");
				pstmt.setString(2, sc.nextLine());
				
				System.out.println("Enter email");
				pstmt.setString(3, sc.nextLine());
				
				System.out.println("Enter password ");
				pstmt.setString(4,sc.nextLine());
				
				int count = pstmt.executeUpdate();

				//Process the Results
				if(count>0) {
					System.out.println("Data updated...");
				}
				else {
					System.out.println("something went wrong");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//close all JDBC objects
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


