package learning_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dropdownstatic {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver(); driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		/*int i=1;

		while(i<5)	{

		driver.findElement(By.id("hrefIncAdt")).click();

		i++;

		}*/

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for(int i=1;i<5;i++)

		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();

	}

}
