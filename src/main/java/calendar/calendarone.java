package calendar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarone {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//*[id='datepicker']")).click();

		String year ="2025";  String month="August";       String date ="20";
		
		//driver.findElement(By.xpath("//*[id='datepicker']")).click();

		while(true) {
			String currentmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();

			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//*[@class='ui-icon-icon-circle-triangle-e']")).click();
		}

		List<WebElement> alldates=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}
}
