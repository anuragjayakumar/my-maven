package com.pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.helper.files.Page_object_manager;
import com.utility.files.Utility_files;

public class Adactin_pom_Runner extends Utility_files{
	public static WebDriver driver = Utility_files.browser_lancher("chrome");
	public static Page_object_manager obj_manager = new Page_object_manager(driver);
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		get_url("https://adactinhotelapp.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String username = particular_Cell("D:\\excel file\\hotel testcase.xlsx",0,10,4);
	sentKeys(obj_manager.getHome().getUsername(),username);
	String password = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 11, 4);
	sentKeys(obj_manager.getHome().getPassword(),password);
	click(obj_manager.getHome().getLogin_button());
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
	
	String firstname = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 22, 4);
	sentKeys(obj_manager.getPayments().getFirst_Name(),firstname);
	String lastname = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 23, 4);
	sentKeys(obj_manager.getPayments().getLast_name(),lastname);
	String address = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 24, 4);
	sentKeys(obj_manager.getPayments().getBilling_address(),address);
	String creditcard_number = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 25, 4);
	sentKeys(obj_manager.getPayments().getCredit_card_number(),creditcard_number);
	click(obj_manager.getPayments().getCredit_card_type());
	click(obj_manager.getPayments().getMonth());
	click(obj_manager.getPayments().getYear());
	String ccv_number = particular_Cell("D:\\excel file\\hotel testcase.xlsx", 0, 28, 4);
	sentKeys(obj_manager.getPayments().getCcv(),ccv_number);
	click(obj_manager.getPayments().getBook_now());
    
			
	}

}
