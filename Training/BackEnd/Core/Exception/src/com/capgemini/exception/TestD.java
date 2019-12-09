package com.capgemini.exception;

public class TestD {

	public static void main(String[] args) {

		System.out.println("Main Started");
		String s = "priya";
		int[] a= new int[3];
		try {
			System.out.println(s.toUpperCase());
			System.out.println(a[1]);
			System.out.println(10/0);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Dont cross array boundary");
		}
		
		catch(ArithmeticException e) {
			System.out.println("Don't divide by 0");
		}
		
		catch(NullPointerException e) {
			System.out.println("Don't deal with null"
					+ "");
		}
		
		catch(Exception e) {  //general catch block catches all types of exceptions
			System.out.println("Something went wrong");
		}
	
		System.out.println("Main Ended");
	}

}
