package com.Automation.base;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utility.files.Utility_files;

public class Runner_Base_implementation extends Utility_files {
	public static WebDriver driver;

	public static void login() throws InterruptedException {
		WebElement sign_in_btn = driver.findElement(By.xpath("//a[@class='login']"));
		click(sign_in_btn);
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		sentKeys(email,"anurag@6875.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		sentKeys(password, "Anurag@12457");
		Thread.sleep(2000);
		WebElement submit_btn = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		click(submit_btn);
	}

	public static void select_Dresses() {
		WebElement dresses = driver.findElement(
				By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[.='Dresses']"));
		actions_move_to_element(dresses);
		WebElement casual_dresses = driver.findElement(
				By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']/li/a[.='Casual Dresses']"));
		actions_move_to_element(casual_dresses);
		actions_click(casual_dresses);
		WebElement image_Click = driver.findElement(By.xpath("//a[@class='product_img_link']"));
		click(image_Click);
		WebElement frames = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		switch_To_Frame(frames);
		WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
		click(quantity);
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		drop_Down(size,"by index", "1");
		
		WebElement colour = driver.findElement(By.xpath("//a[@title='Orange']"));
		click(colour);
		WebElement add_To_Cart = driver.findElement(By.xpath("//p[@id='add_to_cart']/button/span"));
		click(add_To_Cart);
		switch_to_default_content(null);
		implicit_Wait(driver, 10);
	}

	public static void checkout_process() {
		WebElement proceed_to_checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
        click(proceed_to_checkout);
		WebElement proceed_to_checkout_confi = driver
				.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		implicit_Wait(driver, 10);
        click(proceed_to_checkout_confi);
		WebElement proceed_to_checkout_Adress = driver.findElement(By.xpath("//button[@name='processAddress']"));
        implicit_Wait(driver, 10);
        click(proceed_to_checkout_Adress);
		WebElement agree_Term_con = driver.findElement(By.xpath("//input[@type='checkbox']"));
		click(agree_Term_con);
		WebElement proceed_to_checkout_shipping = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		click(proceed_to_checkout_shipping);
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
	    click(payment);
		WebElement conform_Order = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		implicit_Wait(driver, 10);
		click(conform_Order);
		WebElement back_to_Order = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
		implicit_Wait(driver, 10);
        click(back_to_Order);
         WebElement scroll_Down = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("(arguments[0].scrollIntoView)", scroll_Down);

		
	}

	public static void main(String[] args) throws InterruptedException {
		 driver = browser_lancher("chrome");
		 get_url("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		login();
		select_Dresses();
		checkout_process();
		

	}

	}


