package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature", glue= {"stepdefinition"},
monochrome=true,tags = "@Login",
plugin = {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"rerun:target/failedScenario.txt"})
public class TestNGrunner extends AbstractTestNGCucumberTests {
	
	

}
