package Petsmart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Browser;

public class Sauce extends Browser {


    @BeforeTest
	public void start() {
		Browser.startBrowser();
		//driver.navigate().to("https://www.saucedemo.com/v1/");
		//driver.manage().deleteAllCookies();

	}

    @Test(invocationCount=2)
	public void LoginPage () throws InterruptedException {


		driver.findElement(By.xpath("//input[@id = 'user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
		Thread.sleep(2000);

       	String A = driver.findElement(By.xpath("//*[@id = 'inventory_filter_container']")).getText();
		System.out.print(A);
		boolean result = false;
		if(A.contains("Products")) {
			result = true;
		}

		Assert.assertEquals(true, result);

		System.out.println("A");
		

	}


    @Test(retryAnalyzer = Petsmart.Retry.class)
	public void secondtest () throws InterruptedException {


		driver.findElement(By.xpath("//input[@id = 'user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text() = 'Open Menu']")).click();
		
	    Thread.sleep(2000);
		
			
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id= 'logout_sidebar_link']"))).click(); 
		//click will also work here along with the wait but we can also take the click action in the next line. 
		
		
		//driver.findElement(By.xpath("//a[@id= 'logout_sidebar_link']")).click();                                   
		Thread.sleep(3000);
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle,expectedTitle);
		//wait.until(ExpectedConditions.urlMatches("https://www.saucedemo.com/v1/index.html"));
		
	

	}
    
    @Test
	public void thirdtest () throws InterruptedException {


		driver.findElement(By.xpath("//input[@id = 'user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text() = 'Open Menu']")).click();
		
	    Thread.sleep(2000);
		
			
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id= 'logout_sidebar_link']"))).click(); 
		//click will also work here along with the wait but we can also take the click action in the next line. 
		
		
		//driver.findElement(By.xpath("//a[@id= 'logout_sidebar_link']")).click();                                   
		Thread.sleep(3000);
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle,expectedTitle);
		//wait.until(ExpectedConditions.urlMatches("https://www.saucedemo.com/v1/index.html"));
		
	

	}



    @AfterTest
	public void cleanupMethod(){

		driver.close();
	}

}
