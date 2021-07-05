package com.practice.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

//Scenario: Skip TestNG Test, If a condition met else continue execution.
public class SkipTestCase {
	
	@Test
	public void askipTest()
	{
		String Condition = "Skip Test";
		
		if(Condition.equals("Skip Test"))
		{
			throw new SkipException("This method is not ready yet");

			
		}
		else
		{
			System.out.println("I am in else condition");
		}
		System.out.println("I am out of the if else condition");
		
		
	}
	
	@Test
	public void nonSkipTest()
	{
		System.out.println("No Need to skip this test case");
	}

}
