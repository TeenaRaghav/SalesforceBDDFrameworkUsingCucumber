package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class HomePage extends BasePage{
	static WebDriver driver;
	public HomePage() {
		super(driver = BaseTest.getDriver("Chrome"));
		
		addObject("Usermenu",By.xpath("//div[@id='userNavButton']"));
		addObject("Logout",By.xpath("//a[normalize-space()='Logout']"));
		
	}

}
