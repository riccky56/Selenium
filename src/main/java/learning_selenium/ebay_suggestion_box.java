package learning_selenium;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ebay_suggestion_box  {
	public static WebDriver driver;
 
	@Test
	public void  test() throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//*[@class='gh-search-input gh-tb ui-autocomplete-input']"));
		boolean a = driver.findElement(By.xpath("//*[@class='gh-search-input gh-tb ui-autocomplete-input']")).isEnabled();
		System.out.println(a);
		
		search.sendKeys("mobile");
		
		Thread.sleep(2000);
	    search.click();
		Thread.sleep(2000);
		
				
		List<WebElement> getAllSuggestion = driver.findElements(By.xpath("//*[@role='listbox']/li")); // suggestion box
		
		
		ArrayList<String> suggestionscreen = new ArrayList(); //store the webelements in the arraylist 
		
		for( WebElement option : getAllSuggestion)               //iterate for every element get the text and add in the list
		{
			suggestionscreen.add(option.getText());
			
			
			
		   Thread.sleep(2000);
			if(option.getText().equalsIgnoreCase("mobile homes for sale")) {
				option.click();
				break;
			}  
			
		}
		
		System.out.println(suggestionscreen);
	
		driver.close();
	}
}
