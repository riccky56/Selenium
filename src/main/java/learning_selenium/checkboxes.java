package learning_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates selecting checkbox groups using a collected list of elements.
public class checkboxes {
	public static WebDriver driver;
	// Open page, select all checkboxes, then click a subset by index range.
	public static void main(String[] args) {
		
		 driver= new ChromeDriver();
		 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		// driver.findElement(By.xpath("//input[@id='sunday']")).click();
		 
		 // Collect all matching checkbox elements.
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		 
		// Click each checkbox once.
		for(WebElement a:allcheckboxes) {
			a.click();
		}
		
		// Click the last three checkboxes using index positions.
		for(int i = 4; i<allcheckboxes.size(); i++)
		{
			allcheckboxes.get(i).click();
		}

		
	}

}
