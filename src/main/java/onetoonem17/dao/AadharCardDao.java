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
}
