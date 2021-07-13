package com.practice.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups = {"SmokeTest"})
	public void test1()
	{
		System.out.println("Test 1");
		Assert.assertTrue(true);
	}

}
