package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExOrangeHRMLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\liveTech\\browser driver files\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("livetech");
		driver.findElement(By.id("txtPassword")).sendKeys("Livetech@12345");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
	     driver.findElement(By.id("firstName")).sendKeys("shiva");
		driver.findElement(By.id("lastName")).sendKeys("parvathi");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.partialLinkText("Welcome Admin")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		driver.close();
		
		
		
	}
	
	

}
