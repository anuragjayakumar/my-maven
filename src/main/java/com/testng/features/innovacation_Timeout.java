package com.testng.features;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utility.files.Utility_files;

public class innovacation_Timeout extends Utility_files{
	public static WebDriver driver;
	@Test(invocationCount = 3,invocationTimeOut = 4000)
	private void browser_Launch() {
		driver = browser_lancher("chrome");
		get_url("https://www.facebook.com/");
		
	}
	

}
