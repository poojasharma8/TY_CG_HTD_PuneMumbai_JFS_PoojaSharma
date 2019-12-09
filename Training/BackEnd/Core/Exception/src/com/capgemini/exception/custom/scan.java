package com.capgemini.exception.custom;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){ //to avoid warnings try resource is used
		
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		System.out.println("Age is :"+age);
		}
		
	}

}
