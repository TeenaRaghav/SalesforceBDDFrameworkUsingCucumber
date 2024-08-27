package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class OpportunityPage extends BasePage {
	static WebDriver driver;
	public OpportunityPage() {
		super(driver = BaseTest.getDriver("Chrome"));
		addObject("OpportunityTabdropdown",By.xpath("//select[@id=\"fcf\"]"));
		addObject("New",By.xpath("//input[@name=\"new\"]"));
		addObject("OpportunityName",By.xpath("//input[@id=\"opp3\"]"));
		addObject("AccountName",By.xpath("//input[@id=\"opp4\"]"));
		addObject("CloseDate",By.xpath("//input[@id=\"opp9\"]"));
		addObject("CloseDateselectBtn",By.xpath("//table[@class='calDays']/tbody/tr[4]/td[3]"));
		addObject("Stage",By.xpath("//select[@id=\"opp11\"]"));
		addObject("Probability",By.xpath("//input[@id=\"opp12\"]"));
		addObject("LeadSource",By.xpath("//select[@id=\"opp6\"]"));
		addObject("PrimaryCampaignSource",By.id("opp17_lkwgt"));
		addObject("PrimaryCampaignSourceFrame",By.xpath("//frame[@id=\"resultsFrame\"]"));
		addObject("PrimaryCampaignlink",By.xpath("//a[contains(text(),'DM Campaign to Top Customers - Nov 12-23, 2001')]"));
		addObject("Save",By.xpath("//input[@name=\"save\"]"));
		addObject("OpportunityPipelineLink",By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		addObject("OpportunityPageHeading",By.xpath("//div[@class=\"content\"]/h1"));
		addObject("StuckOpportunityLink",By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		addObject("StuckOpportunityPageHeading",By.xpath("//div[@class=\"content\"]/h1"));
		addObject("Interval",By.xpath("//table[@class=\"opportunitySummary\"]/tbody/tr[1]/td[1]/select"));
		addObject("Include",By.xpath("//select[@id=\"open\"]"));
		addObject("RunAndReport",By.xpath("//input[@value=\"Run Report\"]"));
	}

}
