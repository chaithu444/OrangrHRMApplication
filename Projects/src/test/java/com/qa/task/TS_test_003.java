package com.qa.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


	public class TS_test_003 extends ParentClass {

		private WebDriver driver;

		@Test(priority = 0,description = "validate url")
		public void tc_01() {
			driver.get("https://www.google.com/");
			
			String act=driver.getTitle();
			
		}
		
		@Test(priority = 1,description = "validate names")
		public void tc_02() {
			Hpage hp=new Hpage(driver);
			hp.textLinks();
		}
		
		@Test(priority = 2,description = "validate total links count")
		public void tc_03() {
			
			int expCount=30;
			Hpage hp=new Hpage(driver);
		
			int totalLinks=hp.totalCount();
			System.out.println("The total links are = "+totalLinks);
			
	       Assert.assertEquals(totalLinks, expCount);
				
		}
		
		@Test(priority = 3,description = "validate visable count")
		public void tc_04() {
			Hpage hp=new Hpage(driver);
			
			int visableLinks=hp.visableCount();
			System.out.println("The visable links are = "+visableLinks);
			
			
		}
		
		@Test(priority = 4,description = "validate invisable")
		public void tc_05() {
			Hpage hp=new Hpage(driver);
			
			int invisableLinks=hp.invisableCount();
			System.out.println("The invisable links are = "+invisableLinks);
			
		}
	}
	

	