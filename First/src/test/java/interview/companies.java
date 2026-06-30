package interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class companies {
	
     public static WebDriver driver;
     
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> companies = driver.findElements(By.xpath("//table[@id='customers']//tr/td[1]"));

		for (WebElement company : companies) {
			System.out.println(company.getText());
			
			if (company.getText().equals("Island Trading"))
			{
				System.out.println("Text Found!");
			}
		}

		driver.quit();




	}

}
