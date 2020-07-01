package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features" ,// features tell cucumber options where feature files are located
		glue = {"stepdefinitions"}, // glue tells cucumber options where are the setpdefinitions are located
		tags = {"@smoke"}, // tags tell the cucumber options which scenario or scenario outline or feature to run
		dryRun = false , // if dryRun sets to false it will scan all steps in scenario and scenario outline to find accociated steps
		// step definition in stepdefinitions class. if steps are missing it will print out them in console
		monochrome = true,// makes the console output readable
		strict = false, // if set to false it will fail the execution if there are pending steps
		format  = {"pretty",
		        "html:target/cucumber-reports/cucumber-pretty",
		        "json:target/cucumber-reports/CucumberTestReport.json",
		        "rerun:target/cucumber-reports/rerun.txt"
		},
		
		plugin = "json:target/cucumber-reports/CucumberTestReport.json"
				
		)
public class TestRunner {

}
