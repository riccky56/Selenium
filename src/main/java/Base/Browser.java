package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Provides a shared helper to launch the browser and open the SauceDemo application.
public class Browser {
	
	public static WebDriver driver;
	
	
	// Start a Chrome session, navigate to the login page, and prepare the browser for testing.
	public static void startBrowser(){
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	// Maximize the browser so all elements are fully visible during the test run.
	driver.manage().window().maximize();
	// Clear cookies to ensure the session starts in a clean state.
	driver.manage().deleteAllCookies();
	}
}
