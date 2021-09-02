package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadFiles_FirefoxProfile {
	

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		FirefoxOptions fo = new FirefoxOptions();
		//Set location to store files after downloading
		fo.setCapability("browser.download.dir", ".\\DownloadedFiles");
		fo.setCapability("browser.download.folderList", 2);
		
		//set preference to not show file download confirmation dialouge using MIME types of 
		//different file extension types
		
		fo.setCapability("browser.helperApps.neverAsk.saveToDisk", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;");
		fo.setCapability("browser.download.manager.showWhenStarting", false);
		fo.setCapability("pdfjs.disabled", true);
		
		//Pass fo Parameter in WebDriver to use preference to download file
		
		FirefoxDriver ff = new FirefoxDriver(fo);
		// Open APP to download application
		ff.get("http://toolsqa.com/automation-practice-form/");
	      // Click to download
		ff.findElement(By.linkText("Test File to Download")).click();
	      //Halting the execution for 5 secs to donwload the file completely
	      Thread.sleep(5000);
	      ff.close();
		
		

	}

}
