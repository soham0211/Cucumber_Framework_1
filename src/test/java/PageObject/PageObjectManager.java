package PageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	WebDriver driver;
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public RegisterPage getRegisterPage() {
		RegisterPage registerpage = new RegisterPage(driver);
		return registerpage;
	}
	
	
	

}
