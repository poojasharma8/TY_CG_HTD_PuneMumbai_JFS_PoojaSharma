package com.capgemini.objectClass;

public class TestA {

	public static void main(String[] args) {

		Pen p = new Pen();
		int add = p.hashCode();
		System.out.println("address is  "+add);
		 
		Pen s = new Pen();
		int add1 = s.hashCode();
		System.out.println("address is  "+add1);
	}

}
