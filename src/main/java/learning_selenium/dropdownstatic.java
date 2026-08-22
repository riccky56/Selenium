package learning_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// Demonstrates increasing adult passenger count and validating final value.
public class dropdownstatic {
	public static WebDriver driver;
	// Open passenger selector, increment adults, then assert expected summary text.
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver(); driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		/*int i=1;

		while(i<5)	{

		driver.findElement(By.id("hrefIncAdt")).click();

		i++;

		}*/

		// Print initial passenger summary before incrementing adults.
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// Click increment control to reach five adults.
		for(int i=1;i<5;i++)

		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		// Print final passenger summary after update.
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();

	}

}
