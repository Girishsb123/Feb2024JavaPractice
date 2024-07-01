package OOP_Abstract;

public abstract class Page {
	
	// abs class contains both abs and non abs methods
	// 0 - 100 % abstraction
	// can't create / instantiate object in abs class
	// abs can have constructor but it will be called when you create the object of
	// child class
	
	//default const
	public Page() {
		System.out.println("Page const...");
	}
	
	public Page(int a) {
		System.out.println("Page const..."+a);
	}
	

	public abstract void title();

	public abstract void url();

	public void pageLoadTimeout() {
		System.out.println("Page load time out is : " + 10);
	}

	public final void appLogo() {
		System.out.println("App logo");
	}

}
