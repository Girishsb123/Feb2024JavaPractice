package DataConversion;

public class StringReverse {

	// WAF : reverseString
	// param : String str
	// return : rev

	public static String reverseString(String str) {

		// null check
		if (str == null) {
			System.out.println("str is null can't reverse,plz pass the right string");
			return str;
//			return "String is null";
//			return "-1";
		}

		// length check
		int len = str.length();

		if (len == 1 || len == 0) {
			return str;
		}

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		return rev;
	}

	public static void main(String[] args) {

		// tcs

		System.out.println(reverseString("Selenium"));
		System.out.println(reverseString("123"));
		System.out.println(reverseString("Selenium Automation"));
		System.out.println(reverseString("T"));
		System.out.println(reverseString(""));
		System.out.println(reverseString(null));

		//
		System.out.println("i love java coding");// i love "java" coding
		System.out.println("i love \"java\" coding");
		System.out.println("i love 'java' coding");

		String x = getXpath("tom");
		System.out.println(x);

		String y = getXpath("naveen");
		System.out.println(y);

	}

	public static String getXpath(String empName) {
		String xpath = "//input[@name='" + empName + "']";
		return xpath;
	}

}
