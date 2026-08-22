package multiplewindow;

import java.util.Set; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.Keys; 
import org.openqa.selenium.Point; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions; 

// Demonstrates switching between parent and child windows during LinkedIn Google sign-in flow.
public class window {

	// Open LinkedIn, switch to the Google sign-in window, perform an action, then return to parent.
	public static void main(String[] args) throws Exception {

		// Open LinkedIn login page.
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");

		// Save parent window handle to switch back later.
		String parentWindow = driver.getWindowHandle();
		// Print parent handle for debugging.
		System.out.println("Parent Window Handle: " + parentWindow);

		// Click Sign in with Google to open child window.
		driver.findElement(By.xpath("//button[text()='Sign in with Google']")).click();

		// Read all available window handles after popup opens.
		Set<String> allWindowHandles = driver.getWindowHandles();
		// Print all handles for visibility.
		System.out.println("All Window Handles: " + allWindowHandles);
	         		// Switch to the child window by selecting handle that is not the parent.
		for (String windowHandle : allWindowHandles) {
			// Skip parent handle and switch only when child handle is found.
			if (!windowHandle.equals(parentWindow)) {
				// Switch browser focus to Google login window.
				driver.switchTo().window(windowHandle);
				// Confirm active context change.
				System.out.println("Switched to Google Login Window");

				// Enter email and proceed to next step in Google login.
				driver.findElement(By.id("identifierId")).sendKeys("rahulraftaar885@gmail.com");
				driver.findElement(By.xpath("//span[text()='Next']")).click();

				// Stop after completing first child-window action.
				break;
			}
		}

		// Return control back to LinkedIn parent window.
		driver.switchTo().window(parentWindow);
		// Confirm successful switch back.
		System.out.println("Switched back to Parent Window");
	}
}
