package learning_selenium;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// Class declaration that groups the related example logic in one place.
public class ebay_suggestion_box  {
	public static WebDriver driver;
 
	@Test
	public void  test() throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//*[@class='gh-search-input gh-tb ui-autocomplete-input']"));
		boolean a = driver.findElement(By.xpath("//*[@class='gh-search-input gh-tb ui-autocomplete-input']")).isEnabled();
		// Display information to the console for the user.
		System.out.println(a);
		
		search.sendKeys("mobile");
		
		Thread.sleep(2000);
	    search.click();
		Thread.sleep(2000);
		
				
		List<WebElement> getAllSuggestion = driver.findElements(By.xpath("//*[@role='listbox']/li")); // suggestion box
		
		
		ArrayList<String> suggestionscreen = new ArrayList(); //store the webelements in the arraylist 
		
		for( WebElement option : getAllSuggestion)               //iterate for every element get the text and add in the list
		{
			// Add the current value into the collection.
			suggestionscreen.add(option.getText());
			
			
			
		   Thread.sleep(2000);
			// Check the condition before deciding whether this block should run.
			if(option.getText().equalsIgnoreCase("mobile homes for sale")) {
				option.click();
				break;
			}  
			
		}
		
		// Display information to the console for the user.
		System.out.println(suggestionscreen);
	
		driver.close();
	}
}
