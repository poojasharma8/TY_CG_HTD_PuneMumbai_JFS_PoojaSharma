package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExa {

	public static void main(String[] args) {

		HashSet<Employee> h1 = new HashSet<Employee>();

		Employee e1 = new Employee(1,"Rahul",15000);
		Employee e2 = new Employee(2,"Reema",20000);
		Employee e3 = new Employee(3,"Meena",30000);
		Employee e4 = new Employee(4,"Ramya",35000);
		Employee e5 = new Employee(5,"Priya",40000);
		Employee e6 = new Employee(4,"Ramya",35000);

		h1.add(e1);
		h1.add(e2);
		h1.add(e3);
		h1.add(e4);
		h1.add(e5);
		h1.add(e6);

		Iterator<Employee> i = h1.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println("ID is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salaray is "+e.salary);
			System.out.println("*********************");


		}

	}

}
