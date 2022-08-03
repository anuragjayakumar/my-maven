package com.testng.features;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_demo_method {
	@Test
	private void laptop() {
		System.out.println("laptop");

	}@BeforeMethod
	public  void login() {
		System.out.println("login");

	}@AfterMethod
	private void logout() {
		System.out.println("logout");

	}@Test
	public  void mobiles() {
		System.out.println("mobiles");
		
	}@Test
	private void headphones() {
		System.out.println("headphones");

	}
	

}
