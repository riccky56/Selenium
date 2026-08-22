package interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Class declaration that groups the related example logic in one place.
public class companies {
	
     public static WebDriver driver;
     
	// Main method where program execution starts.
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> companies = driver.findElements(By.xpath("//table[@id='customers']//tr/td[1]"));

		// Loop through each element one by one.
		for (WebElement company : companies) {
			// Display information to the console for the user.
			System.out.println(company.getText());
			
			// Check the condition before deciding whether this block should run.
			if (company.getText().equals("Island Trading"))
			{
				// Display information to the console for the user.
				System.out.println("Text Found!");
			}
		}

		driver.quit();




	}

}
