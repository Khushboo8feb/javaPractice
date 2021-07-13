package com.practice.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestNGXML {
	
	@Test(groups = {"SmokeTest"})
	@Parameters("browser")
	public void getBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Run the scripts in Chrome browser");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("Run the script in FF browser");
			
		}
		else if(browser.equals("IE"))
		{
			System.out.println("Run the script in IE browser");
		}
		else
		{
			System.out.println("Incorrect browser or this Browser is not supported");
		}
	}

}
