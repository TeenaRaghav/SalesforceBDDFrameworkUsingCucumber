package com.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="@target/failedScenarios.txt",
		plugin = {"pretty","html:target/cucumber-reports/cucumber.html",
				"json:target/cucumber-reports/cucumber.json"},
		glue = {"com.cucumber.steps"},
		monochrome = true,
		 tags="@Test"
		)
public class FailedScenariosTestRunner {

}
