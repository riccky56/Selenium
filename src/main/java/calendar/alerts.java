package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

// Class declaration that groups the related example logic in one place.
public class alerts {
	static WebDriver driver;
	// Main method where program execution starts.
	public static void main(String[] args) {
	
		// Store text data that will be processed by the program logic.
		String text="Rahul";
		
		driver = new ChromeDriver();
  
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		// Display information to the console for the user.
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		// Display information to the console for the user.
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
