package com.assertt.demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
	@Test
	private void demo_A() {
		String db_username = "_anurag";
			String actual = "anurag";
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(actual,db_username);
			soft.assertAll();///----------------------throw exception
			System.out.println("verification successfully");
				

	}

}
