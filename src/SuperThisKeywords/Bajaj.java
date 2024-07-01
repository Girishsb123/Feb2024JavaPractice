package SuperThisKeywords;

public class Bajaj extends Bike {

	// int speed = 100;

	public Bajaj() {
		super(10, 20);
		// super(10);Constructor call must be the first statement in a constructor
		System.out.println("Bajaj Const...");
	}

	public Bajaj(int a) {
		this();
		System.out.println("Bajaj Const..." + a);
	}

	@Override
	public void displayInfo() {
		System.out.println("Bajaj system Info");
		System.out.println(super.speed);
		super.displayInfo();

	}

	// super: pointing to the parent class object
	// 1. in the child class const.. but it should be the 1st statement in the child
	// class const...
	// 2. when you have same properties (Method overrdding/same var) in parent and
	// child
	// but you want to call/access parent class properties -- use super keyword

	// this: pointing to the current class object
	// 1. can call other const.. in the same class
	// 2. either this() or super()
	// 3. should be the 1st statement in the const...
	// 4. to initialize the instance variables with the local variables in const...
	// and methods.
	// 5. can return this keyword also from the method - builder pattern

}
