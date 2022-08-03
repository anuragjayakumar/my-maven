package com.utility.files;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.microsoft.schemas.office.visio.x2012.main.RowType;
import com.pom.select_dresess;

public class Utility_files {
	public static WebDriver driver;

	public static WebDriver browser_lancher(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver",
					System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void get_url(String url) {
		driver.get(url);

	}

	public static void implicit_Wait(WebDriver d, int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	}

	public static void click(WebElement e) {
		e.click();

	}

	public static void sentKeys(WebElement e, String s) {
		e.sendKeys(s);
	}

	public static void switch_To_Frame(WebElement e) {
		driver.switchTo().frame(e);
	}

	public static void switch_to_default_content(WebElement e) {
		driver.switchTo().defaultContent();

	}

	public static void actions_click(WebElement e) {
		Actions a = new Actions(driver);
		a.click(e).build().perform();

	}

	public static void actions_move_to_element(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).build().perform();

	}

	public static void drop_Down(WebElement e, String type, String data) {
		Select s = new Select(e);
		if (type.equalsIgnoreCase("by value")) {
			s.selectByValue(data);

		} else if (type.equalsIgnoreCase("by text")) {
			s.selectByVisibleText(data);

		} else if (type.equalsIgnoreCase("by index")) {
			int val = Integer.parseInt(data);
			s.selectByIndex(val);

		}

	}

	// PARTICULAR CELL
	public static String particular_Cell(String pathname, int s, int r , int c) throws IOException {
		File f = new File(pathname);
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheetAt(s);
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		CellType Type = cell.getCellType();
		String value = null;
		if (Type.equals(CellType.STRING)) {
		  value = cell.getStringCellValue();
		} else if (Type.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			 value = String.valueOf(numericCellValue);

		}
		book.close();
		return value;

	}
	
	
			

	}



