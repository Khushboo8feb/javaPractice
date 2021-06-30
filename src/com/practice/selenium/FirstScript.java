package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstScript {

	public static WebDriver driver;
	public static void main(String[] args) 
	{
		
		String expTitle = "Software Testing Material – A site for Software Testers";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");

		driver = new ChromeDriver();
	//	driver = new InternetExplorerDriver();
		
		driver.get("https://www.softwaretestingmaterial.com");
		String actTitle = driver.getTitle(); 
		if(actTitle.equals(expTitle))
		{
			System.out.println("Expected and Actual page title are same");
			System.out.println(expTitle);
			System.out.println(actTitle);
		}
		else
		{
			System.out.println("Expected and Actual title are mismatched  "+actTitle);
		}
		

	}

}
