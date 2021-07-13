package com.practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@DataProvider(name = "getData")
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0] = "FirstUserID";
		data[0][1] = "FirstPassword";
		
		data[1][0] = "SecondUserID";
		data[1][1] = "SecondPassword";
		
		return data;
	}
	
	
	@Test(dataProvider  = "getData")
	public void loginTest(String uname, String paswd)
	{
		System.out.println("Username is  " +uname);
		System.out.println("Password is  " +paswd);
	}

}
