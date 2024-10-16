package PageObject;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import StepDefinition.Hooks;


public class DemoLoginPage extends Hooks {

	     By loginButtonLocator = By.xpath("//a[@class='ico-login']");
	     By emailInputLocator = By.id("Email");
	     By passwordInputLocator = By.id("Password");
	     By loginIconLocator = By.xpath("//button[@class='button-1 login-button']");
	     By logoutIconLocator = By.xpath("//a[@class='ico-logout']");
	     By errorMessageLocator = By.xpath("//div[@class='message-error validation-summary-errors']");
	     By forgotPasswordLinkLocator = By.xpath("//span[@class='forgot-password']");
	     By forgotPasswordPageHeaderLocator = By.xpath("//div[@class='page-title']");
	     By rememberMeCheckboxLocator = By.id("RememberMe");
	        
	     
		 SoftAssert softAssert = new SoftAssert();

		public void clickLoginButtonDisplayed() {
	      driver.findElement(loginButtonLocator).isDisplayed();	
	      logger.info( "Check if login Button is displayed");
	    }

		public void clickLoginButton() {
	      driver.findElement(loginButtonLocator).click();
	  	  logger.info( "Click on login Button");
	      
	    }
		
		public void WelcomeLoginMessage() {
		     WebElement loggedInElement = driver.findElement(logoutIconLocator);
		     assertTrue("User is not logged in successfully", loggedInElement.isDisplayed());
			 String expectedWelcomeMessage = "Welcome to our store";
	         assertEquals("Welcome to our store", expectedWelcomeMessage, loggedInElement.getText());
}

	    public  void enterEmailAndPassword(String email, String password) {
	        driver.findElement(emailInputLocator).sendKeys(email);
	        driver.findElement(passwordInputLocator).sendKeys(password);
	    	logger.info( "Enter username and password");
	    }

	    public void clickLoginIcon() {
	        driver.findElement(loginIconLocator).click();
	        logger.info( "Click login In Icon");
	        
	    }
	    
	    public void clickLogoutIcon() {
	    driver.findElement(logoutIconLocator).click();
	    logger.info( "Click LogOut Icon");
	    }
	    
	    public void UnsuccessfulLogin() {
	    WebElement errorMessageElement = driver.findElement(errorMessageLocator);
        assertTrue("Incorrect login error message is not displayed", errorMessageElement.isDisplayed());
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again. The credentials provided are incorrect.";
        assertEquals("Incorrect error message", expectedErrorMessage, errorMessageElement.getText());
	    }
	    
	    public  void InvalidLoginMessage(String expectedErrorMessage) {
	    WebElement ActualErrorMessage=driver.findElement(errorMessageLocator);
        softAssert.assertEquals(ActualErrorMessage, expectedErrorMessage,"Error doesn't match the expected value");
	    }
	    
	    public void forgotPasswordLink() {
       driver.findElement(forgotPasswordPageHeaderLocator).click();
       logger.info( "Click on forgotpassword link");
	    }
	    public void getrememberMeCheckbox() {
	    driver.findElement(rememberMeCheckboxLocator).click();
	    logger.info( "Click on rememberMeCheckbox");
	    
	    }
	    
	    public void passwordrecoverypage() {
	    	driver.findElement(forgotPasswordPageHeaderLocator).isDisplayed();	
      //  WebElement forgotPasswordPageHeader = driver.findElement(forgotPasswordPageHeaderLocator);
     //   assertTrue("Not on the forgot password page", forgotPasswordPageHeader.isDisplayed());
        WebElement EnterMailid = driver.findElement(By.id("Email"));
        EnterMailid.sendKeys("abcd.efgh@gmail.com");
        WebElement loginIconone = driver.findElement(By.name("send-email"));
        loginIconone.click(); 
	    }
	}
