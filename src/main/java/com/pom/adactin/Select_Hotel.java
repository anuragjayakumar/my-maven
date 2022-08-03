package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement check_box;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit ;
	
	public Select_Hotel(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	
	

}

	public WebElement getCheck_box() {
		return check_box;
	}

	public WebElement getSubmit() {
		return submit;
	}
}