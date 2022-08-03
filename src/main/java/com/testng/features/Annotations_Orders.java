package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Orders {
	@BeforeSuite
	private void set_property() {
		System.out.println("Set property");

	}@BeforeTest
	private void browser_Lanch() {
		System.out.println("browser launch");

	}@BeforeClass
	private void Url() {
		System.out.println("Url");

	}@Test
	private void laptop() {
		System.out.println("laptop");

	}@BeforeMethod
	private void login() {
		System.out.println("login");

	}@AfterMethod
	private void logout() {
		System.out.println("logout");

	}@Test
	private void mobile() {
		System.out.println("mobile");

	}@Test
	private void headphones() {
		System.out.println("headphones");

	}@AfterClass
	private void verify_Home_Page() {
		System.out.println("verify home page ");

	}@AfterTest
	private void close() {

	}@AfterSuite
	private void detete_All_cookies() {
		System.out.println("delete all cookies");

	}
	
	
	
	
	
	
	
	

}
