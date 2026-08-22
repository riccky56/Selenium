package action;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates using JavaScriptExecutor for browser zoom changes and element scrolling.
public class javascriptdemo2 {
	
  static WebDriver driver;
	// Open the demo site, change the zoom level several times, and show the intended scrollIntoView pattern.
	public static void main(String[] args) {

		driver = new ChromeDriver();

		// Open the sample e-commerce site where the JavaScript effects can be observed.
		driver.get("https://demo.nopcommerce.com/");

		// Maximize the browser to make the page easier to inspect.
		driver.manage().window().maximize();

		// Cast the driver so JavaScript commands can be executed directly in the page.
		JavascriptExecutor js = (JavascriptExecutor)driver;

		// Reduce the page zoom to 50%.
		js.executeScript("document.body.style.zoom='50%'");

		// Increase the page zoom to 80%.
		js.executeScript("document.body.style.zoom='80%'");

		// Change the zoom again to 70%.
		js.executeScript("document.body.style.zoom='70%'");

		// Set the final zoom level to 90%.
		js.executeScript("document.body.style.zoom='90%'");
		
		
		// Placeholder element reference intended for a scrollIntoView JavaScript example.
		WebElement ele = null;
		// Intended JavaScript pattern for scrolling a target element into view.
		js.executeScript("windows.scrollIntoView(true)",ele );




	}

}
