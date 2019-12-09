package com.capgemini.JDBC.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.JDBC.bean.UserBean;

public class UserDAOJDBCimpl implements UserDAO{
	FileReader reader = null;
	Properties prop = null;
	UserBean user = null;
	ArrayList<UserBean>userlist = new ArrayList<UserBean>();

	public UserDAOJDBCimpl() {
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
	public UserBean getInfo(int userid) {

		try {

			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);

		}
		catch(Exception e){

			e.printStackTrace();
		}

		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"), prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query3")))
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

	@Override
	public UserBean userlogin(int userid, String password) {
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
			pstmt.setString(2, password);

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

	@Override
	public List<UserBean> getAllInfo() {
		try {

			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);

		}
		catch(Exception e){

			e.printStackTrace();
		}

		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"), prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query")))
		{
			while(rs.next()) 
			{
				user = new  UserBean();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				userlist.add(user);
			}
			return userlist;
		}	
		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
