package StepDefinition;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONObject;
import PageObject.DemoRegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoRegisterPageStepDef {
	

	private JSONObject userData;
	
	DemoRegisterPage demoregisterpage = new DemoRegisterPage();

		
	@Given("User navigates to the application")
	public void user_navigates_to_the_application() {
	    
	}
	
	@Given("user clicks on register link")
	  public void user_clicks_on_register_link() {
		demoregisterpage.clickRegistrationLink();
	}
	@When("user enters the details {string}, {string}, {string}, {string}, {string},")
	  public void user_enters_the_details(String firstname, String lastname, String email, String password, String ConfirmPassword) {
		demoregisterpage.FillRegistrationForm(firstname, lastname, email, password, ConfirmPassword);
	}
	
	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
		demoregisterpage.clickRegister();
	}
	@Then("user should be able to see message {string}")
	   public void user_should_be_able_to_see_message(String expectedMessage) throws IOException {
		demoregisterpage.RegistrationMessage(expectedMessage);
		Hooks.captureScreenshot("registration_success");

	}
		
		
}