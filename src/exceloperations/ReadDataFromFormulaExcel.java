package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromFormulaExcel {

	public static void main(String[] args) throws IOException {
		
		String filePath = ".\\dataFiles\\readformula.xlsx";
		FileInputStream inputStream = new FileInputStream(filePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		 int cellCount = sheet.getRow(0).getLastCellNum();
		 
		 for(int i=0;i<rowCount;i++)
		 {
			 XSSFRow row =sheet.getRow(i);
			 
			 for(int j=0;j<cellCount;j++) 
			 {
				 XSSFCell cell = row.getCell(j);
				 
				 switch(cell.getCellType()) 
				 {
				 case STRING :System.out.print(cell.getStringCellValue());
				 break;
				 
				 case NUMERIC :System.out.print(cell.getNumericCellValue());
				 break;
				 
				 case BOOLEAN :System.out.print(cell.getBooleanCellValue());
				 break;
				 
				 case FORMULA:System.out.print(cell.getNumericCellValue());
				 break;
				 
				 }
				 System.out.print("|");
				 
			 }
			 System.out.println();
			 
		 }

	}

}
