package javabasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// Dynamic in size - Auto expand and shrink
		// vc default vlaue is 10 - load factor
		// pc

		ArrayList ar = new ArrayList<>();//vc=10,pc=10
		System.out.println(ar);
		ar.add(100);// 0
		ar.add(200);// 1
		System.out.println(ar.size());

		ar.add(300);// 2
		ar.add(400);// 3

		System.out.println(ar.size());

		ar.add(500);// 4
		ar.add(600);// 5

		System.out.println(ar.size());

		ar.add(700);// 6
		ar.add(800);// 7
		ar.add(900);// 8
		ar.add(1000);// 9 pc=10,vc=0
		System.out.println(ar.get(0));
		System.out.println(ar.size());

		// System.out.println(ar.get(10));//IOB
		// System.out.println(ar.get(-1));//IOB

		ar.add("selenium");//pc=10/2=5 
		ar.add('a');
		ar.add(12.33);
		ar.add(true);
		ar.add(null);//pc=15/2=7
		ar.add(200);

		System.out.println(ar.size());

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		// ar1.add("selenium");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Selenium");

		ArrayList<Double> ar3 = new ArrayList<Double>();
		ar3.add(12.22);

	}

}
