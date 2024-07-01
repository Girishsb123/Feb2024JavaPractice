package StringConcept;

public class User {

	public static void main(String[] args) {

		// 1.using literals

		String s1 = "Hello";// 1 SCP -Duplicate entries NA

		// 2.using new keyword

		String s2 = new String("Hello");// 2- 1 HP ,1 SCP

		String s3 = "Hello";

		String s4 = new String("hello");// 2- 1 HP ,1 SCP

		String s5 = "hello";

		String s6 = s4.intern();

		System.out.println(s6 == s5);// true

		System.out.println(s1 == s2);// false - == compares its references (memory address not actual string values)
		System.out.println(s1.equals(s2));// true - always recommended for comparison
		System.out.println(s1 == s3);// true
		System.out.println(s4 == s5);// false

		// Immutable - can't modify original value of string
		String str = "Hello";
		// str = str+"Selenium";
		System.out.println(str + "Selenium");// new entry will be created
		System.out.println(str);

		String str1 = "Hello";
		System.out.println(str1 + 100);
		System.out.println(str1 + 200);

		// Faster in accessing bcoz of not thread safe and not synchronized so it will
		// not create new entry ,we can use it for manipulations
		StringBuilder sb = new StringBuilder("Automation");
		System.out.println(sb.append("Testing"));// AutomationTesting
		
		String S9 = "Inida";
		System.out.println(S9.toUpperCase());

	}

}
