package com.testng.programs;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class TC3  extends LaunchBrowser{

	

	@Test(priority=1)
	public void openURL() {
		System.out.println("open url");
	}
	
	@Test(priority=2)
	public void searchProduct() {
		System.out.println("search iphone");
	}
	
	@Test(priority=3)
	public void verifyProduct() {
		System.out.println("Verify product");
	}

	@Test
	public void addcart() {
		System.out.println("Add to Cart");
	}
	
	
 
}
