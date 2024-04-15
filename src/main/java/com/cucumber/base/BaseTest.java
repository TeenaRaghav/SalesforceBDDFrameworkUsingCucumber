package com.cucumber.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.cucumber.utilities.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static WebDriver driver;

	static PropertiesFile prop = new PropertiesFile();

	public static void launchapplication(String browserName) throws IOException{
		driver = getDriver(browserName);
		String appUrl = prop.getProperties("url");
		driver.get(appUrl);
	}

	public static WebDriver getDriver(String browserName) {
		if (driver==null) {
			if (browserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} else if(browserName.equalsIgnoreCase("Safari")) {
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
			}
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
}
