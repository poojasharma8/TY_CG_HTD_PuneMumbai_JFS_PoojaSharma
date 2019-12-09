package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Retrieval {
	
 public static void main(String[] args) {
	 
	 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	 EntityManager entityManager = entityManagerFactory.createEntityManager();
	 
	 Query query = entityManager.createQuery("from Movie");
	 List<Movie> list = query.getResultList();
	 
	 for (Movie m : list) {
			System.out.println(m.getName());
	
 	}
	 entityManager.close();
 }
}
