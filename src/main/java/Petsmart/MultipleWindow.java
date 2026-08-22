package Petsmart;

import java.util.Set; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.Keys; 
import org.openqa.selenium.Point; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions; 

// Demonstrates handling parent/child windows opened from a social link.
public class MultipleWindow {

	// Open main site, switch to child window, perform action, then return to parent.
	public static void main(String[] args) throws Exception {

		// Open main website and accept cookie prompt.
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cambridgeinternational.org/");
		driver.findElement(By.className("cc-cookie-accept")).click();
		// Save parent handle for returning after child-window interactions.
		String parentWindow = driver.getWindowHandle();
		// Print parent handle for debugging.
		System.out.println("Parent Window Handle: " + parentWindow);
		Thread.sleep(2000);
		// Open LinkedIn page in a new window/tab.
		driver.findElement(By.xpath("//a[@title='Linkedin']/img")).click();

		// Capture all handles after child window opens.
		Set<String> allWindowHandles = driver.getWindowHandles();
		// Print all handles to verify window creation.
		System.out.println("All Window Handles: " + allWindowHandles);

		// Switch to child handle that is different from parent.
		for (String windowHandle : allWindowHandles) {
			// Skip parent and act on child window only.
			if (!windowHandle.equals(parentWindow)) {
				// Move browser context to child window.
				driver.switchTo().window(windowHandle);
				// Confirm child context switch.
				System.out.println("Switched to LinkedIn Login Window");
				Thread.sleep(2000);

				// Attempt sample input in child login flow.
				driver.findElement(By.xpath("//*[@class='nsm7Bb-HzV7m-LgbsSe-MJoBVe'])[2]")).sendKeys("rahulraftaar885@gmail.com");
				driver.findElement(By.xpath("//span[text()='Next']")).click();

				// Assuming you have a wait to handle loading and next steps, you would perform further login steps here
				break;
			}
		}

		// Return to parent window and finish.
		driver.switchTo().window(parentWindow);
		// Confirm switch back to parent context.
		System.out.println("Switched back to Parent Window");
		driver.quit();
	}
}
