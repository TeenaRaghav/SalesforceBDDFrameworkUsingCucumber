package com.cucumber.pages;

import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class HomePage extends BasePage{
	static WebDriver driver;
	public HomePage() {
		super(driver = BaseTest.getDriver("Chrome"));
	}

}
