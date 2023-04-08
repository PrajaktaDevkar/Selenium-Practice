package exceloperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkingwithDateCell {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		XSSFCell cell = sheet.createRow(0).createCell(0);
		cell.setCellValue(new Date());// Date class is present in java.util. It will return todays date
		
			CreationHelper creationHelper = workbook.getCreationHelper();
		
		
				//format1: "dd/mm/yyyy"
				CellStyle style = workbook.createCellStyle();
				style.setDataFormat(creationHelper.createDataFormat().getFormat("dd-mm-yyyy"));  
				
				XSSFCell cell1 = sheet.createRow(1).createCell(0);
				cell1.setCellValue(new Date());
				cell1.setCellStyle(style);
		
		
				//format2: "dd/mon/yyyy"
				CellStyle style1 = workbook.createCellStyle();
				style1.setDataFormat(creationHelper.createDataFormat().getFormat("mm/dd/yyyy"));  
				
				XSSFCell cell2 = sheet.createRow(2).createCell(0);
				cell2.setCellValue(new Date());
				cell2.setCellStyle(style1);
				
				
				
			
				//format1: "hh:mm:ss"
				CellStyle style2 = workbook.createCellStyle();
				style2.setDataFormat(creationHelper.createDataFormat().getFormat("hh:mm:ss"));  
				
				XSSFCell cell3 = sheet.createRow(3).createCell(0);
				cell3.setCellValue(new Date());
				cell3.setCellStyle(style2);
				
				
				//format1: "dd/mm/yyyy hh:mm:ss"
				CellStyle style3 = workbook.createCellStyle();
				style.setDataFormat(creationHelper.createDataFormat().getFormat("dd-mm-yyyy hh:mm:ss"));  
				
				XSSFCell cell4 = sheet.createRow(4).createCell(0);
				cell4.setCellValue(new Date());
				cell4.setCellStyle(style3);
	
		
		FileOutputStream outStream= new FileOutputStream(".\\dataFiles\\dateExcel.xlsx");
		workbook.write(outStream);
		outStream.close();
		workbook.close();
		System.out.println("Done.....");
		

	}

}
