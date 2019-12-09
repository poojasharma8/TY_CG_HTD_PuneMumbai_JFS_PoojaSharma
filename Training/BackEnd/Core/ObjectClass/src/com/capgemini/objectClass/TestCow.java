package com.capgemini.objectClass;

public class TestCow {

	public static void main(String[] args) {

		Cow c = new Cow();
		c.id = 1;
		c.name = "ganga";
		
		Cow t = new Cow();
		t.id = 2;
		t.name = "pinga";
		
		Cow e = new Cow();
		e.id = 1;
		e.name = "ganga";
		
		boolean result = t.equals(c);
		System.out.println(result);
	}

}
