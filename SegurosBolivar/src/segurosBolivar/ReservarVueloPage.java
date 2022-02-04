package segurosBolivar;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservarVueloPage {
	 WebDriver driver;
	 @FindBy(xpath="/html/body/app-root/div/app-booking/div/div[2]/app-flight-results/app-flight[2]/div[1]/div[2]")

	 WebElement segundoVuelo ;
	 
	 @FindBy(xpath="/html/body/app-root/div/app-booking/div/div[2]/app-flight-results/app-flight[2]/div[1]/div[1]/div[3]/h2[1]")
	 
	 WebElement destino;
	 
	 @FindBy(xpath="/html/body/app-root/div/app-booking/div/div[2]/app-flight-results/app-flight[2]/div[1]/div[1]/div[1]/h2[1]")
	 
	 WebElement origen;
	  public ReservarVueloPage (WebDriver driver){
		  	this.driver = driver;
		  	PageFactory.initElements(driver, this);
	  		}
	 
	  		public void SeleccionarSegundoVuelo ()
	  		{
	  			JavascriptExecutor executor = (JavascriptExecutor) driver;
	  			executor.executeScript("arguments[0].click();", segundoVuelo );		
	  			String g = "el vuelo de " + origen.getText() + " a  "  + destino.getText();
	  			executor.executeScript("window.confirm(\"Usted ha seleccionado" + g + "\");");
	  			driver.switchTo().alert().accept();
	  		}
}
