package assignments;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class readexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\exceldatademo.xlsx");
        
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalrows = sheet.getLastRowNum();
		int totalcol = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total no of row: " + totalrows);
		System.out.println("Total no of cell: " + totalcol);
		
		for(int r=0; r<=totalrows; r++) {
			
			XSSFRow currentRow = sheet.getRow(r);
			
			
			for(int c=0; c<totalcol; c++) {
				
				XSSFCell cell = currentRow.getCell(c);  //   cell.getStringCellValue()
				cell.toString();
				
				System.out.print(cell.toString() + "\t");
				
			}
			System.out.println();
		}
		workbook.close();
		file.close();
		
	}

}
