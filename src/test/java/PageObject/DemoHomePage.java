package PageObject;


import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import StepDefinition.Hooks;


public class DemoHomePage extends Hooks{

	By homepageLogo = By.xpath("//img[@alt='nopCommerce demo store']");
	By searchButton = By.xpath("//button[@type='submit']");
	By searchButton_text = By.xpath("//input[@placeholder='Search store']");
	By searchButton_terms = By.id("small-searchterms");
	By HeaderLogo = By.xpath("//div[@class='header-logo']/a/img");
	 
	 SoftAssert softAssert = new SoftAssert();
	 

	public void HomepagelogoIcon() {
		driver.findElement(homepageLogo).isDisplayed();	
		logger.info( "Site logo is displayed");
	}
	
	public void searchButtonIcon() {	
		driver.findElement(searchButton).click();
		logger.info( "Click on the Search Button");
	}
	  public void DisplaysearchBox() {	
        WebElement searchBox = driver.findElement(searchButton);
        String searchBoxText=driver.findElement(searchButton_text).getAttribute("placeholder");
        String expectedPlaceholderText = "Search store'";
	    softAssert.assertEquals(searchBoxText, expectedPlaceholderText,"Search box placeholder text doesn't match the expected value");
        assertTrue("Search box is not visible", searchBox.isDisplayed());
        logger.info( "Search box is visible");
	
	  }

		 public  void EnterKeyword(String laptop) {
		        driver.findElement(searchButton_terms).sendKeys(laptop);
		        logger.info( "Enter username and password");
		 
		 }
	public void searchButton_textIcon() {
		driver.findElement(searchButton_text).isDisplayed();
		logger.info( "Text Displayed in the searchBox");
		
	}
	public void HeaderLogoIcon() {
		driver.findElement(HeaderLogo).isDisplayed();	
		logger.info( "The header of Website is displayed");
		
	}

}