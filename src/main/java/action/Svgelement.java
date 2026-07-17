package action;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Svgelement {
	static WebDriver driver;

	@Test 
	public void method1()
	{

		driver= new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//a[normalize-space()='Practice Form']//*[name()='svg']")).click();



		
	}

}
