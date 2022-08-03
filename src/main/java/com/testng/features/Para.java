package com.testng.features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para{
	@Parameters({"id","pass"})
	@Test
	private void Credentials_demo(String email,String password) {
		System.out.println(email);
		System.out.println(password);

	}

}
