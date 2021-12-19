package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA 
{
	@Test
	public void run()
	{
		WebDriver driver = new ChromeDriver();
		String homepage = "https://www.google.co.in";
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		Reporter.log("the page has been opened");
		driver.manage().window().maximize();
		driver.get(homepage);
		driver.findElement(By.name("q")).sendKeys("hi");
		Reporter.log("the data hi has been enteder" );
		
	}


}
