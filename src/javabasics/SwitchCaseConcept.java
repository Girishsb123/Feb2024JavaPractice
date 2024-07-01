package javabasics;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "Chrome ";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("Plz pass the right browser  : " + browser);
			break;
		case "opera":
			System.out.println("launch opera");
			break;

		}

		// byte,short,int,String,char -- allowed
		// float,double -- not allowed
		

		char ch = 'a';
		switch (ch) {
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;

		default:
			System.out.println("character passed is not vowel");
			break;
		}
	}

}
