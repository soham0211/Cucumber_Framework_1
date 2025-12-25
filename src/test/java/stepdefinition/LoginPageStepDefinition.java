package stepdefinition;

import org.testng.Assert;

import PageObject.LoginPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition {

	TestContextSetup testcontextSetup;
	LoginPage loginpage;
	String ExpectedMsg;
	
	public LoginPageStepDefinition(TestContextSetup testcontextSetup) {
		this.testcontextSetup = testcontextSetup;
	}
	

@Given("user is on Ecommerce main page")
public void user_is_on_ecommerce_main_page() {
	testcontextSetup.driver.manage().window().maximize();
}

@When("user go to login")
public void user_go_to_login() {
    loginpage = testcontextSetup.pageobjectmanager.getLoginPage();
   // loginpage.GoToLogin();
}

@When("^enter Invalid email as (.+) and password as (.+) and click on login$")
public void enter_valid_email_as_email_and_password_as_password_and_click_on_login(String email, String pass) {
	loginpage.ClickEmail(email);
	loginpage.ClickPassword(pass);
	loginpage.ClickLoginBtn();
    
}

@Then("user should able login succusesfully")
public void user_should_able_login_succusesfully() {
    ExpectedMsg=testcontextSetup.ExpectedLoginError;
    Assert.assertEquals(loginpage.getLoginErrorMsg(), ExpectedMsg);
    
}

	
	
	
}
