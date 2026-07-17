package calendar;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class calendar {
 public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser//"https://rahulshettyacademy.com/dropdownsPractise/

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		{
		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		else
		{
		Assert.assertTrue(false);
		}

		driver.close();

	}

}
