package calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// Demonstrates how to select a date from a React date picker and verify the chosen values.
public class dates {
 static WebDriver driver;
	// Open the offers page, choose a target date, and assert that the input fields reflect the selection.
	public static void main(String[] args) {

		// Target month value as used by the month list, where January is index 1.
		String monthNumber = "6";
		// Target day value to be selected from the calendar.
		String date = "15";
		// Target year value to be selected from the year view.
		String year = "2027";

		// Store the expected month, date, and year values for later comparison.
		String[] expectedList = {monthNumber,date,year};

		driver = new ChromeDriver();

		// Open the page that contains the React date picker widget.
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Open the date picker input area.
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();

		// Switch from day view to month/year navigation.
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		// Click again to open the full year selection view.
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		// Select the required year.
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();

		// Select the required month using zero-based list access.
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();


		// Select the required day from the calendar.
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();


		// Read the three date input segments: month, day, and year.
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));


		// Compare each displayed value with the expected month, day, and year.
		for(int i =0; i<actualList.size();i++)

		{

		// Print the current value so the selected date can be verified from the console.
		System.out.println(actualList.get(i).getDomAttribute("value"));

		Assert.assertEquals(actualList.get(i).getDomAttribute("value"), expectedList[i]);

		}

		// Close the browser after the date verification is complete.
		driver.close();

	}

}
