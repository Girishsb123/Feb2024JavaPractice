package javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		numList.add(500);

		System.out.println(numList);

		// iterate using for loop
		for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
			// break;
		}

		ArrayList<String> empList = new ArrayList<>();
		empList.add("Rahul");// 0
		empList.add("Tom");// 1
		empList.add("Vijay");// 2

		System.out.println(empList);
		// empList.add(4,"Neha");
		// System.out.println(empList.get(4));//IOB

		empList.add(0, "Neha");// shifts values
		System.out.println(empList);

		empList.set(0, "Peter");// Override/replace value - data loss
		System.out.println(empList);

		empList.remove(3);// - data loss
		System.out.println(empList);

		System.out.println("------------");

		ArrayList<Object> empInfo = new ArrayList<>();
		empInfo.add("Naveen");
		empInfo.add(38);
		empInfo.add(34.45);
		empInfo.add(true);
		empInfo.add('M');

		// for each
		for (Object e : empInfo) {
			System.out.println(e);
		}

		System.out.println("------------");

		// ArrayList literals - asList

		ArrayList<String> langList = new ArrayList<>(Arrays.asList("Java", "C", "Python"));
		System.out.println(langList.size());
		langList.add("C++");
		System.out.println(langList);

		System.out.println("------------");

		// Collections - reverse

		Collections.reverse(langList);
		System.out.println(langList);

		Collections.swap(langList, 1, 2);
		System.out.println(langList);

		Collections.sort(langList);
		System.out.println(langList);

		System.out.println("------------");

		// using for loop
		for (int i = langList.size() - 1; i >= 0; i--) {
			System.out.println(langList.get(i));
		}

		System.out.println("------------");

		// using for each
		int count = 0;
		for (String a : langList) {
			System.out.println(count + "=" + a);
			count++;
		}

		System.out.println("------------");
		
		List<String> newList = Collections.EMPTY_LIST;
		System.out.println(newList.size());
		
		List<Integer> marksList = Collections.emptyList();// Immutable List - empty
//		System.out.println(marksList);
//		marksList.add(200);//UnsupportedOperationException
//		marksList.add(300);
//		System.out.println(marksList);



	}
}
