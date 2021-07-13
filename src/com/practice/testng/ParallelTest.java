package com.practice.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test (groups = {"SmokeTest"})
	 public void getFirefox(){
	                //System.setProperty("webdriver.gecko.driver", "geckodriver.exe path");
	 System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
	                System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.softwaretestingmaterial.com");
	 driver.close();
	 }
	 
	 @Test(groups = {"SmokeTest"})
	 public void getChorme(){
	                //System.setProperty("webdriver.chrome.driver", "chromedriver.exe path");
	 System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	                System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.softwaretestingmaterial.com");
	 driver.close();
	 }

}
