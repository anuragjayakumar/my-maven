package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Row {
	public static  void particular_Row() throws IOException {
		File f = new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\maven_\\dummy.excel.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(1);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < physicalNumberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType Type = cell.getCellType();
			if (Type.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
			}else if (Type.equals(CellType.NUMERIC)) {
				         double numericCellValue = cell.getNumericCellValue();
				         String value = String.valueOf(numericCellValue);
				         System.out.println(value);
				          
				
			}
			
		}
		
	book.close();	
	}
	public static void main(String[] args) throws IOException {
		particular_Row();
		
	}
}