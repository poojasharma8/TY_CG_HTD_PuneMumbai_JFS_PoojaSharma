package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate2.dto.Students;

public class Retrive {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
		EntityManager em = emf.createEntityManager();
		Students students = em.find(Students.class ,3);
		 System.out.println("Id is "+students.getId());
		 System.out.println("Name is "+students.getName());
		 System.out.println("Perfomance is"+students.getPerformance());
		 System.out.println("-----------------------------------");
		
	}

}
