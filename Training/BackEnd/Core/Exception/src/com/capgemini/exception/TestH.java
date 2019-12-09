package com.capgemini.exception;

import java.io.IOException;

public class TestH {

	public static void main(String[] args) throws IOException{

	System.out.println("Main Started");
	String s = null;
	int a[] = new int[3];
	try {
	System.out.println(10/2);
	System.out.println(a[1 ]);
	System.out.println(s.length());
	

	}
	catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
		e.printStackTrace();
	}
	
	
	System.out.println("Main ended");
	
	}

}
