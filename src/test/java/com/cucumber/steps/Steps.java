package com.cucumber.steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;
import com.cucumber.pageFactory.PageFactory;
import com.cucumber.pages.LoginPage;
import com.cucumber.utilities.PropertiesFile;
import com.cucumber.utilities.ScreenshotUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest {
	BasePage page;
	String parentwindow;
	String childwindow;
	PropertiesFile prop = new PropertiesFile();
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
	public void user_enter_into_text_box(String logicalName, String value) throws IOException {
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

	@Then("User Checked the checkbox {string}")
	public void user_checked_the_checkbox(String logicalName) {
		page.checkTheCheckBox(logicalName);
	}

	@Then("User waits to load page")
	public void user_waits_to_load_page() throws InterruptedException {
		page.waitForPageToLoad();
	}

	@Then("User Click On the Link {string}")
	public void user_click_on_the_link(String logicalName) {
		page.clickOnTheLink(logicalName);

	}

	@When("User switches to the frame {string}")
	public void user_switches_to_the_frame(String logicalName) {
		page.switchToFrame(logicalName);
	}

	@Then("User Switches back to default frame")
	public void user_switches_back_to_default_frame() {
		page.switchToDefaultFrame();
	}

	@Then("Post Should be Successfully posted {string} {string}")
	public void post_should_be_successfully_posted(String logicalName, String value) {
		page.validateText(logicalName, value);
	}

	@Then("User selects file to upload {string} {string}")
	public void user_selects_file_to_upload(String logicalName, String path) {
		page.uploadFile(logicalName, path);
	}

	@Then("File should be Successfully uploaded {string} {string}")
	public void file_should_be_successfully_uploaded(String logicalName, String value) {
		page.validateText(logicalName, value);
	}

	@When("User hover over the element {string}")
	public void user_hover_over_the_element(String logicalName) {
		page.hoverToElement(logicalName);
	}

	@Then("User selects photo to upload {string} {string}")
	public void user_selects_photo_to_upload(String logicalName, String path) {
		page.uploadFile(logicalName, path);
	}

	@When("User selects by visible Text {string} {string}")
	public void user_selects_by_visible_text(String logicalName, String value) {
		page.selectText(logicalName, value);
	}

	@Then("User selects by value {string} {string}")
	public void user_selects_by_value(String logicalName, String value) {
		page.selectValue(logicalName, value);
	}

	@Then("User Click on the Radio button {string}")
	public void user_click_on_the_radio_button(String logicalName) {
		page.clickonRadioButton(logicalName);
	}

	@Then("User Accept the alert")
	public void user_accept_the_alert() {
		page.acceptAlert();
	}

	@Then("User verifies the window title {string}")
	public void user_verifies_the_window_title(String expectedTitle) {
		page.compareWindowsTitle(expectedTitle);
	}

	@Then("User scrolls down")
	public void user_scrolls_down() {
		page.scrolldown();
	}

	@Then("User gets the parent window handle")
	public void user_gets_the_parent_window_handle() {
		parentwindow = page.getParentWindow();
	}

	@Then("User switch to child window")
	public void user_switch_to_child_window() {
		page.switchToChildWindow();
	}

	@Then("User switch to parent window")
	public void user_switch_to_parent_window() {
		page.switchToParentWindow(parentwindow);
	}

	@Then("user validate page is displayed {string} {string}")
	public void user_validate_page_is_displayed(String logicalName, String expectedtext) {
		page.validateText(logicalName, expectedtext);
	}

	@Then("User validate Selected Option {string} {string}")
	public void user_validate_selected_option(String logicalName, String expectedText) {
		page.validateSelectedOption(logicalName, expectedText);
	}

	@Then("User validates Username on Page {string} {string} {string}")
	public void user_validates_username_on_page(String logicalName, String expectedTitle, String expectedUrl) {
		page.validateUsernameOnUrl(logicalName, expectedTitle, expectedUrl);
	}
	@Then("User validates names on pages {string} {string}")
	public void user_validates_names_on_pages(String logicalName, String value) {
		page.getNamesFrompages(logicalName, value);
	}
	@Then("User compare names {string}")
	public void user_compare_names(String value) {
		page.compareNameOnPage();
	}
	@Then("User close the window")
	public void user_close_the_window() {
	   driver.close();
	}



	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
            // Take a screenshot
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            ScreenshotUtility.takescreenshot(driver);

		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		driver.quit();
		driver = null;
		}
	}
}
