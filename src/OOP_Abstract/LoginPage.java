package OOP_Abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("Loginpage const..");
	}
	
	public LoginPage(int a) {
		//super(a);
		System.out.println("Loginpage const.."+a);
	}


	@Override
	public void title() {
		System.out.println("Loginpage title");

	}

	@Override
	public void url() {
		System.out.println("Loginpage url");

	}
	
	@Override
	public void pageLoadTimeout() {
		System.out.println("Page load time out is : " + 2);
	}

}
