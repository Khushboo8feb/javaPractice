package com.practice.selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotFailedTestCases {
	
	public static WebDriver driver;
    public static String appURL = "https://www.softwaretestingmaterial.com";

    @BeforeTest
	public void setUp() 
    {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
    }
    
    @Test
    public void appTest()
    {
    	 driver.get(appURL);
		//driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile"); //Statement with correct Xpath
		 driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); //Statement with incorrect Xpath	
		 

	}
    
    @AfterMethod  //AfterMethod annotation - This method executes after every test execution
    public void screenShot(ITestResult result)
    {
    	int failstatus = ITestResult.FAILURE; 	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
    	int status = result.getStatus();
    	if(failstatus == status )
    	{
    		try
    		{
    			TakesScreenshot screenshot = (TakesScreenshot)driver; 				// To create reference of TakesScreenshot
    			File src = screenshot.getScreenshotAs(OutputType.FILE); 				// Call method to capture screenshot
    			
    			
				// Copy files to specific location 
				// result.getName() will return name of test case so that screenshot name will be same as test case name
    			FileHandler.copy(src, new File(".\\ScreenShots\\"+result.getName()+".png")); 
  			
    			System.out.println("Successfully captured the Screenshot for failed case");
    			
    			
    		}
    		catch(Exception e)
    		{
    			System.out.println("Exception while taking screenshot = "+e.getMessage());
    		}
    	}
    }

}
