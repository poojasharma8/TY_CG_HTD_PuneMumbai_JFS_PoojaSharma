package com.capgemini.objectClass;

public class TestProd {

	public static void main(String[] args) {

		Product a = new Product();
		a.id = 1;
		a.name = "pooja";
		a.type = "high";
		a.cost = 25.5;
		a.brand = "lg";
		
		Product b = new Product();
		b.id = 1;
		b.name = "pooja";
		b.type = "high";
		b.cost = 25.5;
		b.brand = "lg";
		
		boolean result = a.equals(b);
		System.out.println(result);
	}

}
