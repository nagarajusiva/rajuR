package com.pak.jenkines;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleProgrameDemo {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		driver= new HtmlUnitDriver();
		
		driver.get("http://www.google.co.in"); 
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	 public void verifyGooglePageText()
	 {
		Assert.assertTrue(driver.getTitle().contains("Google")); 
	 }
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
