package javabasics;

public class LoopsConcepts {

	public static void main(String[] args) {

		// 1.while loop 1 to 10
		// when the number of iterations are not fixed
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			++i;
			// break;
		}

		System.out.println("---------------");

		// 2.
		int j = 1;
		while (j <= 50) {
			System.out.println(j);
			System.out.println("hi");
			if (j % 10 == 0)
				System.out.println(j);
			j++;
			break;
		}

		System.out.println("---------------");

		// 3/for -- break
		// when the number of iterations are fixed

		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}

		System.out.println("---------------");

		for (byte k = 1; k < 5; k++) {
			System.out.println(k);
		}

		System.out.println("---------------");

		for (short k = 10; k > 0; k--) {
			System.out.println(k);
		}

		System.out.println("---------------");

		for (float k = 9.1f; k > 1; k--) {
			System.out.println(k);
		}

		System.out.println("---------------");

		for (double k = 12.31; k > 0; k--) {
			System.out.println(k);
		}

		System.out.println("---------------");

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + "=" + (byte) ch);
		}

		System.out.println("---------------");

		for (;;) {
			System.out.println("Welcome to Mysore Palace");
			break;
		}

		System.out.println("---------------");

		for (byte b = 0; b <= 20; b++) {
			if (b % 2 == 0) {
				System.out.println(b + " " + "is even number");
			} else {
				System.out.println(b + " " + "is odd number");
			}
		}
		
		System.out.println("---------------");

		// do-while
		byte c = 10;
		do {
			c--;
			System.out.println(c);//9 ....0
			//break;
		} while (c >= 1);
		
		System.out.println("---------------");

		
		
		//While vs do while use case
		boolean flag = false;
		while(flag) {
			System.out.println("Welcome to NAL");
			break;
		}
		
		System.out.println("---------------");
		
		do {
			System.out.println("Welcome to NAL");
		}while(flag);

	}

}
