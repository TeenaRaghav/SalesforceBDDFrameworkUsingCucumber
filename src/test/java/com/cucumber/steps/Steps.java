package com.cucumber.steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;
import com.cucumber.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseTest {
	BasePage page;
	WebDriver driver;

	@Given("User launch the application in {string}")
	public void user_launch_the_application_in(String browserName) throws IOException {
		launchapplication(browserName);
	}

	@Given("User is on {string}")
	public void user_is_on(String string) {
	}

	@Then("User Enter into text box {string} {string}")
	public void user_enter_into_text_box(String logicalName, String value) {
		page.enterIntoTextBox(logicalName, value);
	}

	@Then("Click on the button {string}")
	public void click_on_the_button(String logicalName) {
		page.clickOnButton(logicalName);
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
