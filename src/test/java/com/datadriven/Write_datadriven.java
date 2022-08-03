package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_datadriven {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\excel file\\write data.xlsx");
		FileInputStream fis = new FileInputStream(f);
	    Workbook wb = new XSSFWorkbook(fis);
	    //row headlines
	    wb.createSheet("movies").createRow(0).createCell(0).setCellValue("movie_names");
	    wb.getSheet("movies").getRow(0).createCell(1).setCellValue("year");
	    wb.getSheet("movies").getRow(0).createCell(2).setCellValue("ott_Rights");
	    wb.getSheet("movies").getRow(0).createCell(3).setCellValue("satilite Rights");
	    
	    wb.getSheet("movies").createRow(1).createCell(0).setCellValue("vikram");
	    wb.getSheet("movies").createRow(2).createCell(0).setCellValue("jaibheem");
	    wb.getSheet("movies").createRow(3).createCell(0).setCellValue("soorarai pottru");
	   
	    //1 column year
	    wb.getSheet("movies").getRow(1).createCell(1).setCellValue("2022");
	    wb.getSheet("movies").getRow(2).createCell(1).setCellValue("2021");
	    wb.getSheet("movies").getRow(3).createCell(1).setCellValue("2020");
	   
	    //2 column ott Rights
	    wb.getSheet("movies").getRow(1).createCell(2).setCellValue("hotstar");
	    wb.getSheet("movies").getRow(2).createCell(2).setCellValue("Amazon prime");
	    wb.getSheet("movies").getRow(3).createCell(2).setCellValue("Amazon prime");
	   
	    //3 column satilite Rights
	    wb.getSheet("movies").getRow(1).createCell(3).setCellValue("Star network");
	    wb.getSheet("movies").getRow(2).createCell(3).setCellValue("kalaingar tv");
	    wb.getSheet("movies").getRow(3).createCell(3).setCellValue("sun tv");
	    
	    FileOutputStream fos = new FileOutputStream(f);
	    wb.write(fos);
	    wb.close();
	    
	    
	
	}

}
