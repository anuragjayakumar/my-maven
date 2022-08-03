package com.pom;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home_page {
	public static  WebDriver driver;
	@FindBy(xpath = "//a[@class='login']")
	private WebElement sign_in_button;
	
	public Home_page (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSign_in_button() {
		return sign_in_button;
	}





}



