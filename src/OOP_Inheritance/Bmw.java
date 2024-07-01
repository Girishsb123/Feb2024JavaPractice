package OOP_Inheritance;

public class Bmw extends Car {

	int maxSpeed = 200;
	static String name = "BMW";

	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	public void theaftSafety() {
		System.out.println("BMW -- Safety");
	}

	public static void tyrePressure() {
		System.out.println("BMW -- tyrePressure");
	}

	protected void Model() {
		System.out.println("BMW -- Model");
	}

	@Override
	void chasisNumber() {
		System.out.println("BMW -- chasis");
	}

	@Override
	protected void regNumber() {
		System.out.println("BMW -- reg");
	}

	@Override
	public void autoParking() {
		System.out.println("BMW -- autoParking");
	}

}
