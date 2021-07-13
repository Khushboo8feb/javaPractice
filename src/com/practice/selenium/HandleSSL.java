package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HandleSSL {
	
	WebDriver driver = null;
	

	@Test
	public void handleSSLOnChrome() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// Before Selenium 4, We used to handle SSL certificate errors in Firefox using
		// FirefoxOptions or FirefoxProfile or DesiredCapabilities. Now these are
		// deprecated for Selenium 4

		/*
		 * DesiredCapabilities capability = new DesiredCapabilities();
		 * capability.setAcceptInsecureCerts(true); WebDriver driver = new
		 * ChromeDriver(capability);
		 */

		// In place of DesiredCapabilities, we are using ChromeOptions class to handle
		// SSL Certificate
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(option);

		driver.get("https://expired.badssl.com/");
		System.out.println("Page Title of Page  " + driver.getTitle());
		driver.close();

	}
	
	@Test
	public void handleSSLOnFirefox() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");

		// Before Selenium 4, We used to handle SSL certificate errors in Firefox using
		// FirefoxOptions or FirefoxProfile or DesiredCapabilities. Now these are
		// deprecated for Selenium 4
		
		
       /*the SSL certificate is auto handled for Firefox. Unlike the error we face in Chrome and other browsers, we need not write the 
        * additional code lines to accept the untrusted SSL certificates in Firefox. 
        */
		//FirefoxOptions option = new FirefoxOptions();
		//option.setAcceptInsecureCerts(true);
		//driver = new FirefoxDriver(option);
		
		driver = new FirefoxDriver();

		driver.get("https://expired.badssl.com/");
		System.out.println("Page Title of Page  " + driver.getTitle());
		driver.close();

	}
	

}
