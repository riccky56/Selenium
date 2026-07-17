package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
	static WebDriver driver;
	public static void main(String[] args) {
	
		String text="Rahul";
		
		driver = new ChromeDriver();
  
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		//Authetication POPUP
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//  to open a new window tab in selenium == driver.switchTo().newWindow(WindowType.TAB);
		//syntax
		//http://username:password@ url ;
		
		//http://admin:admin@the-internet.herokuapp.com/basic_auth;
			
       driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
