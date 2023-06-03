package com.qa.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParentClass {
	public WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
  }
}
