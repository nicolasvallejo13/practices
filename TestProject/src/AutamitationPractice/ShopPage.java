package AutamitationPractice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class ShopPage {
  
	 WebDriver driver;
	 
	 @FindBy(xpath="/html/body/div[1]/div[2]/div/div/nav/a")

	 WebElement HomeButton;
	 
	 public ShopPage(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }
	 public void ClickHome()
	 {
		 HomeButton.click();
	 }
	 
	 
	 
	
}
