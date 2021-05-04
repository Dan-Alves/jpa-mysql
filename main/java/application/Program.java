package application;

import domain.Person;

public class Program {

	public static void main(String[] args) {

		Person p1 = new Person(1, "Daniel", "danielalves.ccomp@gmail.com");
		Person p2 = new Person(2, "Fulano 1", "Fulano1@gmail.com");
		Person p3 = new Person(3, "Fulano 2", "Fulano2@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
