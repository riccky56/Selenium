package SeleniumTutorial.Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Shared browser helper that centralizes WebDriver startup logic.
public class Browser {
	
	public static WebDriver driver;
	
	// Initialize the desired browser driver and apply common startup actions.
	public static void startBrowser() {
		
		//driver = new ChromeDriver();
		// Maximize window for stable element visibility across tests.
		driver.manage().window().maximize();
		
		//driver = new FirefoxDriver();
		
		// Current default browser choice for this project.
		driver = new EdgeDriver();
		
	}

}
