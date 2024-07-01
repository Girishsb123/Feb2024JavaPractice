package CollectionsTopics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {

		List<String> empList = new ArrayList<String>();
		empList.add("Puppy");
		empList.add("Sweety");
		empList.add("Ashu");

		System.out.println(empList.size());

		List<String> productList = new LinkedList<String>();
		productList.add("Apple iphone");
		productList.add("Sumsung galaxy");
		productList.add("Sony tv");
		
		System.out.println(productList.get(1));

	}

}
