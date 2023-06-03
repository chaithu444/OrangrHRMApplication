package com.testNG;

import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddEmployee extends OrangeHRM_Login {
	@Test(priority = 1)
	public void AddEmployee() throws InterruptedException, IOException  {
	//driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	//driver.findElement(By.id("txtUsername")).sendKeys("livetech");
	//driver.findElement(By.id("txtPassword")).sendKeys("Livetech@12345");
	//driver.findElement(By.className("button")).click();
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("menu_pim_addEmployee")).click();
     driver.findElement(By.id("firstName")).sendKeys("shiva");
	driver.findElement(By.id("lastName")).sendKeys("parvathi");
	Actions actions=new Actions(driver);
	actions.sendKeys(Keys.TAB).build().perform();
	actions.sendKeys(Keys.TAB).build().perform();
	actions.sendKeys(Keys.ENTER).build().perform();
	
	//driver.findElement(By.id("photofile")).click();
	Thread.sleep(5000);
	java.lang.Runtime.getRuntime().exec("C:\\Selenium\\liveTech\\photo\\photo upload.exe");
	Thread.sleep(5000);
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.partialLinkText("Welcome Admin")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[text()='Logout']")).click();
	driver.close();
	
	}

}
