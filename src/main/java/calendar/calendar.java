package calendar;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// Demonstrates how to select source and destination airports and verify trip-date controls.
public class calendar {
 public static WebDriver driver;

	// Launch the site, choose airports, and verify the return-date section behavior for trip type changes.
	public static void main(String[] args) throws InterruptedException {
		 driver =new ChromeDriver();
		// Open the travel booking practice page.
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Open the origin station dropdown.
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		// Choose Bangalore as the departure city.
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		// Wait briefly for the destination dropdown choices to refresh.
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		// Select Chennai as the destination from the destination panel.
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		// Print whether the return-date input is currently enabled before changing trip type.
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		// Switch the trip type to one-way.
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Print the style attribute of the return-date container to inspect whether it is disabled.
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

		// Click the same trip option again to keep the UI in the expected state for validation.
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		// Print the style attribute again after the interaction.
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

		// If the style contains the expected value, the return-date section is treated as enabled in this check.
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		{
		// Print a confirmation message when the expected state is found.
		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		// Fail the assertion if the page is not in the expected state.
		else
		{
		Assert.assertTrue(false);
		}

		// Close the browser after the verification is complete.
		driver.close();

	}

}
