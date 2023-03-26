package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features={".//Features/"},
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/HtmlReport",
				"json:JSONReports/report.json",
				"junit:JUnitReports/report.xml",
				 "json:target/cucumber.json"},
		tags ="@Sanity"
		
		)

public class TestRun {

	
	
	}
