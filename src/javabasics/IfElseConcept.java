package javabasics;

public class IfElseConcept {

	public static void main(String[] args) {

		int marks = 40;

		if (marks > 100) {
			System.out.println("Incorrect marks");
		} else {

			if (marks >= 90) {
				System.out.println("GRADE A");
				System.out.println("marks is less than 90");
			} else {
				if (marks >= 80) {
					System.out.println("GRADE B");
					System.out.println("marks is less than 80");

				}
				else{
					System.out.println("GRADE C");
					
				}
			}

		}

	}
}