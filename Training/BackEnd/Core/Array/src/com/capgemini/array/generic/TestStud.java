package com.capgemini.array.generic;

public class TestStud {
	public static void main(String[] args) {
		
		Student[] s = new Student[4];
		Student s1= new Student(1 , "Pragya", 81);
		Student s2= new Student(2 , "Priya", 82);
		Student s3= new Student(3 , "Pooja", 85);
		Student s4= new Student(4 , "Pritha", 80.2);
		
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		
		receive(s);
	}

	static void receive (Student [] m ) {
	for (Student a : m) { 

			System.out.println(a.id);
			System.out.println(a.name);
			System.out.println(a.percentage);
			System.out.println("..................");
			
		}

	}
}
