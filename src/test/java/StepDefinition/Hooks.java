package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

public static final Logger logger = LogManager.getLogger(Hooks.class);
public static  WebDriver driver;// declaration 
 String url= "https://demo.nopcommerce.com/";
 
    

	@Before
	public void beforeScenario() throws IOException
	{

		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver(); //defining
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get(url);	
		   logger.info("Open the Browser ");
	}
	

	@After
	public void afterScenario() throws Throwable
	{
		driver.close();
		logger.info("Close the Browser ");
	}
	
	public static String captureScreenshot(String screenShotName) throws IOException {
	    File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    String destinationDirectory = "C:\\Users\\sonali\\eclipse-workspace\\BDDCucumberFramework\\Screenshots";
	    String fileName = screenShotName + ".png";
	    File destination = new File(destinationDirectory, fileName);
	    FileUtils.copyFile(source, destination);
	    return destination.getAbsolutePath();
	
}}