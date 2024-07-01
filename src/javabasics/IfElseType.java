package javabasics;

public class IfElseType {

	public static int checkEligibility(int age) {

		if (age < 18) {
			System.out.println("not eligible");
		} else {
			if (age >= 18) {
				System.out.println("Eligible for voting");
			}
		}

		return age;

	}

	public static void main(String[] args) {

		int ageFactor = checkEligibility(-1);
		System.out.println(ageFactor);

		String name = "SushmA";

		if (name.equalsIgnoreCase("Sushma")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

//		String browser = "chrome";
//
//		if (browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		if (browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		if (browser.equals("edge")) {
//			System.out.println("launch edge");
//		} else {
//			System.out.println("plz pass right browser : " + browser);
//		}

		String browser = "edge";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		} else if (browser.equals("edge")) {
			System.out.println("launch edge");
		} else {
			System.out.println("plz pass right browser : " + browser);
		}

	}

}
