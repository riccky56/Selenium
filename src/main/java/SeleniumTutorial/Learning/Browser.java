package SeleniumTutorial.Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Class declaration that groups the related example logic in one place.
public class Browser {
	
	public static WebDriver driver;
	
	// Helper method used to perform a specific part of the program logic.
	public static void startBrowser() {
		
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver = new FirefoxDriver();
		
		driver = new EdgeDriver();
		
	}

}
