package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
WebDriver driver;
	public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
		
	 driver.get("https://testautomationpractice.blogspot.com");
	 driver.manage().window().maximize();
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
         System.out.println(rows);
         System.out.println(columns);
         try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         WebElement textone = driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]/td[1]"));
         String data = textone.getText();
         System.out.println(data);
         
        /* for(int r=2; r<rows;r++) 
         {
        	 for(int c=1; c<columns; c++) 
        	 {
        		 String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
        	      System.out.print(value+ "\t");
        	 }
        	 System.out.println();
         } */
         
         for(int r=2; r<rows;r++) 
         {
        	 String authorname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
        	 if(authorname.equalsIgnoreCase("Mukesh"))
        	 {
        		 String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
        	      System.out.print(bookname+ "\t" +authorname);
        	 }
        	 System.out.println();
         }
         
         
	}

}
