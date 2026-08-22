package learning_selenium;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Demonstrates capturing all product cards and printing their title/price.
public class GetAllProducts {

	// Open product catalog, wait for cards, then print title and price for each item.
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://bstackdemo.com/");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("shelf-item")));

		List<WebElement> products = driver.findElements(By.className("shelf-item"));

		// Print raw product element list reference.
		System.out.println(products);

		// Print total number of products found.
		System.out.println("Total products found : " + products.size());

		// Iterate each product card and extract fields.
		for (WebElement product : products) {

			// Product title text.
			String title = product.findElement(By.className("shelf-item__title")).getText();

			
		
			// Product price numeric value.
			String price = product.findElement(By.cssSelector(".shelf-item__price .val b")).getText();
		

			// Print product summary line.
			System.out.println("Phone is " + title + " and price is: " + price);

		}

		driver.quit();

	}

}
