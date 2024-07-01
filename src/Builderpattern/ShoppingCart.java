package Builderpattern;

public class ShoppingCart {

	public static void main(String[] args) {

		Ecommerce u = new Ecommerce();
		u.login()
		   .login("admin", "admin123")
		      .searchProduct("Sumsung galaxy")
                  .searchProduct("Sumsung galaxy", "Black")
                     .addToCart("Sumsung galaxy")
                       .doPayment("2343 4566 7866 9087", 342)
                         .generateOrderId(123)
                           .logout();
		
		System.out.println("---------------------");
		
		u.login("sushma", "sushma123")
		    .searchProduct("iphone", "white")
		       .addToCart("iphone")
		          .logout();
	}

}
