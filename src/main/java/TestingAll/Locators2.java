package TestingAll;
import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
// Class declaration that groups the related example logic in one place.
public class Locators2 {
	// Main method where program execution starts.
	public static void main(String[] args) throws InterruptedException {

		// Store text data that will be processed by the program logic.
		String name = "rahul";

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Store text data that will be processed by the program logic.
		String password = getPassword(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys(name);

		driver.findElement(By.name("inputPassword")).sendKeys(password);

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);

		// Display information to the console for the user.
		System.out.println(driver.findElement(By.tagName("p")).getText());

		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

		driver.findElement(By.xpath("//*[text()='Log Out']")).click();

		driver.close();

	}
	//method to extract the dynamic password

	public static String getPassword(WebDriver driver) throws InterruptedException{

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		// Store text data that will be processed by the program logic.
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();

		//Please use temporary password 'rahulshettyacademy' to Login.

		String[] passwordArray = passwordText.split("'");

		// String[] passwordArray2 = passwordArray[1].split("'");
		// passwordArray2[0]

		String password = passwordArray[1].split("'")[0];

		// Return the final result back to the caller.
		return password;

		//0th index - Please use temporary password
		//1st index - rahulshettyacademy' to Login.
		//0th index - rahulshettyacademy
		//1st index - to Login.

	}

}
