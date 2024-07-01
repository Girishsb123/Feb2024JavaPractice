package OOP_Interface;

public interface USMedical {

	int minbill = 10; // static and final by default

	// Don't have method body/only method declaration
	// Can't create object - only abstract method
	// Interfaces can't have constructor
	// all abs method are non static

	// 100 % abstraction
	public void physioService();

	public void oncoService();

	public void emergencyService();

	// After JDK 1.8 two changes happened
	// 1.can have static methods but with method body
	// 2.can have default methods with method body

	public static void test() {
		System.out.println("test method");
	}

	default void RND() {
		System.out.println("RND method");
	}

}
