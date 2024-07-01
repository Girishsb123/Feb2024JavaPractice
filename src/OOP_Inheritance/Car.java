package OOP_Inheritance;

public class Car extends Vehicle {

	// Method Overriding : Poly(many) + morphism(Forms) Run time (Dynamic or late
	// binding)
	// when we have parent and child class
	// with same method name
	// with same number of parameter/same sequence of parameter
	// with same return type

	// Final keyword : to prevent method overriding and restrict class inheritance

	int maxSpeed = 100;
	String name;

	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}

	// @Override - can not override static method
	public static void tyrePressure() {
		System.out.println("Car -- tyrePressure");
	}

	// @Override - can not override Protected method
	protected void Model() {
		System.out.println("Car -- Model");
	}

	// Can override default method
	void chasisNumber() {
		System.out.println("Car -- chasis");
	}

	// Can override default to protected method
	void regNumber() {
		System.out.println("Car -- reg");
	}

	// Can override default to public method
	void autoParking() {
		System.out.println("Car -- autoParking");
	}

}
