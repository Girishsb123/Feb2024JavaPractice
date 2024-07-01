package javabasics;

import java.util.Arrays;

public class TwoDimArrayConcept {

	public static void main(String[] args) {

		// 1.to iterate 2D arrat use two for loops : outer -inner loops
		int num[][] = {

				{ 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };

		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[0].length; col++) {
				System.out.print(num[row][col] + " ");
			}
			System.out.println();
		}
		
		//System.out.println(Arrays.deepToString(num));
		
		System.out.println("----------");
		
		//2.Object array
		Object empInfo[][]= {

				{"Neha",25,"SDET",true},
				{"Vijay",27,"SDET1",false},
				{"Rahul",30,"SDET Manager",true}
	};
		for (int row = 0; row < empInfo.length; row++) {
			for (int col = 0; col < empInfo[0].length; col++) {
				System.out.print(empInfo[row][col] + " ");
			}
			System.out.println();
		}
}
}
