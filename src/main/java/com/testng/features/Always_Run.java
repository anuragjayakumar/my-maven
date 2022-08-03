package com.testng.features;

import org.testng.annotations.Test;

public class Always_Run {
	@Test(alwaysRun = true,enabled = true)
	private void Zebronics() {
		System.out.println("Zedronics");

	}

}
