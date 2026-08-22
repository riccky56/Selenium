package TestingAll;

import java.util.ArrayList;
import java.util.List;
import java.util.Set; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.Keys; 
import org.openqa.selenium.Point; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions; 

// Demonstrates handling parent/child browser windows and switching focus between them.
public class windows {

	// Open a site, trigger a new window, switch context, and return to parent window.
	public static void main(String[] args) throws Exception {

		// Open Cambridge site and prepare for social-link window handling.
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cambridgeinternational.org/");
		
		driver.manage().window().maximize();
		// Accept cookie banner so the page becomes fully interactive.
		driver.findElement(By.className("cc-cookie-accept")).click();
		
		
		// Save the parent window handle for switching back later.
		String parentWindow = driver.getWindowHandle();
		// Print parent handle for debug visibility.
		System.out.println("Parent Window Handle: " + parentWindow);
		Thread.sleep(2000);
		
		
		// Click LinkedIn icon which opens a new browser window/tab.
		driver.findElement(By.xpath("//a[@title='Linkedin']/img")).click();
		

		// Read all current window handles after new window opens.
		Set<String> allWindows = driver.getWindowHandles();
		// Print all handles for troubleshooting.
		System.out.println("All Window Handles: " + allWindows);
		List<String> list = new ArrayList<String>(allWindows);
	
		driver.switchTo().window(list.get(1));
		// Confirm that execution switched to the secondary window.
		System.out.println("Switched to LinkedIn Login Window");
        Thread.sleep(2000);
        

		// Iterate through handles and switch to the child window that is not the parent.
        for (String windowHandle : allWindows) {
	            // Skip the parent and interact only with child context.
            if (!windowHandle.equals(parentWindow)) {
	                // Switch to child window.
                driver.switchTo().window(windowHandle);
	                // Print current context change for debug.
                System.out.println("Switched to LinkedIn Login Window");
                Thread.sleep(2000);
                
	               // Example interaction attempt in child window.
                driver.findElement(By.id("identifierId")).sendKeys("your-email@gmail.com");
                driver.findElement(By.xpath("//span[text()='Next']")).click();
                
                // Assuming you have a wait to handle loading and next steps, you would perform further login steps here
                break;
            }
        }

		// Return focus to the parent window after child actions complete.
		driver.switchTo().window(parentWindow);
		// Confirm switch-back and close all windows.
		System.out.println("Switched back to Parent Window");
		driver.quit();
	}
}
