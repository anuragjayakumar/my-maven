package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_concept_Task {
	@Test
	private void spotify() {
		System.out.println("SPOTIFY");

	}
	@Test
	private void wynk() {
		System.out.println("WYNK");
	
	}@Ignore
	@Test
	private void reddit() {
		System.out.println("REDDIT");

	}
	@Test
	private void facebook() {
		System.out.println("FACEBOOK");

	}@Test(enabled = false)
	private void suriya_Notes() {
		System.out.println("SURIYA NOTES");

	}
	

}
