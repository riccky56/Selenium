package TestingAll;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SeleniumTutorial.Learning.Browser;

// Class declaration that groups the related example logic in one place.
public class Loginpage extends Browser {

	@BeforeTest
	
	public void start() {
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
		// Display information to the console for the user.
		System.out.println("this is a test");
	}
	
	@Test(dataProvider = "loginData")
	public void Name3() {
		// Display information to the console for the user.
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
		driver.close();
	 }
}
