package com.test;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DragAndDropPractice {
	
	@Test
	public void DragAndDrop (){
		WebDriver driver = new ChromeDriver();
		String homepage = "http://demo.guru99.com/test/drag_drop.html";
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		Reporter.log("the page has been opened");
		driver.manage().window().maximize();
		driver.get(homepage);
		WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
		Actions act=new Actions(driver);	
		act.dragAndDrop(From, To).build().perform();
		
	}

}
