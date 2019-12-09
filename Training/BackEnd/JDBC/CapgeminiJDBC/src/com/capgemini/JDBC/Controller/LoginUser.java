package com.capgemini.JDBC.Controller;

import java.util.Scanner;

import com.capgemini.JDBC.Factory.UserFactory;
import com.capgemini.JDBC.bean.UserBean;
import com.capgemini.JDBC.dao.UserDAO;

public class LoginUser {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		System.out.println("Enter UserId..");
		int userid = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Password..");
		String password = sc.nextLine();
		UserBean user = dao.userlogin(userid, password);
		if(user!=null) {
			System.out.println(user);
		}
		else {
			System.out.println("something went wrong....");
		}
		sc.close();
	}

}
