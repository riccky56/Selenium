package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates a simple MakeMyTrip flow using visibility checks, date selection, and passenger count updates.
public class mmt {
	public static WebDriver driver;
	// Open the site, inspect a travel control, choose a date, and increase the number of adults.
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
        driver.manage().window().maximize();
		// isDisplayed() is useful when an element exists in the DOM and we want to know whether it is visible.

		// Open the MakeMyTrip home page.
		driver.get("http://www.makemytrip.com/");
		Thread.sleep(3000);
		//driver.findElement(By.className("commonModal__close")).click();

		// Print a label before checking the visibility state.
		System.out.println(" Before clikcing on Multi city Radio button");

		// Print whether the return field is displayed before interacting with trip options.
		System.out.println(driver.findElement(By.xpath("[//*[@id='return']")).isDisplayed());

		//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();

		//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).isEnabled();

		// Print a label after the trip-type check.
		System.out.println(" After clikcing on Multi city Radio button");

		// Open the departure date section.
		driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[3]")).click();

		// Choose a date from the displayed calendar.
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[3]/a")).click();

		// Counter used to click the adult increment control multiple times.
		int i=0;

		// Increase the adult passenger count five times.
		while(i<5)

		{

			// Click the plus button for the adult passenger field.
			driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();

			i++;

		}

		//System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

		//System.out.println(driver.findElement(By.xpath(".//*[@id='mui_city_button']/span")).isDisplayed());

		Thread.sleep(3000L);

		//System.out.println(driver.findElement(By.xpath(".//*[@id='responsive_bottom']/div[2]/div[1]/div/div/h3")).getText());

		//If you want to validate the object which is present in web page or code base

		// Count matching elements to verify whether the multi-city control is present.
		int count=driver.findElements(By.xpath(".//*[@id='mui_city_button']/span")).size();

		// If the element count is zero, print a confirmation based on this test's expectation.
		if (count==0)

		{

			// Print a simple verification message.
			System.out.println("verified");

		}
	}
}
