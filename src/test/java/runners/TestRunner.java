package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\SeleniumCopy\\Selenium_WorkSpace_Copy\\CucumberProject\\src\\test\\java\\features\\login.feature" }, // the
																													// path
		// of
		// the
		// feature
		// files
		glue = { "stepDefinitions" }, // step defination name
		plugin = { "pretty" }, 
		monochrome = true, // display the console output in a proper readable format
		dryRun = false // to check the mapping is proper between the feature files and step def file
)

public class TestRunner {

}
