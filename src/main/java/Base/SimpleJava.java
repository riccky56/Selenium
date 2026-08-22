package Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

// Class declaration that groups the related example logic in one place.
public class SimpleJava{



	// Main method where program execution starts.
	public static void main(String[] args)  throws InterruptedException {

		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\911374\\OneDrive - Cognizant\\Desktop\\chrome-win64\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000); 

		driver.findElement(By.xpath("//input[@id = 'user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
		Thread.sleep(3000);


		String greeting = driver.findElement(By.xpath("//*[@id = 'inventory_filter_container']")).getText();
		// Display information to the console for the user.
		System.out.print(greeting);
		// Store a true or false state needed for conditional logic.
		boolean result = false;
		// Check the condition before deciding whether this block should run.
		if(greeting.contains("Products")) {
			result = true;
		}

		Assert.assertEquals(true, result);

		// Display information to the console for the user.
		System.out.println("greeting");



		driver.close();
	}

}
