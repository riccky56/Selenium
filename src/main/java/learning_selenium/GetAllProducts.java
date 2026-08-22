package learning_selenium;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Class declaration that groups the related example logic in one place.
public class GetAllProducts {

	// Main method where program execution starts.
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://bstackdemo.com/");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("shelf-item")));

		List<WebElement> products = driver.findElements(By.className("shelf-item"));

		// Display information to the console for the user.
		System.out.println(products);

		// Display information to the console for the user.
		System.out.println("Total products found : " + products.size());

		// Loop through each element one by one.
		for (WebElement product : products) {

			// Store text data that will be processed by the program logic.
			String title = product.findElement(By.className("shelf-item__title")).getText();

			
		
			// Store text data that will be processed by the program logic.
			String price = product.findElement(By.cssSelector(".shelf-item__price .val b")).getText();
		

			// Display information to the console for the user.
			System.out.println("Phone is " + title + " and price is: " + price);

		}

		driver.quit();

	}

}
