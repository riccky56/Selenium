package action;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// Demonstrates how to locate and click an SVG element using an XPath expression with name().
public class Svgelement {
	static WebDriver driver;

	// Open the practice site and click the SVG icon inside the Practice Form link.
	@Test 
	public void method1()
	{

		// Launch a new Chrome browser session.
		driver= new ChromeDriver();

		// Open the Selenium practice login page.
		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// Print the interruption details if the pause is interrupted.
			e.printStackTrace();
		}

		// Use name()='svg' because SVG elements are handled differently from normal HTML tags in XPath.
		driver.findElement(By.xpath("//a[normalize-space()='Practice Form']//*[name()='svg']")).click();



		
	}

}
