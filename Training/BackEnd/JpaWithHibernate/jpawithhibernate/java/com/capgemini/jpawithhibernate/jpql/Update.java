package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
	
public class Update {

	public static void main(String[] args) {
		 
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		Query query = entityManager.createQuery("Update From Movie set rating = 'Good' where id = 1");
		int result = query.executeUpdate() ;
		if (result > 0) {
			System.out.println("Update done");
		}
		else {
			System.out.println("Something went wrong");
		}
		
		entityTransaction.commit();
	}

}
