package pagestest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesfortest.Browsersetup;

// Contains multiple SauceDemo test cases for login verification and logout validation.
public class Sauce extends Browsersetup {


    @BeforeTest
	public void start() {
		// Launch the shared browser session before running the test methods.
    	Browsersetup.startBrowser();
		//driver.navigate().to("https://www.saucedemo.com/v1/");
		//driver.manage().deleteAllCookies();

	}



	
    @Test(invocationCount=2)
	public void LoginPage () throws InterruptedException {


		// Enter valid credentials and sign in to the application.
		driver.findElement(By.xpath("//input[@id = 'user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
		Thread.sleep(2000);

		// Read the inventory page label that appears after a successful login.
       	String A = driver.findElement(By.xpath("//*[@id = 'inventory_filter_container']")).getText();
		// Print the label so the successful navigation can be observed in the console.
		System.out.print(A);
		// Track whether the expected Products text is present.
		boolean result = false;
		// Mark the login as successful when the inventory heading contains Products.
		if(A.contains("Products")) {
			result = true;
		}

		// Assert that the login landed on the expected page.
		Assert.assertEquals(true, result);

		// Print a simple marker after the assertion completes.
		System.out.println("A");
		

	}


    @Test(retryAnalyzer = pagesfortest.Retry.class)
	public void secondtest () throws InterruptedException {


		// Log in again so the logout flow can be tested.
		driver.findElement(By.xpath("//input[@id = 'user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
		Thread.sleep(2000);
		// Open the side menu that contains the logout link.
		driver.findElement(By.xpath("//button[text() = 'Open Menu']")).click();
		
	    Thread.sleep(2000);
		
			
		// Wait until the logout link becomes clickable, then click it.
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id= 'logout_sidebar_link']"))).click(); 
		//click will also work here along with the wait but we can also take the click action in the next line. 
		
		
		//driver.findElement(By.xpath("//a[@id= 'logout_sidebar_link']")).click();                                   
		Thread.sleep(3000);
		
		// Define the page title expected after logout returns the user to the login screen.
		String expectedTitle = "Swag Labs";
		// Read the actual browser title after logout.
		String actualTitle = driver.getTitle();
		// Print the title so the post-logout state can be confirmed.
		System.out.println(actualTitle);
		
		// Verify that logout returned the browser to the correct page.
		Assert.assertEquals(actualTitle,expectedTitle);
		//wait.until(ExpectedConditions.urlMatches("https://www.saucedemo.com/v1/index.html"));
		
	

	}
    
    @Test
	public void thirdtest () throws InterruptedException {


		// Repeat the login and logout flow as another validation scenario.
		driver.findElement(By.xpath("//input[@id = 'user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
		Thread.sleep(2000);
		// Open the application menu again.
		driver.findElement(By.xpath("//button[text() = 'Open Menu']")).click();
		
	    Thread.sleep(2000);
		
			
		// Wait for the logout link and click it when ready.
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id= 'logout_sidebar_link']"))).click(); 
		//click will also work here along with the wait but we can also take the click action in the next line. 
		
		
		//driver.findElement(By.xpath("//a[@id= 'logout_sidebar_link']")).click();                                   
		Thread.sleep(3000);
		
		// Expected title after the user is logged out.
		String expectedTitle = "Swag Labs";
		// Actual title read from the browser after logout.
		String actualTitle = driver.getTitle();
		// Print the title for visibility in the console output.
		System.out.println(actualTitle);
		
		// Confirm that the page title matches the expected logged-out state.
		Assert.assertEquals(actualTitle,expectedTitle);
		//wait.until(ExpectedConditions.urlMatches("https://www.saucedemo.com/v1/index.html"));
		
	

	}



    @AfterClass
	public void cleanupMethod(){

		// Close the shared browser session after all tests are complete.
		driver.close();
	}

}
