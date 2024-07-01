package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		Bmw b = new Bmw();
		b.start();// overridden
		b.stop();// inherited
		b.refuel();// inherited
		b.theaftSafety();// individual
		b.engine();
		b.tyrePressure();
		System.out.println(b.maxSpeed);
		System.out.println(Bmw.name);

		System.out.println("-----------");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		// c.theaftSafety();

		System.out.println("-----------");

		// top/up casting
		// child class object can be referred by parent class reference variable
		Car c1 = new Bmw();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		// child class object can be referred by grandparent class reference variable
		Vehicle v = new Bmw();
		v.engine();
		

		System.out.println("-----------");

		// down casting 
		// parent class object can be referred by child class reference variable
		//Bmw b1 = (Bmw) new Car();//ClassCastException

	}

}
