package learning_selenium;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates switching between parent/child windows and reusing child-window data.
public class WIndowHandles {
 
	 public static WebDriver driver;
	
	// Open child window, read email text, and send extracted value back in parent window.
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.cssSelector(".blinkingText")).click();

		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

		Iterator<String>it = windows.iterator();

		// Parent window handle.
		String parentId = it.next();

		// Child window handle.
		String childId = it.next();

		driver.switchTo().window(childId);

		// Print text shown in child window.
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		driver.findElement(By.cssSelector(".im-para.red")).getText();

		// Parse email from info text.
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

		driver.switchTo().window(parentId);

		driver.findElement(By.id("username")).sendKeys(emailId);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
	}

}
