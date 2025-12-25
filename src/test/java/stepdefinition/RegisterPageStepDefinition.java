package stepdefinition;

import java.io.IOException;

import PageObject.RegisterPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageStepDefinition {
	RegisterPage registerPage;
	
	TestContextSetup testcontextSetup;
	public RegisterPageStepDefinition(TestContextSetup testcontextSetup) {
		
		this.testcontextSetup=testcontextSetup;
	}

	@Given("user is on Ecommerce register page")
	public void user_is_on_ecommerce_register_page() throws IOException, InterruptedException {
	    //testcontextSetup.testbase.WebDriverManager();
		testcontextSetup.driver.manage().window().maximize();
	   registerPage = testcontextSetup.pageobjectmanager.getRegisterPage();
	   registerPage.RegisterBtn();
	}
	
	@When("user select appropriate gender")
	public void user_select_appropriate_gender() {
		
		registerPage.MaleRadioButton();
	}
	
	@When("^Firstname as (.+) , LastName as (.+) and Email as (.+)$")
	public void firstname_as_first_name_last_name_as_last_name_and_email_as_email(String first , String last , String email) {
	    
		registerPage.Firstname(first);
		registerPage.Lastname(last);
		registerPage.Email(email);
	}
	@When("^Password as (.+) and Confirm Password (.+)$")
	public void password_as_password_and_confirm_password_cnf_password(String pass , String Cnfpass) {
	    
		registerPage.Password(pass);
		registerPage.CnfPassword(Cnfpass);
	}
	@Then("user should able to register and logout succusesfully")
	public void user_should_able_to_register_and_logout_succusesfully() {
	    registerPage.RegisterBtn();
	   // registerPage.LogoutBtn();
	}

}
