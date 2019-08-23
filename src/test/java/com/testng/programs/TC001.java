package com.testng.programs;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC001 extends LaunchBrowser {

	@BeforeMethod
	public void bMethod() {
		System.out.println("===== B method =====");
	}
	
	@AfterMethod
	public void AMethod() {
		System.out.println("===== A method =====");
	}


	@Test 
	public void openURL() {
		driver.get("https://www.flipkart.com");
		System.out.println("open url");
	}
	
	@Test(dependsOnMethods = "openURL")
	public void searchProduct() {
		System.out.println("search iphone");
		//Assert.fail();
	}

	@Test(alwaysRun=true,dependsOnMethods = "searchProduct")
	public void verifyProduct() {
		System.out.println("Verify product");

		int age = 2;

		if (age < 18) {
			AssertJUnit.fail("Fail..");

		} else {
			System.out.println("Enjoy movie..");
		}
	}

	@Test 
	public void addcart() {

		System.out.println("Add to Cart");

		throw new SkipException("i am skipping this method");
	}


}
