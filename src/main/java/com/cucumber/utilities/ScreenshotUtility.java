package com.cucumber.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	public static void takescreenshot(WebDriver driver) {
//		takescreenshot object
		TakesScreenshot screenshot = ((TakesScreenshot) driver);

//		store this object in a file and takes the screenshot
		File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
		
//		create the time stamp
		Date current = new Date();
		String timestamp= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(current);
		
//		retrives the current working directory
		String userdir = System.getProperty("user.dir");

//		retrieves the system's file separator eg. "\" for windows and "/" UNIX
		String fileseperator = System.getProperty("file.separator");
		String filepath = userdir+fileseperator+"screenshots"+fileseperator+"Salesforce "+timestamp+".jpeg";

//		it is representing the destination file path where screenshots will be saved
		File destfile = new File(filepath);
		
		try {
			FileUtils.copyFile(srcfile, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
//1) The utility takes a screenshot of the current browser window using Selenium.
//2) It stores the screenshot with a unique filename in a specific directory (screenshots/Salesforce/)
//		based on the current date and time.
//3) It ensures platform independence by using System.getProperty for path separators.
//4) The screenshot is saved as a .jpeg file in the desired location.