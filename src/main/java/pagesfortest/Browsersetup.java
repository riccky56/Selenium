
package pagesfortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

// Provides a shared browser setup method for tests that run against the SauceDemo site.
public class Browsersetup {


	public static WebDriver driver;


	// Start the browser, open the application, and prepare a clean session for test execution.
	public static void startBrowser(){
		driver = new ChromeDriver();

		//driver = new FirefoxDriver();

		//driver = new EdgeDriver();
		
	
		// Open the SauceDemo login page.
		driver.get("https://www.saucedemo.com/");
		// Maximize the browser so page elements are fully visible.
		driver.manage().window().maximize();
		// Clear cookies to avoid reusing state from earlier runs.
		driver.manage().deleteAllCookies();
	}
}

