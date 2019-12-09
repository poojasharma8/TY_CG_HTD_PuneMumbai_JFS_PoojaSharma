package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reference {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movie movie = entityManager.getReference(Movie.class,2);
		
		System.out.println("Id is "+movie.getId());
		System.out.println("Name is "+movie.getName());
		System.out.println("Rating is "+movie.getRating());
		
	}

}
