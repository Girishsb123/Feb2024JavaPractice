package javabasics;

public class Employee {

	// Class is blue print of the object template/category
	// Object is physical entity of the class

	// Class var : class attributes
	String name;
	int id;
	String dept;
	boolean isActive;
	double salary;

	public static void main(String[] args) {

		Employee e1 = new Employee();
		// Employee - Class
		// e1 - Object reference var
		// new Employee(); Object

		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.dept);
		System.out.println(e1.isActive);
		System.out.println(e1.salary);

		e1.name = "Rahul";
		e1.id = 10;
		e1.dept = "Dev";
		e1.isActive = true;
		e1.salary = 34.45;
		
		System.out.println("--------");
		
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.dept);
		System.out.println(e1.isActive);
		System.out.println(e1.salary);
		
		System.out.println("--------");
		
		Employee e2 = new Employee();
		e2.name = "Neha";
		e2.id = 13;
		
		Employee e3 = new Employee();
		e3.name = "Tom";
		e3.id = 15;
		e3.dept = "QA";
		e3.isActive = false;
		
		//No reference object
		new Employee().name = "Mahi";
		new Employee().id = 20;
		
		//null reference
		Employee e4 = new Employee();
		e4=null;
		//e4.name="Tom";NPE
		//e4.id = 4;
		
		System.gc();//no guarantee gc will go to heap memory
		

	}

}
