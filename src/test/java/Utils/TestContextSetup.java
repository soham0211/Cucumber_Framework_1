package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.PageObjectManager;

public class TestContextSetup {
	
	public testBase testbase;
	public WebDriver driver;
	public PageObjectManager pageobjectmanager;

	public TestContextSetup() throws IOException, InterruptedException {
		
		 testbase = new testBase();
		 driver =testbase.WebDriverManager();
		 pageobjectmanager = new PageObjectManager(driver);
	}
	
}
