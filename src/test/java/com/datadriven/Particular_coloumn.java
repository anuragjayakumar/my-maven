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

public class Particular_coloumn {
	public static  void particular_coloumn() throws IOException {
		File f = new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\maven_\\dummy.excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(1 );
			CellType Type = cell.getCellType();
			if (Type.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
			}
			else if (Type.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				String value = String.valueOf(numericCellValue);
				System.out.println(value);
				
				
				
				
			}
				
			}
			wb.close();
		}
	public static void main(String[] args) throws IOException {
		particular_coloumn();
		
	}
		
		
			
			
		}
		
		


		
		

