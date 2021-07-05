package com.practice.testng;

import org.testng.annotations.Test;

public class ModuleB {
	
	
	@Test
	public void moduleBTest1()
	{
		System.out.println("in Module B -----> Test 1 Method executed");
	}
	

	@Test  (enabled = false)                                       
	public void moduleBTest2()
	{
		System.out.println("in Module B -----> Test 2 Method executed");
	}
	
	@Test(groups = {"RegressionTest"})
	public void moduleBTest3()
	{
		System.out.println("in Module B -----> Test 3 Method executed");
	}

}
