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

public class Read_data {

	public static void main(String[] args) throws IOException {
//step:1 convert.xlsx into file
		File f = new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\maven_\\dummy.excel.xlsx");
//step:2 to read data from excel
		FileInputStream fis = new FileInputStream(f);
//step:3 connect with workbook
		Workbook wb = new XSSFWorkbook(fis);//---------upcasting
//step:4 connect with sheet
		 Sheet s = wb.getSheetAt(0);
//step:5 connect with row
		  Row r = s.getRow(3);
//step:6 connect with cell
		  Cell c= r.getCell(1);
//step:7 check the cell type
		  CellType type = c.getCellType();
//step:8 compare the cell values
		  if (type.equals(CellType.STRING)) {
			  
			  String value = c.getStringCellValue();
			  System.out.println(value);
			
		}
		  else if (type.equals(CellType.NUMERIC)) {
			  double numericCellValue = c.getNumericCellValue();
			  //double into int
			    int i = (int) numericCellValue;
			  //double into String
			    String s1 = String.valueOf(numericCellValue);
			    System.out.println(i);
			    System.out.println(s1);
			  wb.close();
			  
			
		}
		  
				
		
		
		
	}

}
