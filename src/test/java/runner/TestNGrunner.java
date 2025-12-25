package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature", glue= {"stepdefinition"},
monochrome=true,tags = "@Login")
public class TestNGrunner extends AbstractTestNGCucumberTests {
	
	

}
