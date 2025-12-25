package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By MaleRadio = By.xpath("//input[@id=\"gender-male\"]");
	By FemaleRadio = By.xpath("//input[@id=\"gender-female\"]");
	By FirstName = By.xpath("//input[@id=\"FirstName\"]");
	By LastName = By.xpath("//input[@id=\"LastName\"]");
	By Email = By.xpath("//input[@id=\"Email\"]");
	By Password = By.xpath("//input[@id=\"Password\"]");
	By CnfPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
	By RegisterBtn = By.xpath("//button[@id=\"register-button\"]");
	By LogoutBtn = By.xpath("//a[@class=\"ico-logout\"]");
	
	
	public void MaleRadioButton() {
		driver.findElement(MaleRadio).click();
	}
	
	public void FemaleRadioButton() {
		driver.findElement(FemaleRadio).click();
	}
	
	public void Firstname(String Name) {
		driver.findElement(FirstName).sendKeys(Name);
	}
	
	public void Lastname(String Name) {
		driver.findElement(LastName).sendKeys(Name);
	}
	
	public void Email(String Name) {
		driver.findElement(Email).sendKeys(Name);
	}
	
	public void Password(String Name) {
		driver.findElement(Password).sendKeys(Name);
	}
	
	public void CnfPassword(String Name) {
		driver.findElement(CnfPassword).sendKeys(Name);
	}
	
	public void RegisterBtn() {
		driver.findElement(RegisterBtn).click();
	}
	
	public void LogoutBtn() {
		driver.findElement(LogoutBtn).click();
	}

}
