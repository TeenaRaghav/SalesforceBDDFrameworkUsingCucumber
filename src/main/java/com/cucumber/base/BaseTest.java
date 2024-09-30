package com.cucumber.base;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.cucumber.utilities.PropertiesFile;
import com.cucumber.utilities.ScreenshotUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static WebDriver driver;

	static PropertiesFile prop = new PropertiesFile();

	@Before
	public static void launchapplication(String browserName) throws IOException{
		driver = getDriver(browserName);
		String appUrl = prop.getProperties("url");
		driver.get(appUrl);
	}
	
	public static WebDriver getDriver(String browserName) {
		if (driver==null) {
			if (browserName.equalsIgnoreCase("Chrome")) {
//				WebDriverManager.chromedriver().setup();
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
	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			
			String screenshotName = scenario.getName().replaceAll(" ", "_");
            ScreenshotUtility.takescreenshot(driver);

		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", screenshotName);
		driver.quit();
		driver = null;
		}
	}

		}
