package com.practice.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTestNG.class)
public class ListenerTestNGTestCase {
	WebDriver driver;
	
	@BeforeClass
	public void appSetUp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/100-software-testing-interview-questions/");
	
	}
	
	@Test(priority = 0)
	public void testToPass()
	{
		System.out.println("This method to Pass Test");
		System.out.println("Page Title is  " +driver.getTitle());
	}
	
	@Test (priority = 1)
	public void testToSkip()
	{
		System.out.println("This method to Skip Test");
		throw new SkipException("This method is not ready");
	}
	
	
	@Test (priority = 2)
	public void testToFail()
	{
		String actualTitle = driver.getTitle();
		String expTitle = "Software";
		Assert.assertEquals(actualTitle, expTitle);
	     System.out.println("This method to test fail"); 
	}
	
	@AfterClass
	public void apptearDown()
	{
		driver.quit();
	}

}
