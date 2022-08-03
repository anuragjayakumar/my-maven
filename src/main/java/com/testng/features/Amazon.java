package com.testng.features;

import org.testng.annotations.Test;

public class Amazon {
	
	@Test
	private void zebronics() {
		System.out.println("zebronics");

	}
	@Test(dependsOnMethods = "zebronics")
	private void offer() {
		System.out.println("offers");

	}
	@Test
	private void lenovo() {
		System.out.println("lenovo");

	}
	

	}
	


