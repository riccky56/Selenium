package action;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Class declaration that groups the related example logic in one place.
public class windowhandling {
     static WebDriver driver;
	// Main method where program execution starts.
	public static void main(String[] args) {
			 driver = new ChromeDriver();

			driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

			driver.findElement(By.cssSelector(".blinkingText")).click();

			Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

			Iterator<String>it = windows.iterator();

			// Store text data that will be processed by the program logic.
			String parentId = it.next();

			// Store text data that will be processed by the program logic.
			String childId = it.next();

			driver.switchTo().window(childId);

			// Display information to the console for the user.
			System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

			driver.findElement(By.cssSelector(".im-para.red")).getText();

			// Store text data that will be processed by the program logic.
			String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

			driver.switchTo().window(parentId);

			driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
