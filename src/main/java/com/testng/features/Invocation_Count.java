package com.testng.features;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(priority =-1)
	private void browser_Launch() {
		System.out.println("browser launch");

	}
	@Test(priority = 0,invocationCount = 5)
	private void refresh() {
		System.out.println("Refresh");

	}
	@Test(priority = 1)
	private void Login() {
		System.out.println("Login");

	}
	
	

}
