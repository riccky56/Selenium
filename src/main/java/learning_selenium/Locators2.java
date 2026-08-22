package learning_selenium;
import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
// Demonstrates extracting temporary password and validating successful login.
public class Locators2 {
	// Fetch dynamic password, sign in, and assert welcome messages.
	public static void main(String[] args) throws InterruptedException {

		// User name reused for both login and assertion text.
		String name = "rahul";

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Obtain temporary password by invoking reset flow helper method.
		String password = getPassword(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys(name);

		driver.findElement(By.name("inputPassword")).sendKeys(password);

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);

		// Print success message after login.
		System.out.println(driver.findElement(By.tagName("p")).getText());

		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

		driver.findElement(By.xpath("//*[text()='Log Out']")).click();

		driver.close();

	}
	// Helper to parse temporary password from reset message.

	public static String getPassword(WebDriver driver) throws InterruptedException{

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		// Example text includes password between single quotes.
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();

		//Please use temporary password 'rahulshettyacademy' to Login.

		String[] passwordArray = passwordText.split("'");

		// String[] passwordArray2 = passwordArray[1].split("'");
		// passwordArray2[0]

		String password = passwordArray[1].split("'")[0];

		// Return parsed password token.
		return password;

		//0th index - Please use temporary password
		//1st index - rahulshettyacademy' to Login.
		//0th index - rahulshettyacademy
		//1st index - to Login.

	}

}
