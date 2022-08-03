package com.adactin.base;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.helper.files.Page_object_manager;
import com.pom.adactin.Rerun_Purpose;
import com.utility.files.Utility_files;

public class Testng_Runner extends Utility_files {
	public static WebDriver driver = Utility_files.browser_lancher("chrome");
	public static Page_object_manager obj_manager = new Page_object_manager(driver);



	@Test(retryAnalyzer = Rerun_Purpose.class, priority = 1)
	private void adactin_retry() throws IOException {
		get_url("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String username = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 10, 4);
		sentKeys(obj_manager.getHome().getUsername(), username);
		String password = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 11, 4);
		sentKeys(obj_manager.getHome().getPassword(), password);
		String excepted_Url = "https://adactinhotelapp.com/SearchHotel.php";
		String actual = "https://adactinhotelapp.com/";
		Assert.assertEquals(actual, excepted_Url);

	}

	@Test(priority = 2)
	private void adactin_login() throws IOException {
		get_url("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String username = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 10, 4);
		sentKeys(obj_manager.getHome().getUsername(), username);
		String password = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 11, 4);
		sentKeys(obj_manager.getHome().getPassword(), password);
		click(obj_manager.getHome().getLogin_button());
		String actual = driver.getCurrentUrl();
		String excepted_Url = "https://adactinhotelapp.com/SearchHotel.php";
		Assert.assertEquals(actual, excepted_Url);

	}

	@Test(priority = 3)
	private void select_Hotel() {
		click(obj_manager.getSearch().getLocation());
		click(obj_manager.getSearch().getHotel());
		click(obj_manager.getSearch().getRoom_type());
		click(obj_manager.getSearch().getNumber_of_rooms());
		click(obj_manager.getSearch().getCheck_in_date());
		click(obj_manager.getSearch().getCheck_out_date());
		click(obj_manager.getSearch().getAdults_per_room());
		click(obj_manager.getSearch().getChildren_per_room());
		click(obj_manager.getSearch().getSubmit_button());
		click(obj_manager.getSelect().getCheck_box());
		click(obj_manager.getSelect().getSubmit());

	}

	@Test(priority = 4)
	private void payment() throws IOException {
		implicit_Wait(driver, 10);
		String firstname = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 22, 4);
		sentKeys(obj_manager.getPayments().getFirst_Name(), firstname);
		String lastname = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 23, 4);
		sentKeys(obj_manager.getPayments().getLast_name(), lastname);
		String address = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 24, 4);
		sentKeys(obj_manager.getPayments().getBilling_address(), address);
		String creditcard_number = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 25, 4);
		sentKeys(obj_manager.getPayments().getCredit_card_number(), creditcard_number);
		click(obj_manager.getPayments().getCredit_card_type());
		click(obj_manager.getPayments().getMonth());
		click(obj_manager.getPayments().getYear());
		String ccv_number = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 28, 4);
		sentKeys(obj_manager.getPayments().getCcv(), ccv_number);
		click(obj_manager.getPayments().getBook_now());

	}

	@Test(priority = 5)
	private void close_page() {
		driver.quit();

	}

}
