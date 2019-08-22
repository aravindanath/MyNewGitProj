package com.testng.programs;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2 extends LaunchBrowser {

	 

	@Test(priority = 1,description="This method is used for open url")
	public void openURL() {
		System.out.println("open url");
	}

	@Test(dependsOnMethods = "openURL")
	public void searchProduct() {
		System.out.println("search iphone");
	}

	@Test(dependsOnMethods = "searchProduct")
	public void verifyProduct() {
		System.out.println("Verify product");

		int age = 19;

		if (age < 18) {
			AssertJUnit.fail("Fail..");

		} else {
			System.out.println("Enjoy movie..");
		}
	}

	@Test(enabled=false)
	public void addcart() {

		System.out.println("Add to Cart");

		throw new SkipException("i am skipping this method");
	}


}
