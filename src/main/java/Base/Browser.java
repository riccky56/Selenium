package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Class declaration that groups the related example logic in one place.
public class Browser {
	
	public static WebDriver driver;
	
	
	// Helper method used to perform a specific part of the program logic.
	public static void startBrowser(){
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}
}
