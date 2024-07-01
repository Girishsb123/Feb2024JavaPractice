package javabasics;

public class Car {

	String name;
	int price;
	String chasisnumber;
	final static int wheels = 4;

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 10;
		c1.chasisnumber = "1342BMW";

		Car c2 = new Car();
		c1.name = "Audi";
		c1.price = 20;
		c1.chasisnumber = "7667Audi";

		Car c3 = new Car();
		c1.name = "Benz";
		c1.price = 30;
		c1.chasisnumber = "7877Benz";

		System.out.println(c1.name + " " + c1.price + " " + c1.chasisnumber + " " + wheels);

		// Access static vars
		// direct call : with in the same class
		System.out.println(wheels);

		// Call by using class name : from anywhere
		System.out.println(Car.wheels);

	}

}
