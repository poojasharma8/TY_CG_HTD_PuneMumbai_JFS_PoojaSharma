package com.capgemini.bean;

public class Database {
	void receive(Student t) {
		System.out.println("*****I AM A DATABASE*******");
		System.out.println("Name is "+ t.getName());
		System.out.println("ID is "+t.getId());
		System.out.println("Height is "+t.getHeight());
	}
	void receive(Employee e) {
		System.out.println("*****I AM A DATABASE*******");
		System.out.println("Name is "+ e.getName());
		System.out.println("ID is "+e.getId());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("Department is "+e.getDepartment());
		System.out.println("Role is "+e.getRole());
	}
}