package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

// Demonstrates how to fill and submit the Angular practice form using Selenium.
public class assignment1 {
	public static WebDriver driver;

	// Launch the browser in headless mode, populate the form fields, and submit the form.
	public static void main(String[] args) {
		// Configure Chrome to run without opening a visible browser window.
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("headless");
		driver=new ChromeDriver(opt);
		//driver = new ChromeDriver();

		// Open the sample Angular form page.
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// Enter the user name in the first name field.
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Rahul");

		// Enter an email address in the email field.
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rahulgupta@gmail.com");

		// Enter a password value in the password field.
		driver.findElement(By.cssSelector("input[id='exampleInputPassword1']")).sendKeys("0987654321");

		// Use JavaScript to scroll down so the lower form controls are visible.
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");

		// Select the checkbox to indicate agreement or enable the related option.
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();

		// Locate the static dropdown used to choose a role or option.
		WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));

		// Wrap the dropdown element with Select so options can be chosen easily.
		Select drop = new Select(staticdropdown);

		// Select the second option from the dropdown list.
		drop.selectByIndex(1);

		// Print the selected option to confirm the correct value was chosen.
		System.out.println(drop.getFirstSelectedOption().getText());

		// Select the first radio button option from the form.
		driver.findElement(By.cssSelector("input[value='option1']")).click();

		// Enter the birth date in the date input field.
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("20-10-1998");

		// Submit the completed form.
		driver.findElement(By.cssSelector("input[type='Submit']")).click();

		// driver.findElement(By.xpath("//*[@class='alert alert-success alert dismissible']")).getText();

		// Close the browser once the form submission flow is complete.
		driver.close();

	}

}
