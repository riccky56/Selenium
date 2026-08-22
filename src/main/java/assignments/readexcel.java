package assignments;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// Demonstrates reading all rows and cells from an Excel sheet and printing values.
public class readexcel {

	// Open workbook, iterate through sheet data, and print each row to console.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\exceldatademo.xlsx");
        
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		// Last row index (zero-based).
		int totalrows = sheet.getLastRowNum();
		// Total cell count in header row.
		int totalcol = sheet.getRow(0).getLastCellNum();
		
		// Print summary counts for quick sanity check.
		System.out.println("Total no of row: " + totalrows);
		// Print total number of columns.
		System.out.println("Total no of cell: " + totalcol);
		
		// Iterate through each row.
		for(int r=0; r<=totalrows; r++) {
			
			XSSFRow currentRow = sheet.getRow(r);
			
			
			// Iterate through each column in current row.
			for(int c=0; c<totalcol; c++) {
				
				XSSFCell cell = currentRow.getCell(c);  //   cell.getStringCellValue()
				cell.toString();
				
				// Print each cell value separated by tabs.
				System.out.print(cell.toString() + "\t");
				
			}
			// Move to next line after finishing a row.
			System.out.println();
		}
		workbook.close();
		file.close();
		
	}

}
