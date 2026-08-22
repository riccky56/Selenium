package Petsmart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.Color;

import Base.Browser;

// Demonstrates reading CSS color value from a heading and converting it to hex format.
public class VerifyColor extends Browser{
   // Open page, capture color of heading text, and print rgba/hex values.
   public static void main(String[] args) {
      
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
      // identify text
      WebElement t = driver.findElement(By.tagName("h1"));
      //obtain color in rgba
      String s = t.getCssValue("color");
      // convert rgba to hex
      String c = Color.fromString(s).asHex();
      // Print the raw CSS color value (usually rgba).
      System.out.println("Color is :" + s);
      // Print the equivalent hex color value.
      System.out.println("Hex code for color:" + c);
      
      
      driver.close();
   }
}

