package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challange1 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/world-population/");
		
		

	}

}
