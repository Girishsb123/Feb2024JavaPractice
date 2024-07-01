package javabasics;

public class Person {

	// When in the same class : method overloading - poly(many)+morphism(forms) -
	// compile time (static ,early binding)
	// with same name
	// with different number of parameters
	// with different type of parameters
	// return type doesn't matter
	// sequence of param should be diff

	public void test() {// 0 param
		System.out.println("test method");
	}

	public int test(int a) {// 1 param
		System.out.println("test method -- one param");
		return 10;
	}

	public void test(int a, int b) {// 2 param
		System.out.println("test method --" + (a + b));
	}

	public void test(String a, int b) {// 2 param
		System.out.println("test method -- two param");
	}

	public void test(int a, String b) {// 2 param
		System.out.println("test method -- two param");
	}

	// Real time examples - ecommerce
	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, int otp) {

	}

	public void login(String phone) {

	}

	public void login(String email, int otp) {

	}

	// search
	public void search() {

	}

	public void search(String product) {

	}

	public void search(String product, int price) {

	}

	// payment
	public void doPayment(String cc, String debit, String paypal) {

	}

	public void doPayment(String UPI, String Forex) {

	}

	// uber booking
	public void booking(String cartype, String stPoint, String stEndpoint) {

	}

	public void booking(String cartype, String stPoint, String stEndpoint,int passengers) {

	}

	public static void main(String[] args) {

		Person p = new Person();
		p.test();
		p.test(10);
		p.test(10, 20);

	}

}
