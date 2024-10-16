package PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import StepDefinition.Hooks;

   public class DemoRegisterPage extends Hooks {

	
	By RegistrationLinkLocator= By.xpath("//a[contains(text(),'Register')]");
    By FirstNameLocator = By.xpath("//input[@id='FirstName']");
    By LastNameLocator = By.xpath("//input[@id='LastName']");
    By EmailLocator = By.xpath("//input[@id='Email']");
    By PasswordLocator = By.xpath("//input[@id='Password']");
    By ConfirmPasswordLocator = By.id("ConfirmPassword");
    By RegisterLocator = By.id("register-button");
       
    public void clickRegistrationLink() {
        driver.findElement(RegistrationLinkLocator).click();  
        logger.info( "Click on Registration Link");

      }
    public  void FillRegistrationForm(String firstname, String lastname, String email, String password, String confirmPassword) {
    	driver.findElement(FirstNameLocator).sendKeys(firstname);
    	driver.findElement(LastNameLocator).sendKeys(lastname);
    	driver.findElement(EmailLocator).sendKeys(email);
    	driver.findElement(PasswordLocator).sendKeys(password);
    	driver.findElement(ConfirmPasswordLocator).sendKeys(confirmPassword);
    	logger.info( "Filled the registrayion form");
    }
	public void clickRegister() {
	      driver.findElement(RegisterLocator).click();  
	      logger.info( "Click on Register button");
	    }
	

    public  void RegistrationMessage(String expectedMessage) {
    	String actualMessage = "Your registration completed";
        assertEquals(expectedMessage, actualMessage);
        
    }
    
  
}
