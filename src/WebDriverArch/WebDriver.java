package WebDriverArch;

public interface WebDriver {

	public void FindElement(String locator);

	public void click(String locator);

	public void sendKeys(String locator,String value);

	public String getTitle();

	public void get(String locator);

	public void close();

}
