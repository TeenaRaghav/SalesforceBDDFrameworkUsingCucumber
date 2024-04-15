package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class UsermenuPage extends BasePage {
	static WebDriver driver;
	public UsermenuPage(){
		super(driver=BaseTest.getDriver("Chrome"));
		
		addObject("Usermenu",By.xpath("//div[@id='userNavButton']"));
		addObject("Logout",By.xpath("//a[normalize-space()='Logout']"));
		addObject("MyProfile",By.xpath("//a[contains(text(),'My Profile')]"));
		addObject("Edit",By.xpath("//a[@class=\"contactInfoLaunch editLink\"]"));
		addObject("AboutFrame",By.id("contactInfoContentId"));
		addObject("AboutTab",By.id("aboutTab"));
		addObject("LastName",By.xpath("//input[@class = 'lastName zen-inputFull zen-input']"));
		addObject("SaveAll",By.xpath("//input[@class ='zen-btn zen-primaryBtn zen-pas']"));
		addObject("MySettings",By.xpath("//a[contains(text(),'My Settings')]"));
		addObject("PersonalInfo",By.id("PersonalInfo_font"));
		addObject("LoginHistory",By.xpath("//a[@id='LoginHistory_font']"));
		addObject("LoginHistoryLink",By.xpath("//a[contains(text(),'Download login history for last six months, "
				+ "including logins from outside the website, such as API logins (Excel .csv file) »')]"));
		addObject("DisplayAndLayout",By.id("DisplayAndLayout_font"));
		addObject("CustomizeMyTab",By.xpath("//span[contains(text(),'Customize My Tabs')]"));
		addObject("CustomApp",By.xpath("//select[@id=\"p4\"]"));
		addObject("ReportTab",By.xpath("//select[@id=\"duel_select_0\"]"));
		addObject("AddTab",By.className("rightArrowIcon"));
		addObject("Save",By.xpath("//input[@class=\"btn primary\"]"));
		addObject("EmailTab",By.id("EmailSetup_font"));
		addObject("MyEmailSetting",By.id("EmailSettings_font"));
		addObject("EmailName",By.xpath("//input[@id=\"sender_name\"]"));
		addObject("EmailAddress",By.xpath("//input[@id=\"sender_email\"]"));
		addObject("YesRadioButton",By.xpath("//input[@id=\"auto_bcc1\"]"));
		addObject("CalendarsAndReminders",By.id("CalendarAndReminders_font"));
		addObject("ActivityReminders",By.xpath("//a[@id=\"Reminders_font\"]"));
		addObject("TestReminder",By.id("testbtn"));
		addObject("UserNameOnProfilePage",By.id("tailBreadcrumbNode"));

	}

}
