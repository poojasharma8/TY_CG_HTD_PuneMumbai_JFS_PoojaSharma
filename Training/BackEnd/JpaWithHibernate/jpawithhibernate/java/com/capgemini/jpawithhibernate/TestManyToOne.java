package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetomany.Pencil;
import com.capgemini.jpawithhibernate.onetomany.Box;

public class TestManyToOne {

	public static void main(String[] args) {

		EntityTransaction entityTransaction = null; 
		EntityManager entityManager = null; 

		Box box = new Box();
		box.setBid(5);
		box.setName("PS");
		
		Pencil pencil = new Pencil();
		pencil.setPid(11);
		pencil.setColor("White");
		pencil.setPencilbox(box);

		Pencil pencil1 = new Pencil();
		pencil1.setPid(12);
		pencil1.setColor("Grey");
		pencil1.setPencilbox(box);
		
		Pencil pencil2 = new Pencil();
		pencil2.setPid(15);
		pencil2.setColor("Green");
		pencil2.setPencilbox(box);

		try {
			EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();			
			entityManager.persist(pencil);
			entityManager.persist(pencil1);			
			entityManager.persist(pencil2);
			
			entityTransaction.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			entityTransaction.rollback();

		}

		entityManager.close();
	}

}
