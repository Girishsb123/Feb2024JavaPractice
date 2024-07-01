package ConstructorConcept;

public class User {

	String name;
	String email;
	boolean isActive;
	String city;
	String phone;

	public User(String name) {
		this.name = name;
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public User(String name, boolean isActive, String city) {
		this.name = name;
		this.isActive = isActive;
		this.city = city;
	}

	public User(String name, String email, boolean isActive, String city) {
		this.name = name;
		this.email = email;
		this.isActive = isActive;
		this.city = city;
	}

	public User(String name, String email, boolean isActive, String city, String phone) {
		this.name = name;
		this.email = email;
		this.isActive = isActive;
		this.city = city;
		this.phone = phone;
	}

}
