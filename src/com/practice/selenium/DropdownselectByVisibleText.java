package com.practice.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownselectByVisibleText {

	public static WebDriver driver;
	public static String appURL = "https://www.softwaretestingmaterial.com/sample-webpage-to-automate/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement dd = driver.findElement(By.xpath("//select[@name = 'dropdown']"));

		Select se = new Select(dd);
		se.selectByVisibleText("Automation Testing");

		Thread.sleep(2000);

		System.out.println(se.getFirstSelectedOption().getText());

		List<WebElement> allOtions = se.getOptions();

		for (WebElement option : allOtions) {
			System.out.println(option.getText());
		}

		// driver.close();

	}

}
