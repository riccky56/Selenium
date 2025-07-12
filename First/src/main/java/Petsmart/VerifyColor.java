package Petsmart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.Color;

import Base.Browser;

public class VerifyColor extends Browser{
   public static void main(String[] args) {
      
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
      // identify text
      WebElement t = driver.findElement(By.tagName("h1"));
      //obtain color in rgba
      String s = t.getCssValue("color");
      // convert rgba to hex
      String c = Color.fromString(s).asHex();
      System.out.println("Color is :" + s);
      System.out.println("Hex code for color:" + c);
      
      
      driver.close();
   }
}

