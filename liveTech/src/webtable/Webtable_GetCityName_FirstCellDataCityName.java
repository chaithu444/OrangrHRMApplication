package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_GetCityName_FirstCellDataCityName{
	WebDriver driver;
	
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
      public void getCityNameTest() {
    	//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
    	  By cityNameLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a");
    	  WebElement  CityName = driver.findElement(cityNameLocator);
    	  String cityNameText=CityName.getText();
    	  System.out.println(cityNameText);
    	  //System.out.println("The CityName is:-"+ cityNameText);
      }
    	  public static void main(String[] args){
    		  Webtable_GetCityName_FirstCellDataCityName cityName =new Webtable_GetCityName_FirstCellDataCityName();
    		  cityName.Setup();
    		  cityName.getCityNameTest();
    		  cityName.teardown();
    	  }
}

