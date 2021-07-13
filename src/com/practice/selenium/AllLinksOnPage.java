package com.practice.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AllLinksOnPage{
	public static WebDriver driver = null;
	@Test(priority = 0)
	public void fetchAllLinks() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchTextBox = driver.findElement(By.xpath("//input[@name ='q']"));
		searchTextBox.sendKeys("Automation Testing");
		WebElement searchButton = driver.findElement(By.xpath("//input[@name ='btnK']"));
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		
		//WebElement searchButton = driver.findElement(By.xpath("//input[@name ='btnK']"));
		searchButton.click();
		
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.ENTER).perform();

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total links are available on page are  " +linkList.size());
		
		//Traversing each link using for each loop
		for(WebElement list: linkList)
		{
			System.out.println(list.getText()+"  and URL is   "+list.getAttribute("href"));
		}
		 driver.quit();

	}
	@Test(priority = 1)
	public void fetchlinksGmailLoginPage()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true");
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total links are available on page are  " +linkList.size());
		
		//Traversing each link using for loop
		for(int i=0; i<=linkList.size()-1;i++)
		{
			 WebElement linkElement = linkList.get(i);
			 String linkText = linkElement.getText();
			System.out.println(linkText+"     "+linkElement.getAttribute("href"));

		}
		 driver.quit();

	}
	
	@Test(priority = 2)
	public void fetchAlllinksDemoQAPage()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total links available on page   " +linkList.size());
		
		//Iterating the list using Iterator and checking the element in the list
		
		 Iterator<WebElement> itr = linkList.iterator();
		 while(itr.hasNext())
		 {
			WebElement link = itr.next();
			String linkText = link.getText();
			System.out.println(linkText +"       "+link.getAttribute("href"));
			 
		 }
		
		 driver.quit();

	}

}
