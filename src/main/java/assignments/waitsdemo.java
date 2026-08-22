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

// Class declaration that groups the related example logic in one place.
public class waitsdemo {
	public static  WebDriver driver;
	// Main method where program execution starts.
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

		//explicit wait

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		// Display information to the console for the user.
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}



	// Helper method used to perform a specific part of the program logic.
	public static  void addItems(WebDriver driver,String[] itemsNeeded)

	{
		// Initialize a variable that will be used in the logic.
		int j=0;

		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		// Loop through the data using an index or counter.
		for(int i=0;i<products.size();i++)

		{
			//Brocolli - 1 Kg

			//Brocolli,    1 kg

			String[] name=products.get(i).getText().split("-");

			// Store text data that will be processed by the program logic.
			String formattedName=name[0].trim();


//format it to get actual vegetable name //convert array into array list for easy search

			//  check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);

			// Check the condition before deciding whether this block should run.
			if(itemsNeededList.contains(formattedName))

			{
				j++;
				//click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				// Check the condition before deciding whether this block should run.
				if(j==itemsNeeded.length)

				{

					break;

				}
			}
		}
	}
}

