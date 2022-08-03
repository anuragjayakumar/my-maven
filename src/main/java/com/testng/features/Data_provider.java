package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	@DataProvider
	private String[][] test_Data() {
		String[][] data = {
				{"lokesh","donlokesh420"},
				{"naveen","playboynaveen650"},
				{"Sultan","jaisulthan2020"},
				{"pream","thalapream"}
		};
      return  data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test(dataProvider = "test_Data" )
	private void credentials_login(String email,String password) {
		System.out.println(email);
		System.out.println(password);
		System.out.println("product search");
		System.out.println("Add to cart");

	}

}
