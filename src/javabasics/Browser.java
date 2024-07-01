package javabasics;

public class Browser {

	// WAF : to launch browser
	// param : browserName (chrome/ff/edge/safari)
	// type : String
	// return boolean

	public boolean launchBrowser(String browserName) {

		boolean flag = true;

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Chrome is launched");
			break;
		case "firefox":
			System.out.println("ff is launched");
			break;
		case "edge":
			System.out.println("edge is launched");
			break;
		case "safari":
			System.out.println("safari is launched");
			break;

		default:
			System.out.println("Plz pass the right browser : " + browserName);
			flag = false;
			break;
		}

		return flag;
	}

	// WAF : get studentmarks
	// param : studentName(String)
	// return : marks(int)

	public int getStudentMarks(String stName) {

		int marks = -1;

		if (stName.equals("Ravi")) {
			marks = 50;
			// return 50;
		} else if (stName.equals("Neha")) {
			marks = 70;
			// return 70;
		} else if (stName.equals("Ram")) {
			marks = 0;
			// return 90;
		} else {
			System.out.println("pls pass right student name : " + stName);
		}

		return marks;
	}

	public static void main(String[] args) {

		Browser br = new Browser();
		boolean flag = br.launchBrowser("Chrome ");
		if (flag) {
			System.out.println("enter url");
		} else {
			System.out.println("error ... no browser is found");
		}

		int stMarks = br.getStudentMarks("Neha");
		System.out.println(stMarks);

		if (stMarks >= 0) {
			System.out.println("Print mark sheet");
		}

	}

}
