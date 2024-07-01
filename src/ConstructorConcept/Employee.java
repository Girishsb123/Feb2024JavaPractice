package ConstructorConcept;

public class Employee {

	String name;
	int id;
	double salary;

	// const name should be same as the class name
	// doesn't have any return type/void
	// const doesn't made for buss logic
	// const can be overload
	// const restricts unnessacary object creation
	// const init instance var
	// const stores in auxiliary space
	// const will be called after object creation
	// In the background jvm will add one default/hidden constructor

//	public Employee() {//0 param 
//		System.out.println("default const...");
//	}
//	
	public Employee(String name) {
		this.name = name;// GL = LV

	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public static void main(String[] args) {

//		Employee e1 = new Employee();
//		e1.name = "rahul";
//		System.out.println(e1.name);

//		Employee e2 = new Employee();
//		Employee e3 = new Employee();
//		Employee e4 = new Employee();

		Employee e = new Employee("tom");
		System.out.println(e.name);

		Employee e1 = new Employee("rahul", 20);
		e1.salary = 21.22;
		System.out.println(e1.name + " " + e1.id + " " + e1.salary);

		Employee e2 = new Employee("vijay", 30, 34.33);
		System.out.println(e2.name + " " + e2.id + " " + e2.salary);

	}

}
