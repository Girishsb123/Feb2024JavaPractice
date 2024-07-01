package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser");
		checkRAM();
		checkCPUUtilization();
		checkBrowserversion();
		checkBrowserUpgrade();
		System.out.println("browser launched");
	}

	private void checkRAM() {
		System.out.println("CheckRAM");
	}

	private void checkCPUUtilization() {
		System.out.println("CPUUtilization");
	}

	private void checkBrowserversion() {
		System.out.println("Browserversion");
	}

	private void checkBrowserUpgrade() {
		System.out.println("BrowserUpgrade");
	}

}
