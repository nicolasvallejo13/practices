package AutamitationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniunRubyBuyShop {

	  
	 WebDriver driver;
	 


	
	 
	 public SeleniunRubyBuyShop(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }
	 
	 public String getTitle ()
	 {
		 
		 return driver.getTitle();
	 }
	 
	
	 
	 
	 

}
