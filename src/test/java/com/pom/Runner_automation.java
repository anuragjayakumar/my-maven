package com.pom;

import org.openqa.selenium.WebDriver;

import com.helper.files.Pg_obj_man_Automation;
import com.utility.files.Utility_files;

public class Runner_automation extends Utility_files {
	public static WebDriver driver = Utility_files.browser_lancher("chrome");
	public static Pg_obj_man_Automation manager = new Pg_obj_man_Automation(driver);

	
	public static void main(String[] args) throws InterruptedException {
		get_url("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		click(manager.getHome().getSign_in_button());
		sentKeys(manager.getLogin().getEmail(),"anurag@6875.com");
		sentKeys(manager.getLogin().getPassword(),"Anurag@12457");
		click(manager.getLogin().getSubmit_Btn());
		implicit_Wait(driver, 10);
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

}
}
