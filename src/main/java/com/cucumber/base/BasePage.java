package com.cucumber.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	protected WebDriver driver;
	HashMap<String, By> ObjectRepo = new HashMap<String, By>();

//	public BasePage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}

	public void enterIntoTextBox(String logicalName, String value) {
		WebElement element = getElement(logicalName);
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
}
