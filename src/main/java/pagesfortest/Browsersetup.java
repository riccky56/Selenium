
package pagesfortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Browsersetup {


	public static WebDriver driver;


	public static void startBrowser(){
		driver = new ChromeDriver();

		//driver = new FirefoxDriver();

		//driver = new EdgeDriver();
		
	
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
}

