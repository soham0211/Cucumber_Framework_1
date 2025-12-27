package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failedScenario.txt", glue= {"stepdefinition"},
monochrome=true,
plugin = {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",})
public class TestNGrunnerFailedScenarios extends AbstractTestNGCucumberTests {
	
	

}
