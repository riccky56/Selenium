package webtablesandjavascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Class declaration that groups the related example logic in one place.
public class javascriptdemo {
	
  static WebDriver driver;
	// Main method where program execution starts.
	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("document.body.style.zoom='50%'");

		js.executeScript("document.body.style.zoom='80%'");

		js.executeScript("document.body.style.zoom='70%'");

		js.executeScript("document.body.style.zoom='90%'");




	}

}
