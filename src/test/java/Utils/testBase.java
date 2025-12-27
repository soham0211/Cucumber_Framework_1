package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testBase {
	
	WebDriver driver;
	String UrlName ;
	
	public WebDriver WebDriverManager() throws IOException, InterruptedException {
		
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resourse//CommonProp.properties");
	Properties prop = new Properties();
	prop.load(fis);
	
	//String browserName = prop.getProperty("browser");
	 UrlName = prop.getProperty("url");
	
	String NewBrowser = System.getProperty("browser",prop.getProperty("browser"));
	
	if(NewBrowser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	}
	else if (NewBrowser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}
	
	driver.get(UrlName);
	Thread.sleep(2000);
	
	return driver;
	}

}
