
package pagesfortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

// Class declaration that groups the related example logic in one place.
public class Browsersetup {


	public static WebDriver driver;


	// Helper method used to perform a specific part of the program logic.
	public static void startBrowser(){
		driver = new ChromeDriver();

		//driver = new FirefoxDriver();

		//driver = new EdgeDriver();
		
	
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
}

