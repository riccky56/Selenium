package calendar;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendropdown {
	public static WebDriver driver;
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
			suggestionscreen.add(option.getText());

		}
		
		System.out.println(suggestionscreen);
		System.out.println(suggestionscreen.size());

		for(WebElement a:alloptions) // to print all items from list of suggestion
		{
			String option = a.getText();
			
			if(option.matches("Automation_Tester")) {
				a.click();
			}
			System.out.println(option);
		}

	}}
