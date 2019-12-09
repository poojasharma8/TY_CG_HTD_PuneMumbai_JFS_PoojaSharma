package com.capgemini.jpawithhibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate2.dto.Students;

public class InsertS {

	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null ;

		Students students = new Students ();
		students.setId(3);
		students.setName("Priya");
		students.setPerformance("Good");

		try {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
			entityManager = emf.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			entityManager.persist(students);
			System.out.println("Data Saved");

			entityTransaction.commit();
		}

		catch(Exception e){
			entityTransaction.rollback();
			e.printStackTrace();

		}

	}
}
