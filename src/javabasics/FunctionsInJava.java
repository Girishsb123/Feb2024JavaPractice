package javabasics;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsInJava {

	// We can't create function inside function
	// We can call function inside another function
	// Functions are independent/parallel to each other
	// Functions : behavior of the object/class
	// Duplicate functions are not allowed

	String name;

	// 1.no i/p ,no return
	// void -- can't return any value
	public void test() {
		System.out.println("test function");
	}

	// 2.no i/p ,some return
	public int getInfo() {
		System.out.println("getinfo method");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		return c;
	}

	// function can't return multiple values at a time in java
	public String getEmp() {
		String emp1 = "Virat";
		String emp2 = "Rohit";
		// return emp1;
		// return emp2;
		return emp1 + emp2;
	}

	// Static array
	public String[] getPlayers() {
		String p[] = { "Rohit", "Virat", "Ms dhoni" };
		return p;

	}

	// Dynamic array
	public ArrayList<String> getProducts() {
		String p1 = "Apple";
		String p2 = "Galaxy";
		String p3 = "Red mi";

		// return p1,p2,p3;

		ArrayList<String> productList = new ArrayList<String>(Arrays.asList("Apple", "Galaxy", "Redmi"));
		return productList;

	}

	// 3.i/p and o/p - calculator
	public int add(int a, int b)// 2 params
	{
		int c = a + b;
		return c;
	}

	public int sub(int a, int b) {
		int c = b - a;
		return c;
	}

	public float getBillAmount(int foodbill, int drinksbill, float tax) {
		float totalBill = foodbill + drinksbill + tax;
		return totalBill;
	}

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		System.out.println(obj.name = "java");
		obj.test();

		int s = obj.getInfo();
		System.out.println(s + 20 - 10);
		System.out.println(obj.getInfo() + 20 - 10);// Not a good practice

		String empNames = obj.getEmp();
		System.out.println(empNames);

		String[] playersList = obj.getPlayers();
		System.out.println(playersList.length);
		System.out.println(Arrays.toString(playersList));

		ArrayList<String> listOfProducts = obj.getProducts();
		System.out.println(listOfProducts.size());
		listOfProducts.add(1, "Nokia");
		System.out.println("Products are : " + listOfProducts);

		int i = obj.add(10, 20);// 2 args/values - calling function by passing args/value is called call by
								// value
		System.out.println(i + 5);

		float finalBill = obj.getBillAmount(10, 5, 0.4f);
		System.out.println(finalBill - 1);

	}

}
