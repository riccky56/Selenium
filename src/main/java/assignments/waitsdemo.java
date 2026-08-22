package assignments;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Demonstrates implicit and explicit waits while adding items and applying promo code.
public class waitsdemo {
	public static  WebDriver driver;
	// Open product page, add required items, proceed to checkout, and verify promo response.
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(7));

		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver,itemsNeeded);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));



		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("button.promoBtn")).click();

		// Explicit wait ensures promo response element becomes visible before reading text.

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		// Print promo application result for verification.
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}



	// Reusable helper that adds only the requested items from the product list.
	public static  void addItems(WebDriver driver,String[] itemsNeeded)

	{
		// Count how many required items have been added.
		int j=0;

		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		// Iterate through each product tile name.
		for(int i=0;i<products.size();i++)

		{
			//Brocolli - 1 Kg

			//Brocolli,    1 kg

			String[] name=products.get(i).getText().split("-");

			// Keep only product name by trimming quantity suffix.
			String formattedName=name[0].trim();


//format it to get actual vegetable name //convert array into array list for easy search

			//  check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);

			// Add to cart when current product is in requested list.
			if(itemsNeededList.contains(formattedName))

			{
				j++;
				//click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				// Exit loop once all target items are added.
				if(j==itemsNeeded.length)

				{

					break;

				}
			}
		}
	}
}

