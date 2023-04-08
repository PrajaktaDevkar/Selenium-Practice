package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFformulaCell2 {

	public static void main(String[] args) throws IOException {
		
		String filePath=".\\dataFiles\\Books.xlsx";
		FileInputStream inputStream = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//XSSFRow row = sheet.getRow(7);
		//XSSFCell cell = row.getCell(2);
		//cell.setCellFormula("SUM(C2:C6)");
		sheet.getRow(7).createCell(2).setCellFormula("SUM(C2:C6)");
		
		inputStream.close();
		FileOutputStream outStream = new FileOutputStream(filePath);
		workbook.write(outStream);
		workbook.close();
		outStream.close();
		
		System.out.print("Data updated sucessfully......");
		

	}

}
