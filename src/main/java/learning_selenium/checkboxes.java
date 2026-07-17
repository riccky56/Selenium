package learning_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		 driver= new ChromeDriver();
		 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		// driver.findElement(By.xpath("//input[@id='sunday']")).click();
		 
		 // 2. select all checkboxes
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		 
		for(WebElement a:allcheckboxes) {
			a.click();
		}
		
		//3. select 3 last checkboxes
		for(int i = 4; i<allcheckboxes.size(); i++)
		{
			allcheckboxes.get(i).click();
		}

		
	}

}
