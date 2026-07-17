package learning_selenium;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAllProducts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://bstackdemo.com/");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("shelf-item")));

		List<WebElement> products = driver.findElements(By.className("shelf-item"));

		System.out.println(products);

		System.out.println("Total products found : " + products.size());

		for (WebElement product : products) {

			String title = product.findElement(By.className("shelf-item__title")).getText();

			
		
			String price = product.findElement(By.cssSelector(".shelf-item__price .val b")).getText();
		

			System.out.println("Phone is " + title + " and price is: " + price);

		}

		driver.quit();

	}

}
