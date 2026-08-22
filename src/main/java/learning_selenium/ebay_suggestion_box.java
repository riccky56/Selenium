package learning_selenium;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// Demonstrates reading and selecting values from eBay search auto-suggestions.
public class ebay_suggestion_box  {
	public static WebDriver driver;
 
	@Test
	public void  test() throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//*[@class='gh-search-input gh-tb ui-autocomplete-input']"));
		boolean a = driver.findElement(By.xpath("//*[@class='gh-search-input gh-tb ui-autocomplete-input']")).isEnabled();
		// Print whether search field is enabled before typing.
		System.out.println(a);
		
		search.sendKeys("mobile");
		
		Thread.sleep(2000);
	    search.click();
		Thread.sleep(2000);
		
				
		List<WebElement> getAllSuggestion = driver.findElements(By.xpath("//*[@role='listbox']/li")); // suggestion box
		
		
		// Keep suggestion text in a list so all values can be printed later.
		ArrayList<String> suggestionscreen = new ArrayList();
		
		// Iterate each suggestion and click the target value when found.
		for( WebElement option : getAllSuggestion)
		{
			// Store each suggestion text for debugging.
			suggestionscreen.add(option.getText());
			
			
			
		   Thread.sleep(2000);
			// Select matching suggestion and stop scanning.
			if(option.getText().equalsIgnoreCase("mobile homes for sale")) {
				option.click();
				break;
			}  
			
		}
		
		// Print captured suggestion list.
		System.out.println(suggestionscreen);
	
		driver.close();
	}
}
