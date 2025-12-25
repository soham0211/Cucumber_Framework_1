package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
    WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
 By	LoginHed= By.xpath("//a[@class=\"ico-login\"]");
 By	Email= By.xpath("//input[@id=\"Email\"]");
 By	Password= By.xpath("//input[@id=\"Password\"]");
 By	LoginBtn= By.xpath("//button[@class=\"button-1 login-button\"]");
 By	ForgotPass= By.xpath("//a[normalize-space()=\"Forgot password?\"]");
 By LoginErrorMsg = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");
			
 public void GoToLogin() {
	 
	 driver.findElement(LoginHed).click();
 }

public void ClickEmail(String email) {
	 
	 driver.findElement(Email).sendKeys(email);
 }

public void ClickPassword(String pass) {
	 
	 driver.findElement(Password).sendKeys(pass);
}

public void ClickLoginBtn() {
	 
	 driver.findElement(LoginBtn).click();
}
	
public void GoToForgotPass() {
	 
	 driver.findElement(ForgotPass).click();
}

public String getLoginErrorMsg() {
	return driver.findElement(LoginErrorMsg).getText();
}

}
