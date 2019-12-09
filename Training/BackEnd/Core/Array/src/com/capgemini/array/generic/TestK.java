package com.capgemini.array.generic;

import java.util.Scanner;

public class TestK {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println(" Enter the name : ");
		String name = sc.nextLine();
		
		System.out.println(" Enter the age : ");
		String age = sc.nextLine();
		
		
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		
		sc.close();
	}
}