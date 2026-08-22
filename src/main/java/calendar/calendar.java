package calendar;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// Class declaration that groups the related example logic in one place.
public class calendar {
 public static WebDriver driver;

	// Main method where program execution starts.
	public static void main(String[] args) throws InterruptedException {
		 driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser//"https://rahulshettyacademy.com/dropdownsPractise/

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		// Display information to the console for the user.
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Display information to the console for the user.
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		// Display information to the console for the user.
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

		// Check the condition before deciding whether this block should run.
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		{
		// Display information to the console for the user.
		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		// Execute this block when the earlier conditions do not match.
		else
		{
		Assert.assertTrue(false);
		}

		driver.close();

	}

}
