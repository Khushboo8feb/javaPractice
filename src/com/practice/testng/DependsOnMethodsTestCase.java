package com.practice.testng;

import org.testng.annotations.Test;

public class DependsOnMethodsTestCase {
	
	@Test (dependsOnMethods = "testCase2")
	public void testCase1()
	{
		System.out.println("Executed Test Case 1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Executed Test Case 2");
	}


}
