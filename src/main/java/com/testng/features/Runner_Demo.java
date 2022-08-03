package com.testng.features;

import org.testng.annotations.Test;

public class Runner_Demo extends Data_provider{
	@Test(dataProvider = "test_Data")
	private void demo_Runner(String email ,String password) {
		System.out.println(email);
		System.out.println(password);

	}
	
	
	
	
	}
	
	
		
	

		
		


