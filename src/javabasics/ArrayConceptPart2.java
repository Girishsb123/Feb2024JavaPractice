package javabasics;

import java.util.Arrays;

public class ArrayConceptPart2 {

	public static void main(String[] args) {

		byte b[] = new byte[2];// 0-1
		b[0] = 1;
		b[1] = 2;

		short s[] = new short[3];// 0-2
		s[0] = 230;
		s[1] = 456;

		double d[] = new double[2];// 0-1
		d[0] = 10;
		d[1] = 20;

		float f[] = new float[3];// 0-2
		f[0] = 1.1f;
		f[1] = 2.3f;

		char c[] = new char[4];
		System.out.println(c);// '\u0000 or (0)
		c[0] = 'a';
		c[1] = 'A';
		c[2] = '$';
		c[3] = '0';
		System.out.println(c.length);
		System.out.println(Arrays.toString(c));

		String stName[] = new String[2];
		System.out.println(stName);
		stName[0] = "Java";
		stName[1] = "Selenium";
		System.out.println(Arrays.toString(stName));

		System.out.println("---------");

		// for each loop - enhanced for loop
		for (String e : stName) {
			System.out.println(e);
			if (e.equals("Selenium")) {
				System.out.println("Popular testing tool");
			}
		}

		System.out.println("---------");

		for (char e : c) {
			System.out.println(e);
		}

	}

}
