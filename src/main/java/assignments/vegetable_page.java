package assignments;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Class declaration that groups the related example logic in one place.
public class vegetable_page {
	public static WebDriver driver;

	// Main method where program execution starts.
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();

		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Tomato","Carrot"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);

		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		// Loop through the data using an index or counter.
		for(int i=0;i<products.size();i++)

		{    
			String[] name=products.get(i).getText().split("-");

			// Store text data that will be processed by the program logic.
			String formattedName=name[0].trim();

	//format it to get actual vegetable name, convert array into array list for easy search, check whether name you extracted is present in arrayList or not-

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			// Initialize a variable that will be used in the logic.
			int j=0;
			// Check the condition before deciding whether this block should run.
			if(itemsNeededList.contains(formattedName))

			{
				j++; // to increment the value of clicking the button

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

