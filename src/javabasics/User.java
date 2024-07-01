package javabasics;

public class User {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		User u1 = new User();

		u1.name = "Sushma";
		u1.age = 29;
		u1.city = "ch nagara";

		System.out.println(u1.name + " " + u1.age + " " + u1.city);

		User u2 = new User();
		u2.name = "Sweety";
		u2.age = 15;
		u2.city = "ch nagara";

		System.out.println(u2.name + " " + u2.age + " " + u2.city);

		User u3 = new User();
		u3.name = "Sahana";
		u3.age = 24;
		u3.city = "N gudu";

		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		System.out.println("----------");

		u1 = u2;

		System.out.println(u1.name + " " + u1.age + " " + u1.city);// Sweety
		System.out.println(u2.name + " " + u2.age + " " + u2.city);// Sweety
		System.out.println(u3.name + " " + u3.age + " " + u3.city);// Sahana

		System.out.println("----------");

		u2 = u3;

		System.out.println(u1.name + " " + u1.age + " " + u1.city);// Sweety
		System.out.println(u2.name + " " + u2.age + " " + u2.city);// Sahana
		System.out.println(u3.name + " " + u3.age + " " + u3.city);// Sahana

		System.out.println("----------");

		u3 = u1;

		System.out.println(u1.name + " " + u1.age + " " + u1.city);// Sweety
		System.out.println(u2.name + " " + u2.age + " " + u2.city);// sahana
		System.out.println(u3.name + " " + u3.age + " " + u3.city);// Sweety

	}

}
