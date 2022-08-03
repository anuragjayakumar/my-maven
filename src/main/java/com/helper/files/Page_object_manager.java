package com.helper.files;

import org.openqa.selenium.WebDriver;

import com.pom.adactin.Home_page;
import com.pom.adactin.Payment_details_page;
import com.pom.adactin.Search_Hotel_Page;
import com.pom.adactin.Select_Hotel;
public class Page_object_manager {
	public WebDriver driver;
	
	
	
	public Page_object_manager(WebDriver driver) {//create a constructor for passing the driver
        this.driver=driver;
	
	}
	
	private Home_page home;//-----null
	
	public Home_page getHome() {
		if (home== null) {
			
		
		home = new Home_page(driver);
		}
		return home;
	}

	private Search_Hotel_Page search;
	public Search_Hotel_Page getSearch() {
		if (search==null) {
			
		
		search = new Search_Hotel_Page(driver);
		}
		return search;
	}

	private Select_Hotel select;
	public Select_Hotel getSelect() {
		if (select==null) {
			
		
		select = new Select_Hotel(driver);
		}
		return select;
	}

	private Payment_details_page payments;
	public Payment_details_page getPayments() {
		if (payments== null) {
			
		
		payments = new Payment_details_page(driver);
		}
		return payments;
	}
	
}