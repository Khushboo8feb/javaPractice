package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {
	static WebDriver driver;
	static String baseURL ="https://the-internet.herokuapp.com/basic_auth";
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String uname = "admin";
		String password = "admin";
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.get("http://"+uname+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
	}

}
