package com.capgemini.JDBC.Controller;

import java.util.Scanner;


import com.capgemini.JDBC.Factory.UserFactory;
import com.capgemini.JDBC.bean.UserBean;
import com.capgemini.JDBC.dao.UserDAO;

public class GetInfo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		System.out.println("Enter the UserId...");
		UserBean user = dao.getInfo(sc.nextInt());
		if(user!=null) {
			System.out.println(user);
		}
		else {
			System.out.println("something went wrong....");
		}
		sc.close();
	}

}
