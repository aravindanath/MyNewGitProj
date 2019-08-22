package com.testng.programs;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class TC002  extends LaunchBrowser{

	

	@Test 
	public void openURL() {
		System.out.println("open url");
	}
	
	@Test 
	public void searchProduct() {
		System.out.println("search iphone");
	}
	
	@Test 
	public void verifyProduct() {
		System.out.println("Verify product");
	}

	@Test
	public void addcart() {
		System.out.println("Add to Cart");
	}
	
	
 
}
