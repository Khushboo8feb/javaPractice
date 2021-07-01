package com.practice.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenshot {
	public static WebDriver driver;
    public static String appURL = "https://www.naukri.com/";

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(appURL); // To open Naukri website with multiple windows
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Syntax to capture and save the screenshot.
		
		FileHandler.copy(screenshot, new File(".\\ScreenShots\\screenshot.png"));  //Syntax to store it in our local drive

	}

}
