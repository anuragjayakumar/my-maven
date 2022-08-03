package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	public static WebDriver driver;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement accept_terms_and_con;
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement proceed_to_checkout;
	
	public Shipping(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getAccept_terms_and_con() {
		return accept_terms_and_con;
	}

	public WebElement getProceed_to_checkout() {
		return proceed_to_checkout;
	}


	}
	
		



