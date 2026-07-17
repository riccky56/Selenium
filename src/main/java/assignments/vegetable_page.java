package assignments;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vegetable_page {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();

		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Tomato","Carrot"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);

		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		for(int i=0;i<products.size();i++)

		{    
			String[] name=products.get(i).getText().split("-");

			String formattedName=name[0].trim();

	//format it to get actual vegetable name, convert array into array list for easy search, check whether name you extracted is present in arrayList or not-

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			int j=0;
			if(itemsNeededList.contains(formattedName))

			{
				j++; // to increment the value of clicking the button

				//click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if(j==itemsNeeded.length)

				{
					break;
				}

			}

		}

	}
}

