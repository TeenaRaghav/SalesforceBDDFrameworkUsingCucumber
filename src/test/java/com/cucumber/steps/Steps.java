package com.cucumber.steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;
import com.cucumber.pagefactory.PageFactory;
import com.cucumber.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseTest {
	BasePage page;
	PageFactory pageFactory = new PageFactory();

	@Given("User launch the application in {string}")
	public void user_launch_the_application_in(String browserName) throws IOException {
		launchapplication(browserName);
	}

	@Given("User is on {string}")
	public void user_is_on(String pageName) {
		page = pageFactory.initialize(pageName);
	}

	@Then("user waits for Element {string}")
	public void user_waits_for_element(String logicalName) {
		page.waitforElement(logicalName);
	}

	@Then("User Enter into text box {string} {string}")
	public void user_enter_into_text_box(String logicalName, String value) {
		page.enterIntoTextBox(logicalName, value);
	}

	@Then("Click on the button {string}")
	public void click_on_the_button(String logicalName) {
		page.clickOnButton(logicalName);
	}

	@Then("User verifies the message {string} {string}")
	public void user_verifies_the_message(String LogicalName, String expectedText) {
		page.validateText(LogicalName, expectedText);

	}

	@After
	public void tearDown(Scenario scenario) {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		driver.quit();
		driver = null;
	}
}
