package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	TestContextSetup testcontextSetup;
	public Hooks(TestContextSetup testcontextSetup) {
		this.testcontextSetup = testcontextSetup;
	}
	
	@After
	public void AfterScenario() {
		testcontextSetup.driver.quit();
	}
	
	@AfterStep
	public void AddScreenShot(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			File sourcepath = ((TakesScreenshot)testcontextSetup.driver).getScreenshotAs(OutputType.FILE);
			byte [] filepath = FileUtils.readFileToByteArray(sourcepath);
			
			scenario.attach(filepath, "image/png", "image");
		}
	}
}
