package com.testng.programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LaunchBrowser {
	
	
	@BeforeClass
	public void openBrowser() {
		System.err.println("open browser");
	}
	

	@AfterClass // ctrl + shif + o --> import pkg
	public void closeBrowser() {
		System.err.println("close browser");
	}

}
