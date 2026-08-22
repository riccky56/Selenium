package calendar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates how to navigate a jQuery datepicker and choose a specific future date.
public class calendarone {
	static WebDriver driver;
	// Open the datepicker demo, navigate to the required month and year, then choose the target day.
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Switch into the example frame because the datepicker input is inside an iframe.
		driver.switchTo().frame(0);

		// Click the input field to open the calendar widget.
		driver.findElement(By.xpath("//*[id='datepicker']")).click();

		// Define the exact year, month, and day that should be selected.
		String year ="2025";  String month="August";       String date ="20";
		
		//driver.findElement(By.xpath("//*[id='datepicker']")).click();

		// Keep moving to the next month until the calendar header shows the required month and year.
		while(true) {
			String currentmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();

			// Stop navigating once the datepicker is showing the expected month and year.
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			// Move the calendar forward one month at a time.
			driver.findElement(By.xpath("//*[@class='ui-icon-icon-circle-triangle-e']")).click();
		}

		// Collect all clickable day cells from the visible calendar grid.
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

		// Loop through the day values until the target date is found.
		for(WebElement dt:alldates)
		{
			// Click the matching day and stop once the correct date is selected.
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}
}
