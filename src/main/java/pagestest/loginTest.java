package pagestest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagesfortest.Browsersetup;
import pagesfortest.loginpage;

// Test class that uses the page object to perform a basic SauceDemo login scenario.
public class loginTest extends Browsersetup{

	//static WebDriver driver;



    @BeforeClass
	public  void setup(){
		//driver = new ChromeDriver(); if no driver is assigned from browser2 or any other class
		// Start the shared browser session before the test runs.
		Browsersetup.startBrowser();
		//driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();

	}


	@Test
	public void first() {
        
		// Create the login page object so its helper methods can be used.
		loginpage log = new loginpage(driver);
		
		//log.loginAs("standard_user", "secret_sauce"); //calling all method in one method in POM
		
		// Enter valid login credentials using the page object methods.
		log.enterusername("standard_user");
		log.enterpassword("secret_sauce");
		
		// Click the login button to submit the form.
		log.loginbutton();

		
		// Close the browser once the login flow has finished.
		driver.close();


	}

}
