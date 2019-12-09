package com.capgemini.exception;

public class Pen {

	public static void main(String[] args) {

		System.out.println("Main started");
		try {
			System.out.println(10/3);
		}
		catch(ArithmeticException e) {
			System.out.println("Don't use 0 as denominator");
		}
		
		System.out.println("Main ended");	
		}

}
