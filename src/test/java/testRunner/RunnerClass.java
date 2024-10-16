package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions (
		features = "C:\\Users\\Parul\\OneDrive - R Systems International Ltd\\Documents\\BDDCucumberFramework\\BDDCucumberFramework\\src\\test\\java\\FeatureFiles\\FeatureFiles"   
		,glue={"StepDefinition",},
		plugin = { "pretty", "html:cucumber-reports/cucumber-reports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		dryRun = false,
		monochrome=true
		  	
		)
public class RunnerClass {
	

}                                                                                                                

