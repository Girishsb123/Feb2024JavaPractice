package ExceptionHandling;

public class Finallyblock {

	public static void main(String[] args) {

		System.out.println("Hi");

		try {
			int i = 8 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Bye");
		}

	}
}
