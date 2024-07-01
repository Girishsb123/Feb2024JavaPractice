package javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLiterals {

	public static void main(String[] args) {

		// 1.with new keyword
		// when you are not sure about values
		double d[] = new double[7];// 0-6
		d[0] = 10;
		d[1] = 20;

		// 2.without new keyword
		// when you are having values
		double d1[] = { 12.3, 45.33, 67.67 };
		System.out.println(Arrays.toString(d1));
		System.out.println(d1[2]);

		String empInfo[] = { "Tom", "Neha", "Peter" };
		for (String e : empInfo) {
			if (e.equals("Neha")) {
				System.out.println("Promote her to SDET2");
				break;
			}
		}

		// Object Array
		// name(String),age(int),salary(double),isActive(boolean),gender(char)
		Object empInf[] = { "Neha", 25, 45.34, true, 'f' };
		for (Object e : empInf) {
			System.out.println(e);

		}
		
	}

}
