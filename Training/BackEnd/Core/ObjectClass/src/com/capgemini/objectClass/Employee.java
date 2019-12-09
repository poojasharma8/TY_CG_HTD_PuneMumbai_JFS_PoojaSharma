package com.capgemini.objectClass;

public class Employee {
	int id;
	String name ;
	Double Salary;
	char gender;
	
	public Employee(int id, String name, Double salary, char gender) {
	
		this.id = id;
		this.name = name;
		Salary = salary;
		this.gender = gender;
	}

	@Override
	public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", gender=" + gender + "]";
	}

}
