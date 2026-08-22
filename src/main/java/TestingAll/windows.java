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

// Class declaration that groups the related example logic in one place.
public class windows {

	// Main method where program execution starts.
	public static void main(String[] args) throws Exception {

		// Step 1: Open LinkedIn login page
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cambridgeinternational.org/");
		
		driver.manage().window().maximize();
		//to accept the cookie
		driver.findElement(By.className("cc-cookie-accept")).click();
		
		
		// Step 2: Store the parent window handle
		String parentWindow = driver.getWindowHandle();
		// Display information to the console for the user.
		System.out.println("Parent Window Handle: " + parentWindow);
		Thread.sleep(2000);
		
		
		// Step 3: Click on the "Sign in with Google" button
		driver.findElement(By.xpath("//a[@title='Linkedin']/img")).click();
		

		// Step 4: Get all window handles
		Set<String> allWindows = driver.getWindowHandles();
		// Display information to the console for the user.
		System.out.println("All Window Handles: " + allWindows);
		List<String> list = new ArrayList<String>(allWindows);
	
		driver.switchTo().window(list.get(1));
		// Display information to the console for the user.
		System.out.println("Switched to LinkedIn Login Window");
        Thread.sleep(2000);
        

		// Step 5: Iterate through the window handles and switch to the child window (Google login window)
        for (String windowHandle : allWindows) {
            // Check the condition before deciding whether this block should run.
            if (!windowHandle.equals(parentWindow)) {
                // Switch to Linkedin login window
                driver.switchTo().window(windowHandle);
                // Display information to the console for the user.
                System.out.println("Switched to LinkedIn Login Window");
                Thread.sleep(2000);
                
               // Step 6: Perform actions in the Google login window (e.g., enter email and password)
                driver.findElement(By.id("identifierId")).sendKeys("your-email@gmail.com");
                driver.findElement(By.xpath("//span[text()='Next']")).click();
                
                // Assuming you have a wait to handle loading and next steps, you would perform further login steps here
                break;
            }
        }

		// Step 7: After completing the Google login, switch back to the LinkedIn window
		driver.switchTo().window(parentWindow);
		// Display information to the console for the user.
		System.out.println("Switched back to Parent Window");
		driver.quit();
	}
}
