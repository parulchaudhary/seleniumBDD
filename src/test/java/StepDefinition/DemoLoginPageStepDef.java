package StepDefinition;

import java.io.IOException;

import PageObject.DemoLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


	  public class DemoLoginPageStepDef {
		
		
		DemoLoginPage demologinpage = new DemoLoginPage();

		
		@Then("user should see login button on the home page")
		 public void user_should_see_login_button_on_the_home_page() {
			demologinpage.clickLoginButtonDisplayed();

		}
		
			@When("user clicks on the login icon")
			 public void user_clicks_on_the_login_icon(){			
				demologinpage.clickLoginButton();
				

			}
			@When("user enters the email {string} and password {string}")
			public void user_enters_the_email_and_password(String email, String password) {
				demologinpage.enterEmailAndPassword(email, password);
			
			}
			
			@When("user clicks on the login button")
			public void user_clicks_on_the_login_button() {
				demologinpage.clickLoginIcon();
			}
			
			@When("user should be logged in successfully")
			public void user_should_be_logged_in_successfully() throws IOException {
				demologinpage.WelcomeLoginMessage();
				Hooks.captureScreenshot("Welcome_screensort");
				
			}
			 
			@When("user clicks on the logout icon")
			public void user_clicks_on_the_logout_icon() {
				demologinpage.clickLogoutIcon();
			}
	
		        
		        @Then("user should not be able to log in")
		        public void user_should_not_be_able_to_log_in() {
		            demologinpage.UnsuccessfulLogin();
		        }
		        
		        @Then("User should see the error message {string}")
		        public void user_should_see_the_error_message(String expectedErrorMessage) {
		        	demologinpage.InvalidLoginMessage(expectedErrorMessage);
		        	
		        	
		        }
		        @When("user clicks on forgot password link")
		        public void user_clicks_on_forgot_password_link() {
		        	demologinpage.forgotPasswordLink();
		            
		        }
		        
		        @Then("user should navigate to password recovery page and enter MailID for recovery")
		        public void user_should_navigate_to_password_recovery_page() {
		        	demologinpage.passwordrecoverypage();   
		            
		        }
		     
		            @When("user checks the remember me checkbox")
		            public void user_checks_the_remember_me_checkbox() throws IOException {
		            	demologinpage.getrememberMeCheckbox();
		            	Hooks.captureScreenshot("Login_screensort");
		            }
          
	}
		
