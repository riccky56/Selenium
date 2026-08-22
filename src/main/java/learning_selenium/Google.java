package learning_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Demonstrates TestNG invocationCount by repeating a simple browser action.
public class Google {
	 
	public static WebDriver driver;
	
	@BeforeMethod
	// Create a fresh browser before each test invocation.
	public void first() 
	{
		driver = new ChromeDriver();
	}
	
	@Test(invocationCount = 4)
	// Open Google and click the "I'm Feeling Lucky" style button each run.
	public void google() throws InterruptedException {
		//driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@name='btnI'])[2]")).click();
	}

}
