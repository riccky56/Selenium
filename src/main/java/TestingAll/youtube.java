package TestingAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Demonstrates opening YouTube, navigating to sign-in, and reading page title.
public class youtube {
	public static WebDriver driver;
	
		  // Launch browser, click sign-in entry point, enter email, and print title.
		  public static void main(String[] args) throws InterruptedException {
		    WebDriver driver=new ChromeDriver();

		    driver.get("https://www.youtube.com/");
		    driver.manage().window().maximize();
		   
		    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#div.yt-spec-touch-feedback-shape__fill")));
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='yt-core-attributed-string yt-core-attributed-string--white-space-no-wrap']"))).click();
		    //driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		    
		    WebElement Uname = driver.findElement(By.id("identifierId"));
		    Uname.sendKeys("nikhithasoma07@gmail.com");
		    // Read title after navigating into account sign-in flow.
		    String title = driver.getTitle();
		    // Print title for quick verification.
		    System.out.println(title);
		    
		    driver.close();
		  }
}
