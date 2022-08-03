package com.testng.features;

public class Two_d_Arrray_Basics {
	public static void main(String[] args) {
		
		String[][] data = {
				
				
				{"starc", "aus","54"},
				{"kane","NZ","RTR"},
				{"IND","AUG","STR"}
				};
		System.out.println(data[2][1]);
		System.out.println(data.length);
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				System.out.print(data[i][j]+"  ");
				
			}
			System.out.println();
		}
}
}