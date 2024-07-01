package javabasics;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

		// Array - collection of similar type of data
		// .1 using new keyword
		// li=0,hi=length-1,lenght=hi+1

		int i[] = new int[4];
		// i[-1] = 0;//AIOB
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i.length);// 4
		System.out.println(Arrays.toString(i));
		// System.out.println(i[4]);//AIOB

		// Fetch all the values of arrays
		// for loop
		for (int k = 0; k <= i.length - 1; k++) {
			System.out.println(i[k]);
			if (k % 2 == 0)
				break;

		}

	}

}
