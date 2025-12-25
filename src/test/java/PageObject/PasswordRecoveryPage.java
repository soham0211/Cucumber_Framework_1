package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecoveryPage {
	WebDriver driver;
	public PasswordRecoveryPage(WebDriver driver) {
		this.driver=driver;
	}

	By ResetMSG = By.xpath("//form[@action=\"/passwordrecovery\"]//p");
	By EnterEmail = By.xpath("//input[@id=\"Email\"]");
	By RecoverBTN = By.xpath("//button[@name=\"send-email\"]");
	By ContentType = By.xpath("//p[@class=\"content\"]");
	
	public void GetResetMSG() {
		driver.findElement(ResetMSG).getText();
	}
	
    public void EnterEmail(String existingEmail) {
    	driver.findElement(EnterEmail).sendKeys(existingEmail);
		
	}

    public void ClickRecoverBtn() {
	
    	driver.findElement(RecoverBTN).click();
    }

    public void GetContentMSG() {
	
    	driver.findElement(ContentType).getText();
    }

}
