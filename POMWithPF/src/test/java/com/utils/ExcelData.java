package com.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelData {
	
	public static String[][] getData(String filename, String sheetname) throws IOException{
		
		FileInputStream fis = new FileInputStream("src/test/resources/"+filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetname);
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Rows and Cols ["+sheetname+"]: "+rows+" "+cols);
		
		String[][] data = new String[rows-1][cols];
		
		for(int i=1; i<rows; i++){
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<cols; j++)
			{
				data[i-1][j] = getCellValue(row.getCell(j));
			}
		}
		
		return data;
	}
	
	public static String getCellValue(XSSFCell cell) {
	    if (cell == null) return "";

	    switch (cell.getCellType()) {
	        case STRING:
	            return cell.getStringCellValue();

	        case NUMERIC:
	        	return String.valueOf((long) cell.getNumericCellValue());

	        case BOOLEAN:
	            return String.valueOf(cell.getBooleanCellValue());

	        case BLANK:
	            return "";

	        default:
	            return "";
	    }
	}
}
