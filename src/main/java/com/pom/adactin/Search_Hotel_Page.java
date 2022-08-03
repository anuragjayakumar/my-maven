package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	public static WebDriver driver;
	@FindBy(xpath = "//option[@value='London']")
	private WebElement location;
	@FindBy(xpath = "//option[@value='Hotel Sunshine']")
	private WebElement hotel ;
	@FindBy(xpath = "//option[@value='Double']")
	private WebElement room_type ;
	@FindBy(xpath = "(//option[@value='2'])[1]")
	private WebElement number_of_rooms ;
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement check_in_date ;
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement check_out_date;
	@FindBy(xpath = "(//option[@value='2'])[2]")
	private WebElement adults_per_room ;
	@FindBy(xpath = "//option[@value='0']")
	private WebElement children_per_room ;
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement submit_button;
	
	
	public Search_Hotel_Page (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getRoom_type() {
		return room_type;
	}


	public WebElement getNumber_of_rooms() {
		return number_of_rooms;
	}


	public WebElement getCheck_in_date() {
		return check_in_date;
	}


	public WebElement getCheck_out_date() {
		return check_out_date;
	}


	public WebElement getAdults_per_room() {
		return adults_per_room;
	}


	public WebElement getChildren_per_room() {
		return children_per_room;
	}


	public WebElement getSubmit_button() {
		return submit_button;
	}


}
