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
	
	public LoginPage getLoginPage() {
		LoginPage loginpage = new LoginPage(driver);
		return loginpage;
	}
	
	public PasswordRecoveryPage getPassRecoveryPage() {
		PasswordRecoveryPage passrecoverpage = new PasswordRecoveryPage(driver);
		return passrecoverpage;
	}
	
	
	

}
