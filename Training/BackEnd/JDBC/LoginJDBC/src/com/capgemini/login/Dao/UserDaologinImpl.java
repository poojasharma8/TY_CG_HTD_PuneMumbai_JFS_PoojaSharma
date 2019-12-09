package com.capgemini.login.Dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.capgemini.login.UserBean2;


public class UserDaologinImpl {
	
	FileReader reader = null;
	Properties prop = null;
	UserBean2 user = null;

	public UserDaologinImpl() {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public UserBean2 getInfo(int userid) {

		try {

			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);

		}
		catch(Exception e){

			e.printStackTrace();
		}

		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"), prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2")))
		{
			pstmt.setInt(1, userid);
			try(ResultSet rs = pstmt.executeQuery()){

				if(rs.next()) 
				{
					user = new  UserBean();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));				
				}
				return user;
			}		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}
}
