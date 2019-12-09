package com.capgemini.login.Factory;

import com.capgemini.login.Dao.UserDAOlogin;
import com.capgemini.login.Dao.UserDaologinImpl;

public class UserloginFactory {
private UserloginFactory() {
		
	}

	public static UserDAOlogin getInstance() {
		UserDAOlogin dao = new UserDaologinImpl();
		return dao;

}
