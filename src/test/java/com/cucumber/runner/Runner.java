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
				 monochrome= true,
				 dryRun= false
		
		)

public class Runner {

}
