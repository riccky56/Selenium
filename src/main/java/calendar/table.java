package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Class declaration that groups the related example logic in one place.
public class table {
WebDriver driver;
	// Main method where program execution starts.
	public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
		
	 driver.get("https://testautomationpractice.blogspot.com");
	 driver.manage().window().maximize();
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
         // Display information to the console for the user.
         System.out.println(rows);
         // Display information to the console for the user.
         System.out.println(columns);
         try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         WebElement textone = driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]/td[1]"));
         // Store text data that will be processed by the program logic.
         String data = textone.getText();
         // Display information to the console for the user.
         System.out.println(data);
         
        /* for(int r=2; r<rows;r++) 
         {
        	 // Loop through the data using an index or counter.
        	 for(int c=1; c<columns; c++) 
        	 {
        		 String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
        	      // Display information to the console for the user.
        	      System.out.print(value+ "\t");
        	 }
        	 // Display information to the console for the user.
        	 System.out.println();
         } */
         
         // Loop through the data using an index or counter.
         for(int r=2; r<rows;r++) 
         {
        	 String authorname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
        	 // Check the condition before deciding whether this block should run.
        	 if(authorname.equalsIgnoreCase("Mukesh"))
        	 {
        		 String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
        	      // Display information to the console for the user.
        	      System.out.print(bookname+ "\t" +authorname);
        	 }
        	 // Display information to the console for the user.
        	 System.out.println();
         }
         
         
	}

}
