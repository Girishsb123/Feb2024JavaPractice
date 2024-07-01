package javabasics;

public class ConditionalOperators {

	public static void main(String[] args) {

		byte i = 10;
		if (i == 10) {
			System.out.println("i is equal");
		}

		int j = 100;
		int k = 200;
		if (j == k) {
			System.out.println("j & k are equal");
		} else {
			System.out.println("j & k are not equal");
		}

		// Dead code example
		if (true) {
			System.out.println("hi selenium");
		} else {
			System.out.println("bye selenium");
		}

		//Entire logic is depends on isActive variable
		boolean isActive = false;
		if (isActive) {
			System.out.println("User is Active");
		} else {
			System.out.println("User is inActive");
		}

		// WAP to find max value
		int x = 100;
		int y = 400;
		int z = 300;
		
		
        // && Short circuit operator - if the first condition is false it will not check next conditions
		if (x > y && x > z) {
			System.out.println("x is greatest");
		} else if (y > z) {
			System.out.println("y is greatest");
		} else {
			System.out.println("z is greatest");
		}

	}

}
