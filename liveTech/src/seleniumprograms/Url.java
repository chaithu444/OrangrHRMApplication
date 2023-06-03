package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://google.com");
	}

}
