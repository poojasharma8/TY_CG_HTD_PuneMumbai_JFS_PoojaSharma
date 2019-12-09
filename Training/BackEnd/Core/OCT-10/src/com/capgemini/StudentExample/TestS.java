package com.capgemini.StudentExample;

import java.util.ArrayList;


public class TestS {

	public static void main(String[] args) {


		ArrayList<Student1> al = new ArrayList<Student1>();
		
		Student1 s1 = new Student1(1,"Pooja",78.0);
		Student1 s2 = new Student1(2,"Pragya",70.55);
		Student1 s3 = new Student1(3,"Anu",35.9);
		Student1 s4 = new Student1(4,"Priya",60.22);
		Student1 s5 = new Student1(5,"Ramya",40.5);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
	
		Helper h = new Helper() ;
		h.display(al);
		h.pass(al);
		h.passDistinction(al);
	}
	

}
