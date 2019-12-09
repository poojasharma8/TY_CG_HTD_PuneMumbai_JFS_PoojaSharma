package com.capgemini.bean;

public class TestA {

	public static void main(String[] args) {

		Student s = new Student();
		s.setId(1);
		s.setName("pooja");
		s.setHeight(5.10);
		
		Database d1  = new  Database();
		d1.receive(s);
	}

}
