package validatingfacebook;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Facebook_Title_UrlAddress_Validation {

	public static void main(String[] args) {


	// Facebook – log in or sign up

	WebDriver driver;
	String applicationUrlAddress="https://www.facebook.com/"; // variable saved with url Address

	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\Chromedriver.exe");
	driver= new ChromeDriver();
	//driver = new FirefoxDriver();

	driver.get(applicationUrlAddress); // passing the variableName - instead of urlAddress

	String expected_FacebookHomePageTitle="Facebook – log in or sign up";
	System.out.println(" The expected Title of the Facebook Home Page is :- "+expected_FacebookHomePageTitle);

	String actual_FacebookHomePageTitle=driver.getTitle();
	System.out.println(" The actual Title of the Facebook Home Page is :- "+actual_FacebookHomePageTitle);

	// Validating FaceBook Home Page Title

	if(actual_FacebookHomePageTitle.equals(expected_FacebookHomePageTitle))
	{
	System.out.println(" Facebook Home Page Title Matched - PASS ");
	}
	else
	{
	System.out.println(" Facebook Home Page Title NOT Matched - FAIL ");
	}

	// Validating Url Address of Facebook Home Page

	String expected_FacebookHomePageUrlAddress="facebook.com";
	System.out.println(" The Expected Url address of Facebook Home Page is:- "+expected_FacebookHomePageUrlAddress);

	String actual_FacebookHomePageUrlAddress=driver.getCurrentUrl();
	System.out.println(" The actual Url Address of facebook Home Page is :- "+actual_FacebookHomePageUrlAddress);

	if(actual_FacebookHomePageUrlAddress.contains(expected_FacebookHomePageUrlAddress))
	{
	System.out.println(" Successfully navigated to Facebook  Home Page - Url Address matched - PASS");
	}
	else
	{
	System.out.println("Failed to navigated to Facebook  Home Page - Url Address NOT matched - FAIL");

	//driver.quit();
	}



	}

	}



