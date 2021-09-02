package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolTipExample1 {
	static WebDriver driver;
	
	@BeforeMethod
	public void browserSetup()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 0, enabled = true)
	public void verifyToolTipText_Using_Title_Attribute()
	{
		driver.get("https://www.selenium.dev/");
		WebElement searchTextbox = driver.findElement(By.xpath("//input[@type = 'text']"));
		String toolTipText = searchTextbox.getAttribute("title");
		System.out.println("Tool Tip Text for search text box is  " +toolTipText);
	}
	
	@Test(priority = 1)
	public void verifyToolTipText_Using_Actions_class()
	{
		driver.get("https://jqueryui.com/tooltip/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"))));
		
		WebElement age = driver.findElement(By.xpath("//input[@id = 'age']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(age).perform();
		
		WebElement tooltipElement = driver.findElement(By.xpath("//div[@role = 'tooltip']"));
			
		System.out.println("The Tool Tip text is displayed on hover of age text box is  " +tooltipElement.getText());
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
