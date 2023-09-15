package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;


public class Program {

	public static void main(String[] args) {
		
		Person p1 = new Person(null, "John Blaine", "john@gmail.com");
		Person p2 = new Person(null, "Maria Novaes", "maria@gmail.com");
		Person p3 = new Person(null, "Paul Reeves", "paul@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Person p = em.find(Person.class, 2);
		
		System.out.println(p);
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}
