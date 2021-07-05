package com.practice.testng;

import org.testng.annotations.Test;

public class TestNGException {
	
	@Test(groups = {"SmokeTest"}, expectedExceptions = ArithmeticException.class)
	public void testException()
	{
		System.out.println("Software Testing Material");
		int c = 1/0;
	}

}
