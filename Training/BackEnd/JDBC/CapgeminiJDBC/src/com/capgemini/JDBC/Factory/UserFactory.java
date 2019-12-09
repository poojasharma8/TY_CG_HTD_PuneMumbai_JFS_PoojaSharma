package com.capgemini.JDBC.Factory;

import com.capgemini.JDBC.dao.UserDAO;
import com.capgemini.JDBC.dao.UserDAOJDBCimpl;

public class UserFactory {
	
	private UserFactory() {
		
	}

	public static UserDAO getInstance() {
		UserDAO dao = new UserDAOJDBCimpl();
		return dao;
	}
}
