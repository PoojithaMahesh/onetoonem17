package onetoonem17.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonem17.dao.AadharCardDao;
import onetoonem17.dao.PersonDao;
import onetoonem17.dto.AadharCard;
import onetoonem17.dto.Person;

public class PersonAadharController {
public static void main(String[] args) {
//	Person person=new Person();
//	person.setId(1);
//	person.setName("Swati");
//	person.setAddress("Bangalore");
//	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(100);
//	aadharCard.setName("Swatiiiiiiii");
//	aadharCard.setAge(19);
//	
//	
//	person.setAadharCard(aadharCard);
//	
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction=entityManager.getTransaction();
//	entityTransaction.begin();
//	entityManager.persist(aadharCard);
//	entityManager.persist(person);
//	entityTransaction.commit();
//	
	
	
//	Person person=new Person();
//	person.setId(3);
//	person.setName("Abhi");
//	person.setAddress("Bangalore");
//	
//	PersonDao dao=new PersonDao();
//	dao.savePerson(person);
	
	
	AadharCard aadharCard=new AadharCard();
	aadharCard.setId(300);
	aadharCard.setName("abhi");
	aadharCard.setAge(19);
	
	AadharCardDao aadharCardDao=new AadharCardDao();
	aadharCardDao.saveAadharCard(3, aadharCard);
	
	
	
	
	
	
}
}