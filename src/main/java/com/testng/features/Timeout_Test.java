package com.testng.features;

import org.testng.annotations.Test;

public class Timeout_Test {
	@Test(timeOut = 8000)
	private void demo() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("browser launcher");
		
		Thread.sleep(2000);
		System.out.println("url");
		
		Thread.sleep(6000);
		System.out.println("Credentials entered");

	}

}
