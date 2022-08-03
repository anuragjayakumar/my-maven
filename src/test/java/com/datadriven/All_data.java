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

public class All_data {
	
	public static  void all_Data() throws IOException {
		File f = new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\maven_\\dummy.excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheetAt(0);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType Type = cell.getCellType();
				if (Type.equals(CellType.STRING)) {
					String CellValue = cell.getStringCellValue();
					System.out.print (CellValue+" ");
					
					
				}else if (Type.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					String valueOf = String.valueOf(numericCellValue);
					System.out.print (valueOf+" ");
					
				}
				
			}
			System.out.println();
		}
		book.close();	
		}
		
		public static void main(String[] args) throws IOException {
			all_Data();
			
			
		}
		
		

	}


