package com.practice.selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UpcastingConcept {

	static RemoteWebDriver rd;
	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		//SearchContext sc = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		rd = new ChromeDriver();
		rd.get("https://google.com");
		
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");

		rd = new FirefoxDriver();
		rd.get("https://yahoo.com");
		

	}

}
