package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingPasswordProtectedExcel {

	public static void main(String[] args) throws IOException {


		String filePath=".\\dataFiles\\PasswordProtected.xlsx";
		FileInputStream inputStream = new FileInputStream(filePath);
		String pass="Qwerty#1";
		
		//XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		
		Workbook workbook = WorkbookFactory.create(inputStream, pass);
		//XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(inputStream, pass);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		//XSSFSheet sheet = (XSSFSheet) workbook.getSheet("Sheet1");
		
		//Using For loop
		
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		int col = sheet.getRow(0).getLastCellNum();
		System.out.println(col);
		/*for(int i=0;i<=rows;i++) 
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<col;j++) 
			{
				Cell cell = row.getCell(j);
				switch(cell.getCellType()) 
				{
				case STRING: System.out.print(cell.getStringCellValue());
				break;
				
				case NUMERIC: System.out.print(cell.getNumericCellValue());
				break;
				
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());
				break;
				
				}
				System.out.print("|");
			}
			System.out.println();
		}*/
		
		
		Iterator rowiterator = sheet.iterator();
		while(rowiterator.hasNext())
		{
			XSSFRow row = (XSSFRow) rowiterator.next();
			Iterator cellIterartor = row.cellIterator();
			while(cellIterartor.hasNext()) 
			{
				XSSFCell cell = (XSSFCell) cellIterartor.next();
				switch(cell.getCellType()) 
				{
				case STRING:System.out.print(cell.getStringCellValue());
				break;
				
				case NUMERIC:System.out.print(cell.getNumericCellValue());
				break;
				
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());
				break;
				}
				
				System.out.print("|");
			}
			
			System.out.println();
		}
		
		
	}

}
