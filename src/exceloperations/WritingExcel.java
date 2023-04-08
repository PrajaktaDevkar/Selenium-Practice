package exceloperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Emp Info");
		
		Object empData [][] = { {"EmpID","Name","Job"},
								{100,"scoot","Engineer"},
								{101,"Smith","Manager"},
								{102,"David","Analyst"}
							  };
		
		int rows = empData.length;
		int cols = empData[0].length;
		System.out.println(rows);
		System.out.println(cols);
		
		
		//Using For Loop 
		
	/*	for(int i=0;i<rows;i++) {
			
			XSSFRow row = sheet.createRow(i);
			
			for(int j= 0; j<cols;j++) {
				
				XSSFCell cell = row.createCell(j);
				
				Object arrayValue = empData[i][j];
				
				if(arrayValue instanceof String)
				cell.setCellValue((String)arrayValue);
				
				if(arrayValue instanceof Integer)
				cell.setCellValue((Integer)arrayValue);
				
				if(arrayValue instanceof Boolean)
				cell.setCellValue((Boolean)arrayValue);
			}
		}
		*/
		
		// Using for each loop
		
		int rowcount=0;
		
		for(Object emp[]:empData)
		{
			XSSFRow row = sheet.createRow(rowcount++);
			int colCount=0;
		
			for(Object value:emp) 
			{
				XSSFCell cell = row.createCell(colCount++);
				
				if(value instanceof String)
					cell.setCellValue((String)value);
					
					if(value instanceof Integer)
					cell.setCellValue((Integer)value);
					
					if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		
		
		String filePath=".\\dataFiles\\employee.xlsx";
		FileOutputStream outStream = new FileOutputStream(filePath);
		workbook.write(outStream);
		outStream.close();
		System.out.print("Employee.xlsx file written successfully....");
	}

}
