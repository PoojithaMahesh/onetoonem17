package onetoonem17.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonem17.dto.AadharCard;
import onetoonem17.dto.Person;

public class AadharCardDao {

	public void saveAadharCard(int personId,AadharCard aadharCard) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person person=entityManager.find(Person.class, personId);
		if(person!=null) {
//			that person is presenty so i can give him an aadharcard
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(aadharCard);
//			updating person details
			person.setAadharCard(aadharCard);
			
			entityTransaction.commit();
		}else {
//			person is not present 
//			invalid person
			System.out.println("Sorry PERSON Id is not present Thank YOUUUUU");
		}
	}
	
	
	public void findAadharCard(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			id is present
			System.out.println(dbAadharCard);
		}else {
//			id is not present
			System.out.println("Sorry Id is not present");
		}
	}
	public void deleteAadharCard(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			id is present
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbAadharCard);
			entityTransaction.commit();
		}else {
//			id is not present
			System.out.println("Sorry Id is not present");
		}
	}
	
	
	public void updateAadharCard(int id,AadharCard aadharCard) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			aadharCard is present then i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			aadharCard.setId(id);
			entityManager.merge(aadharCard);
			entityTransaction.commit();
		}else {
//			aadjarCard is not present i cant update the Data
			System.out.println("Sorry Id is not present");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
