package Petsmart;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Homepage {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
        //ChromeOptions co = new ChromeOptions();
        //co.addArguments("headless");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys("visual_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.name("login-button")).click();

		Thread.sleep(5000);

		//driver.findElement(By.cssSelector("a.shopping_cart_link")).click();

		WebElement hamburger = driver.findElement(By.id("react-burger-menu-btn"));

		hamburger.click();

		//WebElement Allitems = driver.findElement(By.linkText("All Items"));
		
		Thread.sleep(3000);

		WebElement About = driver.findElement(By.xpath("//a[text()='About']"));

		//WebElement About = driver.findElement(By.linkText("About"));

		//WebElement Logoutbutton = driver.findElement(By.linkText("Logout"));

		//WebElement ResetAppButton = driver.findElement(By.linkText("Reset App State"));

		About.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlMatches("https://saucelabs.com/"));
		
		String expectedTitle = "Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing";
		String actualTitle = driver.getTitle();
		
		
		Assert.assertEquals(actualTitle,expectedTitle);
		System.out.print("Test is passed");
		
		driver.close();


		//AllItems.click();

		/*

		 * driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		 * driver.findElement(By.id("logo")).isDisplayed();

		 * driver.findElement(By.className("form-control form-control-lg")).sendKeys(

		 * "T-Shirt");

		 * driver.findElement(By.xpath("//input[@place holder='Search']")).click();

		 */
		

	}

	public void loginsuccess() {


		/*

		 * driver.findElement(By.id("user-name")).sendKeys("visual_user");

		 * driver.findElement(By.id("password")).sendKeys("secret_sauce");

		 * driver.findElement(By.name("login-button")).click();

		 */

	}

	public void webdriver() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

	}

}




