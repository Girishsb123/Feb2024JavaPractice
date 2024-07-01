package javabasics;

public class Customer {

	String firstName;
	String lastName;
	String phoneNumber;
	String email;
	String password;
	boolean subscribe;

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.firstName = "Manu";
		c1.lastName = "c";
		c1.phoneNumber = "8276389292";
		c1.email = "manu123@gmail.com";
		c1.password = "P@ssword";
		c1.subscribe = true;

		Customer c2 = new Customer();
		c1.firstName = "Manoj";
		c1.lastName = "k";
		c1.phoneNumber = "827342292";
		c1.email = "manoj123@gmail.com";
		c1.password = "test@123";
		c1.subscribe = false;

		Customer c3 = new Customer();
		c1.firstName = "Viji";
		c1.lastName = "s";
		c1.password = "Viji@123";
		c1.subscribe = true;

	}

}
