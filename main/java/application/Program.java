package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {

		//Person p1 = new Person(1, "Daniel", "danielalves.ccomp@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
		EntityManager em = emf.createEntityManager();
		
		//em.getTransaction().begin();
		//inputs
		//em.getTransaction().commit();
		
		//Find data
		//Person p = em.find(Person.class, 2);
		
		//Remove data
		Person p1 = em.find(Person.class, 3);
		em.getTransaction().begin();
		em.remove(p1);
		em.getTransaction().commit();
		
		System.out.println("Done! ");
		em.close();
		emf.close();

	}

}
