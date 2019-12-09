package com.capgemini.exception.custom;

public class TestAmout {

	public static void main(String[] args) {
		Amount a = new Amount();
		try {
			a.check(50000);
			System.out.println("Collect Cash");
			
		}
		
		catch(InvalidLimitException e) { 
			System.err.println(e.getMessage());
		
		}
	}
}
