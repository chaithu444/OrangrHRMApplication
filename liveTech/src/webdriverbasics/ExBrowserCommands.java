package webdriverbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExBrowserCommands
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\liveTech\\browser driver files\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		Thread.sleep(3000);
		System.out.println("Title is:" + title);
		String Title=driver.getTitle();
		String currentURL=driver.getCurrentUrl();
		System.out.println("Current URL is:" + currentURL);
		//String sourceCode= driver.getPageSource();
		//System.out.println("SourceCode is:" + sourceCode);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
		
	}

}
