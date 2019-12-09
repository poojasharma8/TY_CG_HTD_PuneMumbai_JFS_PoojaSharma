package com.capgemini.StudentExample;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper { // to receive ArrayList object

	void display(ArrayList<Student1> k) {

		for (Student1 s : k) {
			System.out.println("ID is : " + s.id);
			System.out.println("Name is " + s.name);
			System.out.println("Percentage is: " + s.percentage);
			System.out.println("*************************");

		}
	}

	void pass(ArrayList<Student1> p) {

		// System.out.println("Using Iterator");

		Iterator<Student1> it = p.iterator();
		while (it.hasNext()) {
			Student1 r = it.next();
			if (r.percentage > 50) {
				System.out.println("ID is : " + r.id);
				System.out.println("Name is " + r.name);
				System.out.println("Percentage is: " + r.percentage);
				System.out.println("*************************");
			}
		}

	}

	   void passDistinction(ArrayList<Student1> p) {
		Iterator<Student1> it = p.iterator();
		while (it.hasNext()) {
			Student1 v = it.next();
			if (v.percentage > 70) {
				System.out.println("ID is : " + v.id);
				System.out.println("Name is " + v.name);
				System.out.println("Percentage is: " + v.percentage);
				System.out.println("*************************");

			}

		}

	}
}
