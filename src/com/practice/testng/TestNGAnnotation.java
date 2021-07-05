package com.practice.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Executed BeforeSuite Method");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Executed AfterSuite Method");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Executed BeforeTest Method");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Executed afterTest Method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Executed BeforeClass Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Executed afterClass Method");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Executed BeforeMethod Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Executed afterMethod  Method");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("Executed Test Case 1 Method");
	}
	
	@Test(groups = {"RegressionTest", "SmokeTest"})
	public void testCase2()
	{
		System.out.println("Executed Test Case 2 Method");
	}
	
	@Test(groups = {"SmokeTest"})
	public void testCase3()
	{
		System.out.println("Executed Test Case 3 Method");
	}
	
	@BeforeGroups
	public void beforeGroup()
	{
		System.out.println("Executed BeforeGroups Method");

	}
	
	@AfterGroups
	public void afterGroup()
	{
		System.out.println("Executed AfterGroups Method");

	}

}
