package javabasics;

public class StringConcatination {

	// String is pre defined class in java
	// It is a sequence of chars enclosed within double quotes

	public static void main(String[] args) {

		String x = "Hello";
		String y = "Selenium";

		byte a = 10;
		byte b = 20;
		
		float c = 12.33f;
		float d = 22.11f;
		
		char c1 = 'a';
		char c2 = 'b';

		System.out.println(x + y);
		System.out.println(a + b);
		System.out.println(x + y + a + b);
		System.out.println(a + b + x + y);
		System.out.println(a + x + b + y);
		System.out.println(x + a + y + b);
		System.out.println(x + y + (a + b));
		
		System.out.println(x+y+c+d);
		System.out.println(c+d+x+y);
		
		System.out.println("the value of a is : "+a);
		System.out.println("the value of b is : "+b);
		System.out.println("the sum of a & b is : "+(a+b));
		
		System.out.println(c1+" "+c2);

	}

}
