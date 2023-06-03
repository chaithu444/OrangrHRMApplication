package com.ScreenShot;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_BingHomePage {
	
	public static void main(String[] args) throws IOException {


		WebDriver driver;
	String applicationUrlAddress="http://bing.com"; // variable saved with url Address
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\liveTech\\browser driver files\\chromedriver.exe");
	driver = new ChromeDriver();
	
	// Maximizing the Browser
	driver.manage().window().maximize();
		
	driver.get(applicationUrlAddress); // passing the variableName - instead of urlAddress
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File f= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, (new File("C:\\Selenium\\liveTech\\src\\screenshots.png")));
	
	
	driver.quit();
			
	}
}


