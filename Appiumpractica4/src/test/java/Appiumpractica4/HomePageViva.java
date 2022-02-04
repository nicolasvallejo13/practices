package Appiumpractica4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageViva {
	WebDriver driver;
	
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.view.View[3]")
	 
	 WebElement soloIdaButton;
	
	 
	 
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.view.View[4]")

	 WebElement origen ;
	 
	 public HomePageViva (WebDriver driver){
		 	this.driver = driver;
	        PageFactory.initElements(driver, this);
	        }
	 public void setSoloIda ()
	 {
		 soloIdaButton.click();
		 
	 }
	 public void clickOriegn ()
	 {
		 origen.click();
		 
		 
	 }
	

}
