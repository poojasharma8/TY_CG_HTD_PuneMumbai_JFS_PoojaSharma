package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestN {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(1,"Pooja",78);
		Student s2 = new Student(2,"Pragya",70);
		Student s3 = new Student(3,"Anu",65);
		Student s4 = new Student(4,"Priya",60);
		Student s5 = new Student(5,"Ramya",50);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		
		for(int i= 0; i<5;i++) {
			Student s = al.get(i);
			
			System.out.println("Name is "+s.name);
			System.out.println("ID is "+s.id);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("*******************");
			
		}
		System.out.println("******************");
		for (Student s : al) {
			System.out.println(s);
		}
	}

}
