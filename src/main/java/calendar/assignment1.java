package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class assignment1 {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("headless");
		driver=new ChromeDriver(opt);
		//driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Rahul");

		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rahulgupta@gmail.com");

		driver.findElement(By.cssSelector("input[id='exampleInputPassword1']")).sendKeys("0987654321");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");

		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();

		WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));

		Select drop = new Select(staticdropdown);

		drop.selectByIndex(1);

		System.out.println(drop.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("input[value='option1']")).click();

		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("20-10-1998");

		driver.findElement(By.cssSelector("input[type='Submit']")).click();

		// driver.findElement(By.xpath("//*[@class='alert alert-success alert dismissible']")).getText();

		driver.close();

	}

}