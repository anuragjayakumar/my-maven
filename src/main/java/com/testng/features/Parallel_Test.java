package com.testng.features;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utility.files.Utility_files;

public class Parallel_Test extends Utility_files{
	public static WebDriver driver;
	@Test
	private void M1() {
		driver = browser_lancher("chrome");
		driver.get("https://www.facebook.com/");
		
		

	}
	@Test
	private void M2() {
		driver = browser_lancher("chrome");
		driver.get("https://www.amazon.in/");
		

}
}
