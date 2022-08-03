package com.adactin.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.files.Utility_files;

public class adactin_base_implementation extends Utility_files {
	public static WebDriver driver;
	
public static  void login_process() {
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		sentKeys(username, "anurag1811");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		sentKeys(password, "anurag1999");
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		click(login);
}
public static void search_Hotel_Sun_Shine () throws InterruptedException {
	WebElement Location = driver.findElement(By.xpath("//option[@value='London']"));
	click(Location);
	WebElement Hotels = driver.findElement(By.xpath("//option[@value='Hotel Sunshine']"));
	click(Hotels);
	WebElement Room_Type = driver.findElement(By.xpath("//option[@value='Double']"));
	click(Room_Type);
	WebElement Number_of_Rooms = driver.findElement(By.xpath("(//option[@value='2'])[1]"));
	click(Number_of_Rooms);
	WebElement Check_In_Date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	click(Check_In_Date);
	WebElement Check_out_Date = driver.findElement(By.xpath("//input[@id='datepick_out']"));
	click(Check_out_Date);
	WebElement Adults_per_Room = driver.findElement(By.xpath("(//option[@value='2'])[2]"));
	click(Adults_per_Room);
	WebElement Children_per_Room = driver.findElement(By.xpath("//option[@value='0']"));
	click(Children_per_Room);
	WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
	click(submit);
}
public  static void  select_hotel() {
	WebElement Select_Hotel = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	click(Select_Hotel);
	WebElement click_continue = driver.findElement(By.xpath("//input[@type='submit']"));
	click(click_continue);

}
public static void payment_Details() throws InterruptedException {
	WebElement first_name = driver.findElement(By.xpath("//input[@name='first_name']"));
	sentKeys(first_name, "Anurag");
	WebElement last_name = driver.findElement(By.xpath("//input[@name='last_name']"));
	sentKeys(last_name, ".j");
	WebElement billing_address = driver.findElement(By.xpath("//textarea[@name='address']"));
	sentKeys(billing_address, "no:12 , porur ,chennai");
	Thread.sleep(2000);
	WebElement credit_card_number = driver.findElement(By.xpath("//input[@name='cc_num']"));
	sentKeys(credit_card_number, "5001010110826662");
	WebElement credit_card_type = driver.findElement(By.xpath("//option[@value='VISA']"));
	click(credit_card_type);
	// Expiry date
	// month
	WebElement month = driver.findElement(By.xpath("//option[@value='11']"));
	click(month);
	WebElement year = driver.findElement(By.xpath("//option[@value='2022']"));
	click(year);
	Thread.sleep(2000);
	// ccv
	WebElement ccv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	sentKeys(ccv, "108");
	Thread.sleep(2000);
	WebElement book_now = driver.findElement(By.xpath("//input[@id='book_now']"));
	click(book_now);
}

	public static void main(String[] args) throws InterruptedException {
		
	 driver = browser_lancher("chrome");
	 get_url("https://adactinhotelapp.com/");
	 login_process();
	 search_Hotel_Sun_Shine();
	 select_hotel();
	 payment_Details();


}
}