package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_to_checkout {
	public static WebDriver driver;
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed_to_checkout;

	public Proceed_to_checkout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getProceed_to_checkout() {
		return proceed_to_checkout;
	}

	}

