package Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

// Demonstrates a basic SauceDemo login flow and verifies that the Products page loads successfully.
public class SimpleJava{



	// Launch the site, perform login, confirm the landing page text, and close the browser.
	public static void main(String[] args)  throws InterruptedException {

		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\911374\\OneDrive - Cognizant\\Desktop\\chrome-win64\\chromedriver.exe");


		// Start a new Chrome browser session and open the SauceDemo login page.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000); 

		// Enter the standard test user credentials and sign in.
		driver.findElement(By.xpath("//input[@id = 'user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
		Thread.sleep(3000);


		// Read the heading text shown on the inventory page after login.
		String greeting = driver.findElement(By.xpath("//*[@id = 'inventory_filter_container']")).getText();
		// Print the heading text so the page transition can be seen in the console.
		System.out.print(greeting);
		// Track whether the expected Products label is present.
		boolean result = false;
		
		// Mark the result as true when the inventory page heading contains Products.
		if(greeting.contains("Products")) {
			result = true;
		}

		// Verify that login succeeded by asserting the expected page label was found.
		Assert.assertEquals(true, result);

		// Print a final message after the verification step completes.
		System.out.println("greeting");



		// Close the browser at the end of the demo flow.
		driver.close();
	}

}
