package webtablesandjavascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates how to use JavaScriptExecutor to change the browser zoom level.
public class javascriptdemo {
	
  static WebDriver driver;
	// Open the site and apply different zoom values through JavaScript.
	public static void main(String[] args) {

		driver = new ChromeDriver();

		// Open the demo store page where the zoom effect can be observed.
		driver.get("https://demo.nopcommerce.com/");

		// Maximize the browser before running JavaScript commands.
		driver.manage().window().maximize();

		// Cast the driver to JavascriptExecutor so JavaScript can be executed directly in the page.
		JavascriptExecutor js = (JavascriptExecutor)driver;

		// Zoom out to 50% of the normal page size.
		js.executeScript("document.body.style.zoom='50%'");

		// Increase the zoom level to 80%.
		js.executeScript("document.body.style.zoom='80%'");

		// Adjust the zoom again to 70%.
		js.executeScript("document.body.style.zoom='70%'");

		// Set the zoom to 90% as the final view.
		js.executeScript("document.body.style.zoom='90%'");




	}

}
