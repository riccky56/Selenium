package learning_selenium;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

// Demonstrates selecting values from static dropdowns and passenger count controls.
public class dropdown {
	public static WebDriver driver;

	@Test
	// Select different currency values from a static dropdown and print each selection.
	public static void one() throws InterruptedException {


		driver = new ChromeDriver(); driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		// Locate the currency dropdown and interact through Select helper.
		WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//Staticdropdown.click();
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByIndex(2);
		// Print selected option after selecting by index.
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByVisibleText("INR");
		// Print selected option after selecting by visible text.
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("USD");
		// Print selected option after selecting by value.
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.close();

	}
	

	@Test
	// Increase adult passenger count and verify the final passenger summary label.
	public void two() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		// Print initial passenger text before updates.
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		 /*int i = 1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();// to click n number of time we will use while loop
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		// Display information to the console for the user.
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); */
		
		// Click plus button four times to reach five adults total.
		for(int j = 1; j <5; j++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();// to click n number of time we will use while loop
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();

		// Print updated passenger text for visual confirmation.
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		driver.close();
	}

}
