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

public class Particular_cell {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\maven_\\dummy.excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(1);
		CellType Type = cell.getCellType();	
			if (Type.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);

			}else if (Type.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				System.out.println(numericCellValue);
				
			}
book.close();
		}
	}

