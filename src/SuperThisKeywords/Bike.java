package SuperThisKeywords;

public class Bike {

	int speed = 90;

	public Bike() {
		System.out.println("Bike Const...");
	}

	public Bike(int a) {
		this(10, 20);// calling current class const
		System.out.println("Bike Const..." + a);
	}

	public Bike(int a, int b) {
		System.out.println("Bike Const..." + (a + b));
	}

	public void displayInfo() {
		System.out.println("Bike Info");
	}

}
