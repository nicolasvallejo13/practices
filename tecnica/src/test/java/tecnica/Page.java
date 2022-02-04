package tecnica;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
	 WebDriver driver;
 
	 @FindBy(xpath="----")
	 
	 WebElement Button;
	 
	 
	 
	 public Page (WebDriver driver){
		 	this.driver = driver;
	        PageFactory.initElements(driver, this);
	        }
}
