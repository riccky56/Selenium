package learning_selenium;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


// Class declaration that groups the related example logic in one place.
public class dropdown {
	public static WebDriver driver;

	@Test
	// Helper method used to perform a specific part of the program logic.
	public static void one() throws InterruptedException {


		driver = new ChromeDriver(); driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		//dropdown selection
		WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//Staticdropdown.click();
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByIndex(2);
		// Display information to the console for the user.
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByVisibleText("INR");
		// Display information to the console for the user.
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("USD");
		// Display information to the console for the user.
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.close();

	}
	

	@Test
	public void two() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		// Display information to the console for the user.
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		 /*int i = 1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();// to click n number of time we will use while loop
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		// Display information to the console for the user.
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); */
		
		//can also use for loop
		for(int j = 1; j <5; j++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();// to click n number of time we will use while loop
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();

		// Display information to the console for the user.
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		driver.close();
	}

}
