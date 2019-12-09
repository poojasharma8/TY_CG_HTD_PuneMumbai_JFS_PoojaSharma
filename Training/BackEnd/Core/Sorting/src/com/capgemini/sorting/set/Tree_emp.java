package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_emp  {

	public static void main(String[] args) {

		TreeSet<Employee> t = new TreeSet<Employee>();
		Employee e1 = new Employee(2,"Rahul",15000);
		Employee e2 = new Employee(4,"Reema",20000);
		Employee e3 = new Employee(5,"Meena",30000);
		Employee e4 = new Employee(1,"Ramya",35000);
		Employee e5 = new Employee(3,"Priya",40000);
		Employee e6 = new Employee(6,"Ramya",35000);

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);

		Iterator<Employee> i = t.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println("ID is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salaray is "+e.salary);
			System.out.println("*********************");

		}
		
	}

}
