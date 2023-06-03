package com.qa.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_001 {
	
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void TC_URL() {
		driver.get("https:www.google.com/");
	}

}
