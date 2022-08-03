package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class select_dresess {
	public static WebDriver driver;
	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[.='Dresses']")
	private  WebElement dresses;
	@FindBy(xpath = "//ul[@class='submenu-container clearfix first-in-line-xs']/li/a[.='Casual Dresses']")
	private WebElement casual_dresses;
	@FindBy(xpath ="//a[@class='product_img_link']" )
	private WebElement image ;
	@FindBy(xpath ="//iframe[@class='fancybox-iframe']" )
	private WebElement frame ;
	@FindBy(xpath ="//input[@id='quantity_wanted']" )
	private WebElement quantity ;
	@FindBy(xpath ="//select[@name='group_1']" )
	private WebElement size ;
	@FindBy(xpath ="//a[@title='Orange']" )
	private WebElement colour;
	@FindBy(xpath ="//p[@id='add_to_cart']/button/span" )
	private WebElement add_to_cart ;
	
	public select_dresess(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
		
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getCasual_dresses() {
		return casual_dresses;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getAdd_to_cart() {
		return add_to_cart;
	}

	
    	 
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
