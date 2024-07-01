package OOP_Encapsulation;

//POJO class : Plain Old Java Object
public class Bank {

	private String name;
	private int acountnumber;
	private boolean isActive;
	private double balance;
	
	
	//public const..
	public Bank(String name, int acountnumber, boolean isActive, double balance) {
		this.name = name;
		this.acountnumber = acountnumber;
		this.isActive = isActive;
		this.balance = balance;
	}

	

	// public setter/getter
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAcountnumber() {
		return acountnumber;
	}

	public void setAcountnumber(int acountnumber) {
		this.acountnumber = acountnumber;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
