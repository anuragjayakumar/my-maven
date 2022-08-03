package com.testng.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optional_Para {
	@Parameters({"id","pass"})
	@Test
	private void facebook(@Optional("anurag")String email,String password) {
		System.out.println(email);
		System.out.println(password);

	}

}

