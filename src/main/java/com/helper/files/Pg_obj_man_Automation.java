package com.helper.files;

import org.openqa.selenium.WebDriver;

import com.pom.Address_;
import com.pom.Home_page;
import com.pom.Login_Page;
import com.pom.Payment;
import com.pom.Proceed_to_checkout;
import com.pom.Shipping;
import com.pom.Summary_page;
import com.pom.select_dresess;

public class Pg_obj_man_Automation {
	
	public static WebDriver driver;
	public Pg_obj_man_Automation (WebDriver driver) {
		this.driver = driver;
		
		

}
	private Home_page home ;
	private Login_Page login;
	private select_dresess select;
	private Proceed_to_checkout checkout;
	private Summary_page summary ;
	private Address_ address;
	private Shipping ship;
	private Payment pay;
	
	
	public Home_page getHome() {
		if (home==null) {
			home= new Home_page(driver);
			
		}
		return home;
	}
	public Login_Page getLogin() {
		if (login==null) {
			login = new Login_Page(driver);
			
		}
		return login;
	}
	public select_dresess getSelect() {
		if (select==null) {
			select= new select_dresess(driver);
			
		}
		return select;
	}
	public Proceed_to_checkout getCheckout() {
		if (checkout== null) {
			checkout= new Proceed_to_checkout(driver);
			
		}
		return checkout;
	}
	public Summary_page getSummary() {
		if (summary== null) {
			summary= new Summary_page(driver);
			
		}
		return summary;
	}
	public Address_ getAddress() {
		if (address== null) {
			address = new Address_(driver);
			
		}
		return address;
	}
	public Shipping getShip() {
		if (ship== null) {
			ship = new Shipping(driver);
			
		}
		return ship;
	}
	public Payment getPay() {
		if (pay== null) {
			pay= new Payment(driver);
			
		}
		return pay;
	}
	
	
}
