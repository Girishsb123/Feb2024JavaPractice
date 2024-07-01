package OOP_Encapsulation;

public class TestBank {

	public static void main(String[] args) {

//		Bank b = new Bank();
//		b.setName("Sushma");//setter
//		b.setAcountnumber(014236735272);
//		b.setActive(true);
//		b.setBalance(28344.34);
//		
//		System.out.println(b.getName());
//		System.out.println(b.getAcountnumber());
//		System.out.println(b.isActive());
//		System.out.println(b.getBalance());

		// CRUD --
		Bank b = new Bank("Sushma", 014236735272, true, 28344.34); // Create - Post API
		System.out.println(b.getName());// getter - Retrieve - Get API
		System.out.println(b.getAcountnumber());
		System.out.println(b.isActive());
		System.out.println(b.getBalance());

		System.out.println("----------");
		b.setName("Sweety");// setter - update/Patch - API
		b.setActive(false);

		System.out.println(b.getName());
		System.out.println(b.getAcountnumber());
		System.out.println(b.isActive());
		System.out.println(b.getBalance());

		System.out.println("----------");

		Browser b1 = new Browser();
		b1.launchBrowser();

	}

}
