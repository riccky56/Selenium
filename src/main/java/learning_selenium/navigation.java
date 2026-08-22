package learning_selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates XPath axis traversal and browser navigation APIs.
public class navigation{
	public static WebDriver driver;

	// Print values using sibling and parent XPath relationships.
	public static void main(String[] args) {

		 driver = new ChromeDriver();

		// XPath axis examples for sibling and parent traversal.
		//header/div/button[1]/following-sibling::button[1]

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

	}
	
	public void method2() {
		
		// Demonstrate navigate().to(), back(), and forward() usage.
		driver.manage().window().maximize();

		driver.get("http://google.com");

		driver.navigate().to("https://rahulshettyacademy.com");

		driver.navigate().back();

		driver.navigate().forward();


	}

}



