package com.pom;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.helper.files.Pg_obj_man_Automation;
import com.utility.files.Utility_files;

public class Testng_Automation_runner extends Utility_files {
	public static WebDriver driver;
	public static Pg_obj_man_Automation manager;
	public static Logger log;
	@Test(priority = -5,invocationTimeOut = 60000,description = "browser lancher")
	private void browser_Lanuch() {
		 driver = Utility_files.browser_lancher("chrome");
		 get_url("http://automationpractice.com/index.php");
		 log=Logger.getLogger(Testng_Automation_runner.class);
		 BasicConfigurator.configure();
		 log.info("browser_Lancher");
		 
		 

	}
	@Test(priority = -4,description ="obj man")
	private void object_manager() {
		 manager = new Pg_obj_man_Automation(driver);
		 log.info("object manager");

	}
	@Test(priority = -3,description ="login")
	private void login_process() throws IOException {
		click(manager.getHome().getSign_in_button());
		String email = particular_Cell("C:\\Users\\Manojkrishnan\\eclipse-workspace\\maven_\\testcase (automation).xlsx", 0,25,4);
		sentKeys(manager.getLogin().getEmail(),email);
		String password = particular_Cell("C:\\Users\\Manojkrishnan\\eclipse-workspace\\maven_\\testcase (automation).xlsx", 0,26,4);
		sentKeys(manager.getLogin().getPassword(),password);
		click(manager.getLogin().getSubmit_Btn());
		implicit_Wait(driver, 10);
		log.info("login_process");
		implicit_Wait(driver, 10);
		

	}
	@Test(priority = -2,description ="dress")
	private void casual_Dresses() {
		actions_move_to_element(manager.getSelect().getDresses());
		actions_move_to_element(manager.getSelect().getCasual_dresses());
		click(manager.getSelect().getCasual_dresses());
		click(manager.getSelect().getImage());
		switch_To_Frame(manager.getSelect().getFrame());
		click(manager.getSelect().getQuantity());
		drop_Down(manager.getSelect().getSize(),"by index", "1");
		click(manager.getSelect().getColour());
		click(manager.getSelect().getAdd_to_cart());
		switch_to_default_content(null);
		implicit_Wait(driver, 10);
		log.info("select dresses");

	//}
	//private void evening_Dress() {
		

	}
	@Test(priority = -1,description = "checkout")
	private void Checkout_Process() {
		click(manager.getCheckout().getProceed_to_checkout());
		implicit_Wait(driver, 10);
		click(manager.getSummary().getProceed_to_checkout());
		click(manager.getAddress().getProceed_to_checkout());
		click(manager.getShip().getAccept_terms_and_con());
		click(manager.getShip().getProceed_to_checkout());
		implicit_Wait(driver, 10);
		click(manager.getPay().getPay_by_bank());
		implicit_Wait(driver, 10);
		click(manager.getPay().getI_conform_my_order());
		click(manager.getPay().getBack_to_order());
		log.info("checkout process");
		 

	}
	
	

	
		
		
		
		


}
