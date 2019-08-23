package com.testng.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 

public class LaunchBrowser {
	
	protected WebDriver driver;
	
	@BeforeSuite
	public void bSuite() {
		System.out.println("======== Before suite ======== ");
	}
	
	@BeforeClass
	public void openBrowser() {
		/*
		 * e:\\jar\\chromedriver.exe  --> Windows
		 */
		String path = "/Users/aravindanathdm/Documents/Aravinda/chromedriver";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		
		
		System.err.println("open browser");
	}
	

	@AfterClass // ctrl + shif + o --> import pkg
	public void closeBrowser() {
		
		driver.quit();
		System.err.println("close browser");
	}
	@AfterSuite
	public void aSuite() {
		System.out.println("======== After suite ======== ");
	}
}
