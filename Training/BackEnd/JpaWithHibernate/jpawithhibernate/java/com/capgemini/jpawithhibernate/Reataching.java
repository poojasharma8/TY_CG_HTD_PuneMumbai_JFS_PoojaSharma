package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;
 
public class Reataching {

	public static void main(String[] args) {

		EntityTransaction entityTransaction = null; 
		EntityManager entityManager = null; 

		try {
			EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			//to delete data we need to find the data and then remove it
			Movie movie = entityManager.find(Movie.class ,2);
			System.out.println(entityManager.contains(movie));
			
			entityManager.detach(movie); // will detach a particular object
			//entityManager.clear(); will clear all the objects
			System.out.println(entityManager.contains(movie));
			
			Movie m1 = entityManager.merge(movie);
			entityTransaction.commit();// to check if the object is present
			System.out.println(entityManager.contains(m1));
			
		}

		catch(Exception e)
		{
			entityTransaction.rollback(); // goes back
			e.printStackTrace();

		}
		entityManager.close();
	}
}
