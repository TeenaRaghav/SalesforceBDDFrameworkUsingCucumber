package com.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Features\\Usermenu.feature","Features\\Accounts.feature","Features\\Contacts.feature",
		"Features\\Leads.feature","Features\\Login.feature","Features\\Opportunities.feature","Features\\RandomScenarios.feature"},
				 glue = {"com.cucumber.steps"},
				 plugin= {"pretty", "html:target/cucumber-reports/cucumber.html",
						 "json:target/cucumber-reports/cucumber.json"},
				 monochrome= true,//it is controls whether console output is colorful and readable. When set to true, monochrome prints console output without color, 
				 //making it more readable. When set to false, which is the default value, monochrome prints console output with color, but some characters may be unreadable.
				 dryRun= false// option that compiles feature files and step definitions, and verifies that each step in the feature file has a corresponding step definition in the step definition file. The dry run option can be set to true or false, with the default value being false.
				 //When set to true, Cucumber will verify individual steps in the feature file and the implementation code of steps in the feature file within the step definition file
		
		)

public class Runner {

}
