package com.getTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Google_getTitle {
	public static void main(String[]args) {
		WebDriver driver;
		String applicatinUrlAddress="http://google.com";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(applicatinUrlAddress);
	    String googleHomePageTitle= driver.getTitle();
	    
		System.out.println("The title of the GoogleHomePage is:-"+googleHomePageTitle);
		String applicatinUrlAddress1="https://www.facebook.com/";
	//.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
	//	driver=new ChromeDriver();
		driver.get(applicatinUrlAddress1);
	   String facebookHomePageTitle= driver.getTitle();
	    
		
		String facebookHomePageUrlAddres=driver.getCurrentUrl();
	String facebookHomePageUrlAddress = "https://www.facebook.com/";
		//	String facebookHomePageUrlAddress = null;
		System.out.println("The UrlAddress of FacebookHomePage is:-"+facebookHomePageUrlAddress);
	  //  driver.quit();
		

	}

}
