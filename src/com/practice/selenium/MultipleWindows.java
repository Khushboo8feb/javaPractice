package com.practice.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	public static WebDriver driver;
    public static String appURL = "https://www.naukri.com/";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(appURL); // To open Naukri website with multiple windows
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		String mainWindow = driver.getWindowHandle(); // It will return the parent window name as a String
		
		
		Set<String> allOpenWindow = driver.getWindowHandles(); 	// It returns no. of windows opened by WebDriver and will return Set of Strings
		int totalWindow = allOpenWindow.size();
		System.out.println("Total opened windows by webdriver =   "+totalWindow);
		
		Iterator<String> iterator = allOpenWindow.iterator(); 	// Using Iterator to iterate with in windows
		while(iterator.hasNext())
		{
			String childWindow = iterator.next();
			
			if(!mainWindow.equals(childWindow))  // Compare whether the main windows is not equal to child window. If not equal, we will close.
			{
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(mainWindow); 	// This is to switch to the main window
		System.out.println(driver.switchTo().window(mainWindow).getTitle());
	}

}
