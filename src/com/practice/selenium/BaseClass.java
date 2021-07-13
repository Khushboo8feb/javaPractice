package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeClass
	public void launchApp(String browser, String URL)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URL);
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URL);

		}
		
	}
}
