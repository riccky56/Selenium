package TestingAll;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates XPath traversal with sibling/parent axes and browser navigation APIs.
public class navigation{
	public static WebDriver driver;

	// Print button text using sibling and parent XPath traversal.
	public static void main(String[] args) {

		 driver = new ChromeDriver();

		// XPath axis examples: sibling and child-to-parent traversal.
		//header/div/button[1]/following-sibling::button[1]

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

	}
	
	public void method2() {
		
		// Demonstrate navigate().to(), back(), and forward() behavior.
		driver.manage().window().maximize();

		driver.get("http://google.com");

		driver.navigate().to("https://wrahulshettyacademy.com");

		driver.navigate().back();

		driver.navigate().forward();


	}

}



