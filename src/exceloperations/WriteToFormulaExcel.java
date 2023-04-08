package exceloperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToFormulaExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Numbers");
		
		XSSFRow row = sheet.createRow(0);
		int cellValue=10;
		for(int i=0; i<4;i++) 
		{
			System.out.println(cellValue);
			XSSFCell cell = row.createCell(i);
			if(i!=3) 
			{
				cell.setCellValue(cellValue);
				cellValue = cellValue+10;
			}
			else
			{
				cell.setCellFormula("A1*B1*C1");
				
			}
			
		
		}
		
		String filePath=".\\dataFiles\\writeformula.xlsx";
		FileOutputStream outStream = new FileOutputStream(filePath);
		workbook.write(outStream);
		outStream.close();
		System.out.println("WriteFormula.xlsx created sucessfully.....");
		
	}

}
