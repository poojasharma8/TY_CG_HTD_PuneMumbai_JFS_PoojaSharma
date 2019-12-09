package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;
import com.capgemini.jpawithhibernate.onetoone.Person;
import com.capgemini.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {

		EntityTransaction entityTransaction = null; 
		EntityManager entityManager = null; 

		Person person = new Person();
		person.setId(2);
		person.setName("Pooja");


		VoterCard votercard = new VoterCard();
		votercard.setVid(1234);
		votercard.setAddress("Nagpur");
		person.setVoterCard(votercard);

		try {
			EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			//to insert data we use Persist()
			VoterCard cardDetails= entityManager.find(VoterCard.class, 1234);
			System.out.println(cardDetails.getPerson().getId());
			System.out.println(cardDetails.getPerson().getName());
			//entityManager.persist(person);
			System.out.println("Saved");
			
			entityTransaction.commit();
		}
		catch(Exception e)
		{
			entityTransaction.rollback();
			e.printStackTrace();

		}
	}

}
