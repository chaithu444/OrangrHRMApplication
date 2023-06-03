package com.qa.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.qa.Base.baseclass2;

public class test2 extends baseclass2 {
	
	WebDriver driver = new ChromeDriver();
	@Test
	public void test1() {
driver.get("https:www.google.com/");
	}

}
