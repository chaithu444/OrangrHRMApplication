package webtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {
 public WebDriver driver;
	
	public void Setup() 
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	driver=new ChromeDriver();
	String UrlAddress="https://www.timeanddate.com/worldclock/";
	//String applicationUrlAddress;
	driver.get(UrlAddress);
	}
  public void teardown() {
	  driver.quit();
  }


}
