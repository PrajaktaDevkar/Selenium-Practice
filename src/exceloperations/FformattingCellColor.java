package exceloperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FformattingCellColor {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("FormattedSheet");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		
		// Setting Backgrond color
		XSSFCellStyle style = workbook.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.BIG_SPOTS);
		
		cell.setCellValue("Background Color");
		cell.setCellStyle(style);
		
		
		//Setting Foreground color
		style=workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.DARK_YELLOW.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		XSSFCell cell1 = row.createCell(1);
		cell1.setCellValue("Foreground color");
		cell1.setCellStyle(style);
		
		String filePath=".\\dataFiles\\FormattedExcel.xlsx";
		FileOutputStream outStream = new FileOutputStream(filePath);
		workbook.write(outStream);
		outStream.close();
		System.out.println("Sucessful......");
	}

}
