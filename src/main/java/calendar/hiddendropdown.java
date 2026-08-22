package calendar;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Class declaration that groups the related example logic in one place.
public class hiddendropdown {
	public static WebDriver driver;
	// Main method where program execution starts.
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver(); driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		//click on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

		//clickondropdown
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='oxd-select-text--after']/child::i)[3]")).click();

		List <WebElement> alloptions = driver.findElements(By.xpath("//*[@role='listbox']/div"));

		ArrayList suggestionscreen = new ArrayList();             //store the webelements in the arraylist 

		for( WebElement option : alloptions)               //iterate for every element get the text and add in the list
		{
			// Add the current value into the collection.
			suggestionscreen.add(option.getText());

		}
		
		// Display information to the console for the user.
		System.out.println(suggestionscreen);
		// Display information to the console for the user.
		System.out.println(suggestionscreen.size());

		for(WebElement a:alloptions) // to print all items from list of suggestion
		{
			// Store text data that will be processed by the program logic.
			String option = a.getText();
			
			// Check the condition before deciding whether this block should run.
			if(option.matches("Automation_Tester")) {
				a.click();
			}
			// Display information to the console for the user.
			System.out.println(option);
		}

	}}
