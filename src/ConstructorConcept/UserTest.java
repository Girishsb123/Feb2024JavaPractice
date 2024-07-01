package ConstructorConcept;

import java.util.Arrays;

import testing.Customer;

public class UserTest {

	public static void main(String[] args) {

		User u1 = new User("Neha");
		System.out.println(u1.name);

		User u2 = new User("Rahul", "rahul123@gmail.com", true, "Mysore", "365322355");
		System.out.println(u2.name + " , " + u2.email + " , " + u2.isActive + " , " + u2.city + " , " + u2.phone);

		Customer c = new Customer("Peter", true, "US");
		System.out.println(c.name + " " + c.isActive + " " + c.city);

		String[] customerDetails = c.getCustomerDetails("Raj");
		System.out.println(customerDetails.length);

		System.out.println(Arrays.toString(customerDetails));

	}

}
