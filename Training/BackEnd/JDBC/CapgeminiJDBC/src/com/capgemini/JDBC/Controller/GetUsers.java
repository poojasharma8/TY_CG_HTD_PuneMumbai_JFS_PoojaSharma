package com.capgemini.JDBC.Controller;

import java.util.List;

import com.capgemini.JDBC.Factory.UserFactory;
import com.capgemini.JDBC.bean.UserBean;
import com.capgemini.JDBC.dao.UserDAO;

public class GetUsers {


	public static void main(String[] args) 
	{
		UserDAO dao = UserFactory.getInstance();
		List<UserBean> userList =dao.getAllInfo();
		if(userList!=null) {

			for(UserBean user : userList) {
				System.out.println(user);
			}

		}
		else {
			System.out.println("something went wrong.....");
		}
	}


}

