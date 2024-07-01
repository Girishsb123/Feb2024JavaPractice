package Builderpattern;

public class Ecommerce {

	public Ecommerce login() {
		System.out.println("user is logged in ");
		return this;
	}

	public Ecommerce login(String un, String pwd) {
		System.out.println("user is logged in with : " + un + " " + pwd);
		return this;
	}

	public Ecommerce searchProduct(String product) {
		System.out.println("searching product : " + product);
		return this;
	}

	public Ecommerce searchProduct(String product, String color) {
		System.out.println("searching product : " + product + " " + color);
		return this;
	}

	public Ecommerce addToCart(String productName) {
		System.out.println("adding product : " + productName);
		return this;
	}

	public Ecommerce doPayment(String cc, int cvv) {
		System.out.println("Payment done : " + "2343 4566 7866 9087" + " " + 342);
		return this;
	}

	public Ecommerce generateOrderId(int id) {
		System.out.println("Order id is : " + id);
		return this;
	}

	public Ecommerce logout() {
		System.out.println("user is logged out");
		return this;
	}

}
