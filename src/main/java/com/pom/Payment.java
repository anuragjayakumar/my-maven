package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public static WebDriver driver ;
	@FindBy(xpath = "//a[@class='bankwire']")
	private  WebElement pay_by_bank;
	@FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
	private WebElement back_to_order;
	
	public WebElement getBack_to_order() {
		return back_to_order;
	}


	public WebElement getI_conform_my_order() {
		return i_conform_my_order;
	}


	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement i_conform_my_order;
	
	
	
	public Payment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}


	public WebElement getPay_by_bank() {
		return pay_by_bank;
	}


	

	}
	
	


