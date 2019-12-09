package com.capgemini.exception;

public class TestA {

	public static void main(String[] args) {

		System.out.println("Main Started");
		int [] a = new int [3];
		
		try {
		System.out.println(a[7]);

		}
		
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Don't cross array boundary");
		}
		
		System.out.println("Main Ended");
	}

}
