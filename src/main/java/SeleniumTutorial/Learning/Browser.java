package SeleniumTutorial.Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver driver;
	
	public static void startBrowser() {
		
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver = new FirefoxDriver();
		
		driver = new EdgeDriver();
		
	}

}
