package AutamitationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class HomePage {
  
	 WebDriver driver;
	 
	 @FindBy(xpath="/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a")
	 WebElement shopButton ;
	 
	 @FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/ul/li/a[1]/img")
	 WebElement ImageOfArraival1 ;
	 
	 @FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/ul/li/a[1]/img")
	 WebElement ImageOfArraival2 ;
	 
	 @FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div/div/ul/li/a[1]/img")
	 WebElement ImageOfArraival3 ;
	 
	 

	// WebElement shopButton = driver.findElement(By.xpath("//*[@id=\\\"menu-item-40\\\"]/a\""));
	 
	 public HomePage(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }
	 public void ClickShop()
	 {
		 shopButton.click();
	 }
	 
	 public void ClickArraival1 ()
	 {
		 ImageOfArraival1.click();
	 }
	 public void ClickArraival2 ()
	 {
		 ImageOfArraival2.click();
	 }
	 public void ClickArraival3 ()
	 {
		 ImageOfArraival3.click();
	 }
}
