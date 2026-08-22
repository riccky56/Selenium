package action;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates how to switch between parent and child windows and reuse data from the child window.
public class windowhandling {
     static WebDriver driver;
	// Open the login page, switch to the child window, extract the email text, and enter it back in the parent window.
	public static void main(String[] args) {
			 driver = new ChromeDriver();

			// Open the practice login page.
			driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

			// Click the blinking link that opens content in a new window.
			driver.findElement(By.cssSelector(".blinkingText")).click();

			// Collect all window handles so the parent and child windows can be identified.
			Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

			// Use an iterator to read the window handles one by one.
			Iterator<String>it = windows.iterator();

			// The first handle is the original parent window.
			String parentId = it.next();

			// The second handle is the newly opened child window.
			String childId = it.next();

			// Switch focus to the child window to read its content.
			driver.switchTo().window(childId);

			// Print the information text displayed in the child window.
			System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

			driver.findElement(By.cssSelector(".im-para.red")).getText();

			// Extract the email address from the paragraph text by splitting the message around the word 'at'.
			String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

			// Switch back to the original login window.
			driver.switchTo().window(parentId);

			// Enter the extracted email address into the username field in the parent window.
			driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
