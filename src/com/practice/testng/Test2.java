package com.practice.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups = {"SmokeTest"})
	public void test2()
	{
		System.out.println("Test 2");
		Assert.assertTrue(false);
	}

}
