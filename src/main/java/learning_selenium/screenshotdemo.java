package learning_selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Class declaration that groups the related example logic in one place.
public class screenshotdemo {
  static WebDriver driver;
	// Main method where program execution starts.
	public static void main(String[] args) throws IOException {
		
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		
		FileUtils.copyFile(src, new File ("C:\\Users\\911374\\eclipse-workspace\\Learning\\screenshots\\new.png"));
		
		driver.close();
		

	}

}
