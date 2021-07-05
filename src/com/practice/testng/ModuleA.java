package com.practice.testng;

import org.testng.annotations.Test;

public class ModuleA {
	
	@Test(groups = {"SmokeTest"})
	public void moduleATest1()
	{
		System.out.println("in Module A -----> Test 1 Method executed");
	}
	
	//I would like to ignore this test from the test execution, use enabled = fales in @Test annotation
	@Test  (enabled = false)                                       
	public void moduleATest2()
	{
		System.out.println("in Module A -----> Test 2 Method executed");
	}
	
	@Test(groups = {"SanityTest", "SmokeTest"})
	public void moduleATest3()
	{
		System.out.println("in Module A -----> Test 3 Method executed");
	}

}
