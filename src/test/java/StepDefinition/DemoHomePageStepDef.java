package StepDefinition;


import java.io.IOException;

import PageObject.DemoHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


 public class DemoHomePageStepDef {	
		
	 
      DemoHomePage demohomepage = new DemoHomePage();
      

	@Then("the logo of website should be displayed")
	public void the_logo_should_be_displayed() {
		demohomepage.HomepagelogoIcon();	

	}

	@Then("the search box should be present")
	public void the_search_box_should_be_present() {
		demohomepage.DisplaysearchBox();
	}
	
	@When("user enter in the search box {string}")
	public void User_enter_in_the_search_box(String laptop) {
		demohomepage.EnterKeyword(laptop);

	}

	@When("user click the search icon")
	public void user_click_the_search_icon() {
		demohomepage.searchButtonIcon();
		
    }
	
	@Then ("user can see the demo logo")
	public void user_can_see_the_demo_logo() {
		demohomepage.HeaderLogoIcon();
	
	}
	
	@Then ("user should see the home page header")
	public void user_should_see_the_home_page_header() throws IOException {
		demohomepage.HomepagelogoIcon();	
		Hooks.captureScreenshot("Header_screensort");

	}
}