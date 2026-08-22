package calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// Class declaration that groups the related example logic in one place.
public class dates {
 static WebDriver driver;
	// Main method where program execution starts.
	public static void main(String[] args) {

		// Store text data that will be processed by the program logic.
		String monthNumber = "6";
		// Store text data that will be processed by the program logic.
		String date = "15";
		// Store text data that will be processed by the program logic.
		String year = "2027";

		String[] expectedList = {monthNumber,date,year};

		driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();

		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();

		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();


		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();


		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));


		// Loop through the data using an index or counter.
		for(int i =0; i<actualList.size();i++)

		{

		// Display information to the console for the user.
		System.out.println(actualList.get(i).getDomAttribute("value"));

		Assert.assertEquals(actualList.get(i).getDomAttribute("value"), expectedList[i]);

		}

		driver.close();

	}

}
