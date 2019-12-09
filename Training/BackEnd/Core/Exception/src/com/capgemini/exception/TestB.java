package com.capgemini.exception;

public class TestB {

	public static void main(String[] args) {

		System.out.println("Main Started");
		
		try {
		System.out.println("Hello");
		System.out.println(10/0);
		System.out.println("hi");
		System.out.println("Good Morning");
		}
		
		catch(ArithmeticException e) {
			System.out.println("Can't have 0 as denominator");
		}
		
		System.out.println("Main Ended");

	}

}
