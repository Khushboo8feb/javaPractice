package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServerError {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();

	}

}
