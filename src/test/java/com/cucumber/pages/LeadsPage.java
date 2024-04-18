package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class LeadsPage extends BasePage{
	static WebDriver driver;
	public LeadsPage() {
		super(driver=BaseTest.getDriver("Chrome"));
		addObject("LeadsPageTitle",By.xpath("//div[@class=\"bPageTitle\"]/div/div/h1"));
		addObject("View",By.xpath("//select[@name=\"fcf\"]"));
		addObject("Go",By.xpath("(//input[@class=\"btn\"])[2]"));
		addObject("TodaysLeadPageDropdown",By.xpath("//select[@id='fcf']"));
		addObject("New",By.xpath("//input[@title='New']"));
		addObject("LastName",By.xpath("//input[@id=\"name_lastlea2\"]"));
		addObject("CompanyName",By.xpath("//input[@id='lea3']"));
		addObject("Save",By.xpath("(//input[@value=' Save '])[1]"));
	
	}

}
