package javabasics;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {

		// 1.post increment

		byte a = 1;
		byte b = a++;

		System.out.println(a);
		System.out.println(b);

		// 2.pre increment

		byte c = 1;
		byte d = ++c;

		System.out.println(c);
		System.out.println(d);

		// 1.post decrement

		byte e = -99;
		byte f = e--;

		System.out.println(e);
		System.out.println(f);

		// 2.pre decrement

		byte g = -10;
		byte h = --g;

		System.out.println(g);
		System.out.println(h);
		
		byte pop = 1;
		System.out.println(pop++);
		System.out.println(pop);
		
		byte p = 5;
		System.out.println(++p);
		System.out.println(p);
	}

}
