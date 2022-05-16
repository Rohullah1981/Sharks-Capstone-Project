package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="classpath:feature", //We provide path of feature folder
		glue = "step.definition",  // we provide path of definitions classes
		tags = "@DesktopTest",               // with tag we will run our test cases
		dryRun = false,            // dryRun checks if there is any missing step def
		monochrome = true,         //it makes console readable
		strict = true,             // this will mark a scenario failded if one step faild
		plugin = {"pretty", "html:targer/site/cucumber-pretty",
				"json:target/cucumber.json"},
		publish = true             // this will generate execution report
		)

public class TestRunner {
	

	
	

}