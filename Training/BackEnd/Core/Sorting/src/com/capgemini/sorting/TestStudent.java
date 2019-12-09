package com.capgemini.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestStudent {

	public static void main(String[] args) {

		ArrayList<Student2> al = new ArrayList<Student2>();
		Student2 S1 = new Student2(1, "Priya" , 65.4);
		Student2 S2 = new Student2(5, "Anil" , 42.3);
		Student2 S3 = new Student2(3, "Dinesh", 51.6);
		Student2 S4 = new Student2(2, "Raju" , 76.8);
		
		al.add(S1);
		al.add(S2);
		al.add(S3);
		al.add(S4);
		
		Collections.sort(al);
		 
		Iterator<Student2> it = al.iterator();
		while(it.hasNext()) {
			Student2 s = it.next();
			System.out.println("Name is :"+s.name);
			System.out.println("ID is :"+s.id);
			System.out.println("Percentage is : "+ s.percentage);
			System.out.println("--------------------------------");
		}
		
		
		
	}

}
