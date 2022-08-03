package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_details_page {
	public static WebDriver driver;
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement first_Name ;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement last_name;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement billing_address ;
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement credit_card_number ;
	@FindBy(xpath = "//option[@value='VISA']")
	private WebElement credit_card_type ;
	@FindBy(xpath = "//option[@value='11']")
	private WebElement month ;
	@FindBy(xpath = "//option[@value='2022']")
	private WebElement year;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement ccv;
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book_now;
	
	public Payment_details_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getBilling_address() {
		return billing_address;
	}

	public WebElement getCredit_card_number() {
		return credit_card_number;
	}

	public WebElement getCredit_card_type() {
		return credit_card_type;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook_now() {
		return book_now;
	}
}


