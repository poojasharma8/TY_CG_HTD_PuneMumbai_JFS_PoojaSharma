package com.capgemini.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestManyToMany {

	public static void main(String[] args) {

		Course course = new Course();
		course.setCid(3);
		course.setCname("JAVA3");

		Course course1 = new Course();
		course1.setCid(4);
		course1.setCname("SQL4");

		ArrayList<Course> aList = new ArrayList<Course>();
		aList.add(course);
		aList.add(course1);

		/*
		 * Student s = new Student(); s.setSid(102); s.setSname("Poojaa");
		 * s.setCourse(aList);
		 */
		
		  Student s2 = new Student();
		  s2.setSid(105); 
		  s2.setSname("Pooja");
		  s2.setCourse(aList);
		  
		 
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			emf = Persistence.createEntityManagerFactory("Test");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			em.persist(s2);
			
			// Course course2 =em.find(Course.class,3)
			// em.persist(s);
			et.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
	}

}
