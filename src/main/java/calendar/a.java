package calendar;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// Demonstrates how to verify a checkbox state and capture a screenshot of that element.
public class a {
	static WebDriver driver;
	// Launch the browser, validate the checkbox state, then capture the checkbox image.
	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();

		// Open the practice page that contains the Senior Citizen Discount checkbox.
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Confirm that the checkbox is not selected before interacting with it.
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Select the checkbox to simulate the user enabling the discount option.
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		// Print the updated checkbox state so it is easy to verify from the console.
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Assert again to make sure the checkbox is now selected.
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		 // Store a reference to the checkbox element so its screenshot can be captured.
		 WebElement ele =driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		 
		 // Take a screenshot of only this element instead of the entire page.
		 File src = ele.getScreenshotAs(OutputType.FILE);
		 
		 // Save the captured image locally.
		 FileUtils.copyFile(src, new File ("logo.png"));
		 

	}

}
