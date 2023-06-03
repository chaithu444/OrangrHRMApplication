package com.qa.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	@Test
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	}
}
 