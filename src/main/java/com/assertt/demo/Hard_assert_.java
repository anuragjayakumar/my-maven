package com.assertt.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_assert_ {
	@Test
	private void demo_A() {
		String db_username = "Anurag";
		String actual = "anurag";
		Assert.assertEquals(actual,db_username);
		System.out.println("validation successfully");

	}
	@Test
	private void demo_B() {
		String db_password = "Anurag@1999";
		String actual = "Anurag@1999";
		Assert.assertEquals(actual, db_password);
		System.out.println("validation successfully");
	}

}
