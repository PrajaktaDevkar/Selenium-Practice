package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
	
		String excelFilePath= ".\\dataFiles\\countries.xlsx";
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//Read the excel using for loop
		
	/*	int rows = sheet.getLastRowNum();// It will give Number of rows in the sheet
		System.out.println("Last rows:"+" "+ rows);
		
		int col = sheet.getRow(1).getLastCellNum(); //getLastCellNum() return No.of cell in a row
		System.out.println("Last col:"+" "+ col);
		
		for(int i=0;i<=rows;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<col;j++) 
			
			{
				XSSFCell cell = row.getCell(j);
				switch(cell.getCellType())
				{
				case STRING: System.out.println(cell.getStringCellValue());
				break;
				case NUMERIC:System.out.println(cell.getNumericCellValue());
				break;
				case BOOLEAN: System.out.println(cell.getBooleanCellValue());
				break;
				}
				
			}
		}*/
		
		
		////Reading Excel using Iterator
		
				Iterator iterator=sheet.iterator();
				while(iterator.hasNext()) 
				{
					XSSFRow row = (XSSFRow)iterator.next();
					Iterator cellIterator = row.cellIterator();
					while(cellIterator.hasNext()) 
					{
						XSSFCell cell=(XSSFCell) cellIterator.next();
						switch(cell.getCellType()) {
						case STRING:System.out.println(cell.getStringCellValue());
						break;
						case NUMERIC:System.out.println(cell.getNumericCellValue());
						break;
						case BOOLEAN:System.out.println(cell.getBooleanCellValue());
						break;
						}
						
					}
				}
		
		
	}

}
