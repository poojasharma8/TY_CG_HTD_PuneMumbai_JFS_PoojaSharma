package com.capgemini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBCRetrival {

	public static void main(String[] args) {
		FileReader reader = null;
		Properties prop = null;

		try {
			//load Driver
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("Driver Loaded....");
			System.out.println("**********************");


		}
		catch(Exception e){
			e.printStackTrace();
		}

		//Make Connection
		try(Connection conn = DriverManager.getConnection
				(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query"))){

			System.out.println("Connection Estd...");
			System.out.println("**********************");

			while (rs.next()) {
				System.out.println("User id : "+rs.getInt(1));
				System.out.println("User name : "+rs.getString(2));
				System.out.println("Email : "+rs.getString(3));
				//System.out.println("Password : "+rs.getString(4)); (Sensitive info)
				System.out.println("-------------------------------");
			}
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}

}

