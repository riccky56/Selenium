package assignments;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// Class declaration that groups the related example logic in one place.
public class readexcel {

	// Main method where program execution starts.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\exceldatademo.xlsx");
        
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		// Initialize a variable that will be used in the logic.
		int totalrows = sheet.getLastRowNum();
		// Initialize a variable that will be used in the logic.
		int totalcol = sheet.getRow(0).getLastCellNum();
		
		// Display information to the console for the user.
		System.out.println("Total no of row: " + totalrows);
		// Display information to the console for the user.
		System.out.println("Total no of cell: " + totalcol);
		
		// Loop through the data using an index or counter.
		for(int r=0; r<=totalrows; r++) {
			
			XSSFRow currentRow = sheet.getRow(r);
			
			
			// Loop through the data using an index or counter.
			for(int c=0; c<totalcol; c++) {
				
				XSSFCell cell = currentRow.getCell(c);  //   cell.getStringCellValue()
				cell.toString();
				
				// Display information to the console for the user.
				System.out.print(cell.toString() + "\t");
				
			}
			// Display information to the console for the user.
			System.out.println();
		}
		workbook.close();
		file.close();
		
	}

}
