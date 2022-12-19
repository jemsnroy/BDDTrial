package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\SeleniumCopy\\Selenium_WorkSpace_Copy\\CucumberProject\\src\\test\\java\\features" }, glue = {
				"stepDefinitions" }, // step defination name
				plugin = {"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}, 
		//monochrome = true, // display the console output in a proper readable
																		// format
		dryRun = false // to check the mapping is proper between the feature files and step def file
)

public class TestRunner {

}
