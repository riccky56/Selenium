package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates how to work with JavaScript alerts, confirm popups, a new tab, and basic authentication.
public class alerts {
	static WebDriver driver;
	// Launch the browser, trigger different popup types, and handle each one step by step.
	public static void main(String[] args) {
	
		// This text is entered into the page so it appears inside the alert messages.
		String text="Rahul";
		
		driver = new ChromeDriver();
  
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Type the sample name that will be echoed inside the alert popup.
		driver.findElement(By.id("name")).sendKeys(text);

		// Trigger the normal JavaScript alert.
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		// Print the alert text so we can confirm the popup contains the expected message.
		System.out.println(driver.switchTo().alert().getText());

		// Accept the alert to close it.
		driver.switchTo().alert().accept();

		// Trigger the confirm dialog, which supports both OK and Cancel actions.
		driver.findElement(By.id("confirmbtn")).click();

		// Print the confirmation text before dismissing the dialog.
		System.out.println(driver.switchTo().alert().getText());

		// Dismiss the confirm popup to simulate clicking Cancel.
		driver.switchTo().alert().dismiss();
		
		// Open a separate browser tab to demonstrate handling a different kind of authentication popup.
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		// Open the basic-auth demo site once without credentials.
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// Print the interruption details if the pause is interrupted.
			e.printStackTrace();
		}
		// Example syntax for opening a new tab in Selenium.
		//driver.switchTo().newWindow(WindowType.TAB);
		
		// Basic authentication syntax:
		//http://username:password@ url ;
		
		// Example with embedded credentials for this demo application.
		//http://admin:admin@the-internet.herokuapp.com/basic_auth;
			
		// Reload the page with credentials embedded in the URL to bypass the authentication prompt.
       driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
