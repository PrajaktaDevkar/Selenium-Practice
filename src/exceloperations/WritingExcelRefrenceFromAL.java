package exceloperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelRefrenceFromAL {

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("emp Info");
		
		ArrayList<Object[]> empData= new ArrayList<Object[]>();
		empData.add(new Object[] {"EmpId","Name","Job"});
		empData.add(new Object[] {100,"Scott","Engineer"});
		empData.add(new Object[] {101,"Smith","Manager"});
		empData.add(new Object[] {102,"Ram","Analyst"});
		
		int rowCount=0;
		for(Object[] emp:empData)
		{
			XSSFRow row = sheet.createRow(rowCount++);
			int colCount = 0;
			
			for(Object value: emp) 
			{
				XSSFCell cell = row.createCell(colCount++);
				
				if(value instanceof Integer)
				cell.setCellValue((Integer)value);
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		
		
		String filePath = ".\\dataFiles\\Employee.xlsx";
		FileOutputStream outstream = new  FileOutputStream(filePath);
		workbook.write(outstream);
		
		System.out.print("Empolyee.xlsx file created sucessfully.....");
		
		
		
	}

}
