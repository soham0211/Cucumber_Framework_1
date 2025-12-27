package stepdefinition;

import Utils.TestContextSetup;

public class Hooks {

	TestContextSetup testcontextSetup;
	public Hooks(TestContextSetup testcontextSetup) {
		this.testcontextSetup = testcontextSetup;
	}
	
	public void AfterScenario() {
		testcontextSetup.driver.quit();
	}
	
}
