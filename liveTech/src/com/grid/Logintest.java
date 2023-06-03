package com.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Logintest {
	@Parameters("Browser")
	@Test
	public void Logintest(String browserName) throws MalformedURLException 
	{
		System.out.println(browserName);
	    
        DesiredCapabilities cap=null;
        if(browserName.equals("chrome")) 
        {
        	cap=DesiredCapabilities.chrome();
        	cap.setBrowserName("chrome");
        	cap.setPlatform(Platform.WINDOWS);
        	
        }
        else
        	if(browserName.equals("edge")) {
        		cap=DesiredCapabilities.edge();
        		cap.setBrowserName("edge");
        		cap.setPlatform(Platform.WINDOWS);
        		
        		
        	}
        RemoteWebDriver driver= new RemoteWebDriver(new URL(" http://192.168.0.131:4444/wd/hub"), cap);
        String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
        driver.get(applicationUrlAddress);
        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("livetech");
        driver.findElement(By.name("txtPassword")).sendKeys("Livetech@12345");
        driver.findElement(By.className("button")).click();
        
        
        
        
		
	}

}
