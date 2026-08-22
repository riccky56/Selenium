package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Demonstrates how to read values from an HTML table and filter rows by author name.
public class table {
WebDriver driver;
  // Open the demo page, inspect the table structure, and print book data for a selected author.
	public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
		
     // Open the practice page that contains the sample book table.
	 driver.get("https://testautomationpractice.blogspot.com");
	 driver.manage().window().maximize();
    // Count the table rows, including the header row.
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
    // Count the number of header columns in the table.
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
         // Print the row count so the table structure can be verified.
         System.out.println(rows);
         // Print the column count for reference.
         System.out.println(columns);
         try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
      // Print the exception details if the sleep is interrupted.
			e.printStackTrace();
		}
     // Read the first cell value from the third row as a simple sample lookup.
         WebElement textone = driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]/td[1]"));
         // Store the extracted cell text for reuse and display.
         String data = textone.getText();
         // Print the sample table value.
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
         
         // Loop through the data rows, skipping the header row at index 1.
         for(int r=2; r<rows;r++) 
         {
	        	 // Read the author name from the second column of the current row.
        	 String authorname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
	         // Print only the rows whose author matches Mukesh.
        	 if(authorname.equalsIgnoreCase("Mukesh"))
        	 {
	        		 // Read the book name from the first column of the matching row.
        		 String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
	         	      // Print the matching book and author pair.
        	      System.out.print(bookname+ "\t" +authorname);
        	 }
	         // Move to the next output line after processing each row.
        	 System.out.println();
         }
         
         
	}

}
