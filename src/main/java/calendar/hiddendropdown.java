package calendar;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates how to handle a custom dropdown in OrangeHRM and read all available options.
public class hiddendropdown {
	public static WebDriver driver;
	// Log in to OrangeHRM, open a custom dropdown, print its options, and select a matching entry.
	public static void main(String[] args) throws InterruptedException {

		// Launch the browser and maximize the window for easier interaction.
		driver = new ChromeDriver(); driver.manage().window().maximize();
		// Open the OrangeHRM login page.
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		Thread.sleep(2000);
		// Enter the demo user name.
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		// Enter the demo password.
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Submit the login form.
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		// Navigate to the PIM module after logging in.
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

		// Open the custom dropdown whose options are rendered dynamically.
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='oxd-select-text--after']/child::i)[3]")).click();

		// Capture all visible dropdown options from the listbox.
		List <WebElement> alloptions = driver.findElements(By.xpath("//*[@role='listbox']/div"));

		// Store the option text values in a separate list so they can be printed and counted easily.
		ArrayList suggestionscreen = new ArrayList();

		// Read each dropdown option and add its text to the list.
		for( WebElement option : alloptions)
		{
			suggestionscreen.add(option.getText());

		}
		
		// Print all dropdown values collected from the custom list.
		System.out.println(suggestionscreen);
		// Print how many options were available in the dropdown.
		System.out.println(suggestionscreen.size());

		// Loop through the original option elements so the required one can be clicked.
		for(WebElement a:alloptions)
		{
			// Read the visible text of the current dropdown item.
			String option = a.getText();
			
			// Click the option when its text matches the required role.
			if(option.matches("Automation_Tester")) {
				a.click();
			}
			// Print each option while iterating so the dropdown contents can be reviewed.
			System.out.println(option);
		}

	}}
