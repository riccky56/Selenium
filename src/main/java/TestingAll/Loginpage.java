package TestingAll;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SeleniumTutorial.Learning.Browser;

// Sample TestNG class showing setup/teardown and basic test method structure.
public class Loginpage extends Browser {

	@BeforeTest
	
	public void start() {
		// Start browser once before executing test methods in this class.
		Browser.startBrowser();
		//driver.get("https://www.google.com");
		//driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	public void Name1() {
		
	}
	
	@Test(priority=1,description="this is atest method")
	public void Name2()
	{
		// Placeholder test body for execution-order demonstration.
		System.out.println("this is a test");
	}
	
	@Test(dataProvider = "loginData")
	public void Name3() {
		// Placeholder data-driven test body.
		System.out.println("username");
		
	}
	@Test
	public void Name4() {
		
	}
	@Test
	public void Name5() {
		
	}
	
	@AfterTest

	public void close() {
		// Close browser after all tests in this class complete.
		driver.close();
	 }
}
