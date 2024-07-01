package testing;

public class Customer {

	public String name;
	public boolean isActive;
	public String city;

	public Customer(String name, boolean isActive, String city) {
		this.name = name;
		this.isActive = isActive;
		this.city = city;
	}

	public String[] getCustomerDetails(String name) {

		if (name.equals("Raj")) {

			String[] prod = { "Apple", "Ipod", "Galaxy" };
			return prod;
		}

		else if (name.equals("Akash")) {

			String[] prod = { "Apple", "Ipod" };
			return prod;
		}

		else {
			return null;
		}

	}
}
