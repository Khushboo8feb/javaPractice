package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 //Implicit Wait - Here the specified Implicit Wait time frame is 15 seconds.
	      //It waits 15 seconds of time frame for the element to load. 
	      //It throws an exception, if the element is not loaded within the specified time frame
		//Implicitly wait is applied globally, which means it is always available for all the web elements throughout the driver instance.
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://softwaretestingo.blogspot.com/");
		driver.close();
		

	}

}
