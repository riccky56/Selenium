package learning_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// Class declaration that groups the related example logic in one place.
public class assertone {
public static WebDriver driver;
	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		// Display information to the console for the user.
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.close();
	}

}
