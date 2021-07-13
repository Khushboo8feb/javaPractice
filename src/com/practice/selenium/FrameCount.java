package com.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FrameCount {
	
	WebDriver driver;
	@Test
	public void getIframeCount()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//frame"))));
		List<WebElement> iframeList = driver.findElements(By.xpath("//frame"));

		System.out.println("Total iFrames on page   " +iframeList.size());
	}

}
