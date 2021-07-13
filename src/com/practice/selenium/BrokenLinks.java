package com.practice.selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	WebDriver driver;
	
	@Test
	public void findAllBrokenLinksOnPage()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/broken");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total links available on page   " +linkList.size());
		
		Iterator<WebElement> itr = linkList.iterator();
		while(itr.hasNext())
		{
			WebElement LinkElement = itr.next();
			String url = LinkElement.getAttribute("href");
			//System.out.println(url);
			if(url ==null || url.isEmpty())
			{
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			/*
			if(!url.startsWith("https://demoqa.com/"))
			{
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}
			*/ 
			
			try {
				URL Linkurl = new URL(url);
	            //Now we will be creating url connection and getting the response code

	            HttpURLConnection httpURLConnect=(HttpURLConnection)Linkurl.openConnection();
	            httpURLConnect.setRequestMethod("HEAD");
	            httpURLConnect.connect();
	           int respCode = httpURLConnect.getResponseCode();
	           if(respCode>=400)
	           {
                   System.out.println(Linkurl+" is a broken link");
                   System.out.println();
               	System.out.println(Linkurl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");


	           }
	           else
	           {
                   System.out.println(url+" is a valid link");
                   System.out.println(Linkurl+" - "+httpURLConnect.getResponseMessage());
           

	           }
	            
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		driver.quit();
	}
	
	
	
	

}
