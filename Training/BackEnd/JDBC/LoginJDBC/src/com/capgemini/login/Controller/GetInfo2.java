package com.capgemini.login.Controller;

import java.util.Scanner;



public class GetInfo2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		UserDAOlogin dao = UseloginFactory.getInstance();
		System.out.println("Enter the UserId...");
		UserBean2 user = dao.getInfo(sc.nextInt());
		 if(user!=null) {
			 System.out.println(user);
		 }
		 else {
			 System.out.println("something went wrong....");
		 }
		 sc.close();
	}

}
