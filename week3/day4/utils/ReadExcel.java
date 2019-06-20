package org.testleaf.leaftaps.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	public static String[][] getExcelData(String excelFileName) throws IOException {
		//open work book
		XSSFWorkbook  wbook = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		//got to sheet
		XSSFSheet sheet = wbook.getSheetAt(0);
		//get row counts
		int rowcount = sheet.getLastRowNum();
		//get column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowcount][columnCount];
		System.out.println(rowcount+" : "+columnCount);
		for (int i = 1; i <= rowcount; i++) {
			//each row
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				//each column
				XSSFCell cell = row.getCell(j);
				//get string Value
				String value = cell.getStringCellValue();
				data[i-1][j]=value;
			}
		}
		return data;
	}
	
}











