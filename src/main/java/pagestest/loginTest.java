package pagestest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagesfortest.Browsersetup;
import pagesfortest.loginpage;

public class loginTest extends Browsersetup{

	//static WebDriver driver;



    @BeforeClass
	public  void setup(){
		//driver = new ChromeDriver(); if no driver is assigned from browser2 or any other class
		Browsersetup.startBrowser();
		//driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();

	}


	@Test
	public void first() {
        
		loginpage log = new loginpage(driver);
		
		//log.loginAs("standard_user", "secret_sauce"); //calling all method in one method in POM
		
		log.enterusername("standard_user");
		log.enterpassword("secret_sauce");
		
		log.loginbutton();

		
		driver.close();


	}

}
