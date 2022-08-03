package com.social.media;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Social_Media {
	public static WebDriver driver;
	
	public static void facebook() {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\maven_\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().fullscreen();
	
		
		

	}
	public  static void instagram() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\maven_\\Driver\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.get("https://www.instagram.com/");
					driver.manage().window().fullscreen();
		

	}
	
	

}
