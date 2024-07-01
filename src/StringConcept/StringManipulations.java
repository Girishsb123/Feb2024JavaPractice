package StringConcept;

import java.util.Arrays;

public class StringManipulations {

	public static void main(String[] args) {

		String str = "Hi this is my java code and i am so happy";

		System.out.println(str.length());// 41
		System.out.println("LI = " + 0);// 0
		System.out.println("HI = " + (str.length() - 1));// 40

		// charAt
		System.out.println(str.charAt(0));// H
		System.out.println(str.charAt(14));// J

		// indexOf
		System.out.println(str.indexOf("H"));// 0
		System.out.println(str.indexOf("i"));// 1st occurrence of i
		System.out.println(str.indexOf("java"));// 14
		System.out.println(str.indexOf("i", (str.indexOf("i") + 1)));// 2nd occurrence of i

		// trim
		String s = "    Hello   word  ";
		System.out.println(s.trim());

		// replace
		String dob = "13-05-1993";
		String db = dob.replace("-", "/");
		System.out.println(db);

		System.out.println(s.replace(" ", ""));

		// Split
		String sr = "JAVA_PYTHON_RUBY_JAVASCRITP";
		String st[] = sr.split("_");
		System.out.println(Arrays.toString(st));
		
		System.out.println("-----------");

		String pop = "xXHelloXxtestingxXAutomationXXxSeleniumxXjava";
		String pop1[] = pop.split("xX");
		System.out.println(pop1[0].length());//0 blank/empty
		System.out.println(pop1[1]);//HelloXxtesting
		System.out.println(pop1[2]);//AutomationXXxSelenium
		System.out.println(pop1[3]);//java
		//System.out.println(pop1[4]);//AIOB
		
		
//		String lg = "test.automation.java.python";
//		String lg1[ ]=lg.split("\\.");
//		System.out.println(Arrays.toString(lg1));
		
		String lan = "Ruby|C#|java|python";
		String b[ ]=lan.split("\\|");
		System.out.println(Arrays.toString(b));
	}

}
