package learning_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Class declaration that groups the related example logic in one place.
public class autosuggestivedropdown {
	public static WebDriver driver;
	// Main method where program execution starts.
	public static void main(String[] args) throws InterruptedException {
		
		

		driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); //in css   "parent space child"

		// Loop through each element one by one.
		for(WebElement option :options)
		{
			// Check the condition before deciding whether this block should run.
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();

				break; // to come out of the loop once the condition is satisfied
			}
		}
		
		driver.close();
	}
}
