package com.testng.features;

import org.testng.annotations.Test;

public class Group_demo {
	@Test(groups = "music")
	private void spotify() {
		System.out.println("spotify");
		

	}
	@Test(groups = "social media")
	private void instagram() {
		System.out.println("instagram");
	}
	@Test(groups = "music")
	private void gaana() {
		System.out.println("gaana");

	}
	@Test(groups = "music")
	private void wynk() {
		System.out.println("wynk");

	}
	@Test(groups = "social media")
	private void facebook() {
		System.out.println("facebook");

	}
	@Test(groups = "social media")
	private void youtube() {
		System.out.println("youtube");

	}
	@Test(groups = "editing app")
	private void inshot() {
		System.out.println("inshot");

	}
	@Test(groups = "editing app")
	private void alightmotion() {
		System.out.println("alightmotion");

	}
	

}
