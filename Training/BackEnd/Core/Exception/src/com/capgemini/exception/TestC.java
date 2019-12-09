package com.capgemini.exception;

public class TestC {

	public static void main(String[] args) {

		System.out.println("Main Started");

		int [] a = new int[3];

		try {
			System.out.println(a[1]);	
			System.out.println(10/0);
			}
		
		catch(ArithmeticException e) { //multiple catch blocks for 1 try block
			System.out.println("Dont divide by 0");
		}
			catch(ArrayIndexOutOfBoundsException E) {

				System.out.println("Dont cross array boundary");
		}

			System.out.println("Main Ended");

		}

}
