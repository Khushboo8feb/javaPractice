package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInterface {
	public static WebDriver driver;
    public static String alertURL = "http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(alertURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement alertBtn = driver.findElement(By.xpath("//p[text() = 'Click the button to display a confirm box.']/following-sibling:: button"));
		alertBtn.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept(); 
		
		Thread.sleep(2000);
		alertBtn.click();
		alert.dismiss();
		
		Thread.sleep(2000);

		alertBtn.click();
		System.out.println(alert.getText());

		
		

		
		
       
	}

}
