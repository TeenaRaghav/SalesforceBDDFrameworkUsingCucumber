package com.cucumber.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

	protected WebDriver driver;
	HashMap<String, By> ObjectRepo = new HashMap<String, By>();

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterIntoTextBox(String logicalName, String value) {
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
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));		
	}
	public void clickonRadioButton(String logicalName) {
		WebElement element = getElement(logicalName);
		element.click();	
	}
	public void validateText(String logicalName, String expectedText) {
		WebElement element = getElement(logicalName);
		waitforElement(logicalName);
		String ActualText = element.getText();
		Assert.assertEquals(ActualText, expectedText);
	}
	public void checkTheCheckBox(String logicalName) {
		WebElement element = getElement(logicalName);
		if(!element.isSelected()) {
			element.click();
		}
	}
	public void clickOnTheLink(String logicalName) {
		WebElement element = getElement(logicalName);
		element.click();
	}
	
	public void switchToFrame(String logicalName) {
		WebElement element = getElement(logicalName);
		driver.switchTo().frame(element);
	}

	public void switchToDefaultFrame() {
		driver.switchTo().defaultContent();
		
	}
	public void uploadFile(String logicalName,String path) {
		WebElement element =getElement(logicalName);
		element.sendKeys(path);
	}
	public void hoverToElement(String logicalName) {
		WebElement element = getElement(logicalName);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
}
