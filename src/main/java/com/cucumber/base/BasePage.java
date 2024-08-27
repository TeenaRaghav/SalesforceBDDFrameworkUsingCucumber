package com.cucumber.base;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cucumber.utilities.PropertiesFile;

public class BasePage {
	protected WebDriver driver;
	JavascriptExecutor js;
	Select select;
	String actualUsernameLink;
	String expectedUsernameLink;
	String usernameOnProfilepage;
	PropertiesFile prop = new PropertiesFile();
	HashMap<String, By> ObjectRepo = new HashMap<String, By>();

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterIntoTextBox(String logicalName, String value) throws IOException {
		WebElement element = getElement(logicalName);
		element.clear();
		element.sendKeys(value);
	}

	public void clickOnButton(String logicalName) {
		WebElement element = getElement(logicalName);
		element.click();
	}

	public void addObject(String logicalName, By by) {
		ObjectRepo.put(logicalName, by);
	}

	public WebElement getElement(String logicalName) {
		By by = ObjectRepo.get(logicalName);
		WebElement element = driver.findElement(by);
		return element;
	}

	public void waitforElement(String logicalName) {
		WebElement element = getElement(logicalName);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void clickonRadioButton(String logicalName) {
		WebElement element = getElement(logicalName);
		if (!element.isSelected()) {
			element.click();
		}
	}

	public void validateText(String logicalName, String expectedText) {
		WebElement element = getElement(logicalName);
		waitforElement(logicalName);
		String ActualText = element.getText();
		Assert.assertEquals(ActualText, expectedText);
	}

	public void checkTheCheckBox(String logicalName) {
		WebElement element = getElement(logicalName);
		if (!element.isSelected()) {
			element.click();
		}
	}

	public void clickOnTheLink(String logicalName) {
		WebElement element = getElement(logicalName);
		element.click();
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	public void waitForPageToLoad() throws InterruptedException {
		Thread.sleep(6000);
	}

	public void scrolldown() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
	}

	public void switchToFrame(String logicalName) {
		WebElement element = getElement(logicalName);
		driver.switchTo().frame(element);
	}

	public void switchToDefaultFrame() {
		driver.switchTo().defaultContent();

	}

	public void uploadFile(String logicalName, String path) {
		WebElement element = getElement(logicalName);
		element.sendKeys(path);
	}

	public void hoverToElement(String logicalName) {
		WebElement element = getElement(logicalName);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public void selectText(String logicalName, String value) {
		WebElement element = getElement(logicalName);
		select = new Select(element);
		select.selectByVisibleText(value);
	}

	public void selectValue(String logicalName, String value) {
		WebElement element = getElement(logicalName);
		select = new Select(element);
		select.selectByValue(value);
	}

	public void selectIndex(String logicalName, int index) {
		WebElement element = getElement(logicalName);
		select = new Select(element);
		select.selectByIndex(index);
	}

	public void switchToChildWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> Handles = driver.getWindowHandles();
		for (String handle : Handles) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
			}
		}
	}

	public String getParentWindow() {
		String parentWindow = driver.getWindowHandle();
		return parentWindow;
	}

	public void switchToParentWindow(String parentWindow) {
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
			}
		}
		driver.switchTo().window(parentWindow);
	}

	public void compareWindowsTitle(String expectedTitle) {
		String parentWindow = driver.getWindowHandle();
		String parentWindowTitle = driver.getTitle();
		Set<String> listofhandles = driver.getWindowHandles();
		for (String handle : listofhandles) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				String childWindowTitle = driver.getTitle();
				Assert.assertEquals(childWindowTitle, expectedTitle);
			}
		}
	}

	public void validateSelectedOption(String logicalName, String expectedText) {
		WebElement element = getElement(logicalName);
		select = new Select(element);
		WebElement selectedText = select.getFirstSelectedOption();
		String ActualText = selectedText.getText();
		Assert.assertEquals(ActualText, expectedText);
	}
	
	public void validateUsernameOnUrl(String logicalName,String expectedtitle,String expectedUrl) {
		WebElement element = getElement(logicalName);
		String actualTitle = element.getText();
		String actualurl = driver.getCurrentUrl();
		if (actualTitle.equals(expectedtitle) && actualurl.equals(expectedUrl)) {
			System.out.println("You are on homepage");
		}
	}
	
	public void getNamesFrompages(String logicalName, String value) {
		WebElement element = getElement(logicalName);
		usernameOnProfilepage=element.getText();
		actualUsernameLink =element.getText();
		expectedUsernameLink = value;
	}
	public void compareNameOnPage() {
		if(actualUsernameLink.equals(expectedUsernameLink) && expectedUsernameLink.equals(usernameOnProfilepage)) {
			System.out.println("Names are same on both pages");
		}
	}

}
