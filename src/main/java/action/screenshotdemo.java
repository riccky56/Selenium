package action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates how to capture a browser screenshot and save it to a local file.
public class screenshotdemo {
  static WebDriver driver;
	// Open a page, take a screenshot of the current browser view, and store the image on disk.
	public static void main(String[] args) throws IOException {
		
		driver = new ChromeDriver();
		
		// Open Google so the browser view can be captured.
		driver.get("https://google.com");
		// Maximize the window before taking the screenshot.
		driver.manage().window().maximize();
		
		// Cast the driver to TakesScreenshot so the current browser view can be captured.
		TakesScreenshot ts = (TakesScreenshot)driver;
		// Capture the screenshot as a temporary file.
		File src = ts.getScreenshotAs(OutputType.FILE) ;
		
		// Copy the temporary screenshot file to the desired local path.
		FileUtils.copyFile(src, new File ("C:\\Users\\911374\\eclipse-workspace\\Learning\\screenshots\\new.png"));
		
		// Close the browser after the screenshot is saved.
		driver.close();
		

	}

}
