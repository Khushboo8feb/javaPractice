package com.practice.testng;

import org.testng.annotations.Test;

public class DependsOnGroupsTestCase {

	@Test (groups = {"RegressionTest"})
	public void testCase1()
	{
		System.out.println("Executed Test Case 1");
	}
	
	@Test(groups = {"SmokeTest"})
	public void testCase2()
	{
		System.out.println("Executed Test Case 2");
	}
}
