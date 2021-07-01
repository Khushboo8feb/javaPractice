package com.practice.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectList {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement multiselectList = driver.findElement(By.xpath("//select[@multiple = 'multiple']"));

		Select se = new Select(multiselectList);
		se.selectByVisibleText("Manual Testing");
		se.selectByIndex(2);
		se.selectByValue("msselenium");

		Thread.sleep(2000);

		se.deselectByVisibleText("Manual Testing");
		
		System.out.println("Get all the selected option List---------------");
		List<WebElement> allselectedOptions = se.getAllSelectedOptions();
		for(WebElement option: allselectedOptions)
		{
			System.out.println("All the selected options are  "+option.getText());
		}
		
		System.out.println("Find tha First selected option ---------------");

		WebElement selectedOption = se.getFirstSelectedOption();
		System.out.println(selectedOption.getText());
		
		System.out.println("Get all the Available options in MultiSelect Dropdown---------------");
		
		 List<WebElement> allOptions = se.getOptions();
		 
		 for(WebElement option: allOptions )
		 {
			 System.out.println("Available all options in multi select list  " +option.getText());
		 }

	}

}
