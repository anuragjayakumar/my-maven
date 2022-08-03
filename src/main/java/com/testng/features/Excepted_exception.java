package com.testng.features;

import org.testng.annotations.Test;

public class Excepted_exception {
	@Test(expectedExceptions = ArithmeticException.class)
	private void zebronics() {
		System.out.println(20/0);

	}
	@Test
	private void offer() {
		System.out.println("offers");

	}
	@Test
	private void lenovo() {
		System.out.println("lenovo");

	}
	
	

}
