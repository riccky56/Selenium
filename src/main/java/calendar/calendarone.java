package calendar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Class declaration that groups the related example logic in one place.
public class calendarone {
	static WebDriver driver;
	// Main method where program execution starts.
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//*[id='datepicker']")).click();

		// Store text data that will be processed by the program logic.
		String year ="2025";  String month="August";       String date ="20";
		
		//driver.findElement(By.xpath("//*[id='datepicker']")).click();

		while(true) {
			String currentmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();

			// Check the condition before deciding whether this block should run.
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//*[@class='ui-icon-icon-circle-triangle-e']")).click();
		}

		List<WebElement> alldates=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

		// Loop through each element one by one.
		for(WebElement dt:alldates)
		{
			// Check the condition before deciding whether this block should run.
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}
}
