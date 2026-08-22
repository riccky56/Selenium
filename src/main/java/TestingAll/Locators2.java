package TestingAll;
import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
// Demonstrates dynamic password retrieval from reset flow and login verification.
public class Locators2 {
	// Fetch the temporary password, log in, and assert the success messages.
	public static void main(String[] args) throws InterruptedException {

		// Test user name used in both input and assertion.
		String name = "rahul";

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Read the temporary password from the forgot-password message.
		String password = getPassword(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys(name);

		driver.findElement(By.name("inputPassword")).sendKeys(password);

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);

		// Print the login confirmation text shown on successful authentication.
		System.out.println(driver.findElement(By.tagName("p")).getText());

		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

		driver.findElement(By.xpath("//*[text()='Log Out']")).click();

		driver.close();

	}
	// Extract the temporary password from the reset password response text.

	public static String getPassword(WebDriver driver) throws InterruptedException{

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		// Example format: Please use temporary password 'rahulshettyacademy' to Login.
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();

		//Please use temporary password 'rahulshettyacademy' to Login.

		String[] passwordArray = passwordText.split("'");

		// String[] passwordArray2 = passwordArray[1].split("'");
		// passwordArray2[0]

		String password = passwordArray[1].split("'")[0];

		// Return only the password token between single quotes.
		return password;

		//0th index - Please use temporary password
		//1st index - rahulshettyacademy' to Login.
		//0th index - rahulshettyacademy
		//1st index - to Login.

	}

}
