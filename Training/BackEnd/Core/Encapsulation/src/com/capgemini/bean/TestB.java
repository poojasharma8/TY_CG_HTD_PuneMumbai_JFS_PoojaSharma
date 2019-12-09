package com.capgemini.bean;

public class TestB {

	public static void main(String[] args) {

		Employee s = new Employee();
		s.setId(1);
		s.setName("pooja");
		s.setSalary(30000);
		s.setRole("developer");
		s.setDepartment("D");
		
		Database d2  = new  Database();
		d2.receive(s);
	}

}
