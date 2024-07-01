package ExceptionHandling;

public class User {

	String name;

	public static void main(String[] args) {

		System.out.println("User is logged in");

		try {

			User obj = new User();
			obj = null;
			obj.name = "tom";// NPE

			int i = 9 / 0;
		} 
		
//		catch (ArithmeticException e) {
//			System.out.println("AE is coming");
//			e.printStackTrace();
//		} 
//		
//		catch (NullPointerException e) {
//			System.out.println("NPE is coming");
//			e.printStackTrace();
//		}
		
		catch(Exception e) {
			System.out.println("some thing is coming");
			e.printStackTrace();
		}

		System.out.println("User is logged out");

	}

}
