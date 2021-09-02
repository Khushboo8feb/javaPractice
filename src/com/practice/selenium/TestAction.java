package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAction {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.co.in/");
	      driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
	      WebElement Element=driver.findElement(By.xpath("//input[@name='q']"));
	      Actions act=new Actions(driver);
	      act.moveToElement(Element).contextClick().build().perform();
	      Thread.sleep(5000);
	      act.sendKeys(Keys.DOWN,Keys.ENTER).build().perform();

	}

}
