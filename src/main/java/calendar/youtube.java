package calendar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Demonstrates opening YouTube, waiting for the sign-in entry point, and reading the page title.
public class youtube {
	public static WebDriver driver;
	
		  // Launch the browser, navigate toward sign-in, enter an email, and print the page title.
		  public static void main(String[] args) throws InterruptedException {
		    WebDriver driver=new ChromeDriver();

		    // Open the YouTube home page and maximize the window.
		    driver.get("https://www.youtube.com/");
		    driver.manage().window().maximize();
		   
		    // Wait for the page UI to settle before interacting with the sign-in control.
		    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#div.yt-spec-touch-feedback-shape__fill")));
		    // Click the sign-in related element once it becomes clickable.
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='yt-core-attributed-string yt-core-attributed-string--white-space-no-wrap']"))).click();
		    //driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		    
		    // Locate the email field on the Google sign-in page and enter the user name.
		    WebElement Uname = driver.findElement(By.id("identifierId"));
		    Uname.sendKeys("nikhithasoma07@gmail.com");
		    // Capture the current page title after navigation to the sign-in flow.
		    String title = driver.getTitle();
		    // Print the title so the current page state can be confirmed.
		    System.out.println(title);
		    
		    // Close the browser after the demo flow is complete.
		    driver.close();
		  }
}
