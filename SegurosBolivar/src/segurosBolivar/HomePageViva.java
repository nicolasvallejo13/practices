package segurosBolivar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageViva {
	  
	
		 WebDriver driver;
		 
		 @FindBy(xpath="/html/body/app-root/div/app-home/div/div/div/app-ibe/div/div/div[2]/div[1]/app-station[1]/div/input")

		 WebElement origen ;
		 
		 @FindBy(xpath="/html/body/app-root/div/app-home/div/div/div/app-ibe/div/div/div[2]/div[1]/app-station[2]/div/input")

		 WebElement destino ;
		 
		 @FindBy(xpath="/html/body/app-root/div/app-home/div/div/div/app-ibe/div/div/div[2]/lib-date-picker/div/div[1]/div/div[2]/input")

		 WebElement fechaIda ;
		 
		 @FindBy(xpath="/html/body/app-root/div/app-home/div/div/div/app-ibe/div/div/div[2]/lib-date-picker/div/div[2]/div/div[2]/input")

		 WebElement fecharegreso ;
		 
		 @FindBy(xpath="/html/body/app-root/div/app-home/div/div/div/app-ibe/div/div/div[2]/button/span")
		 
		 WebElement buscarButton ;
		 
		 @FindBy(xpath="/html/body/app-root/div/app-home/div/div/div/app-ibe/div/div/div[1]/app-custom-checkbox/div/span[2]")
		 
		 WebElement soloIdaButton;
		 
		 
		 
		 public HomePageViva (WebDriver driver){
			 	this.driver = driver;
		        PageFactory.initElements(driver, this);
		        }
		 public void ClickBuscar()
		 {
			  buscarButton.click();
		 }
		 
		 public void setDestino(String destinoDeseado){
			 	String h = "-" ;
			 	 destino.click();  
			 	for (int i = 2 ; i < 20 ; i++)
			 	{
			 			h = "/html/body/app-root/div[2]/app-home/div/div/div/app-ibe/div/div/div[2]/div[1]/app-station[2]/div[2]/div[2]/div[1]/span["+ i +"]/div";
			 			if (destinoDeseado.equalsIgnoreCase(driver.findElement(By.xpath(h)).getText()))
		 				{
		 					WebElement ElementToClick = driver.findElement(By.xpath(h));
		 					JavascriptExecutor executor = (JavascriptExecutor) driver;
		 				    executor.executeScript("arguments[0].click();", ElementToClick );
		 					break;
		 				}
			 	}
		}
		 
		 public void setorigen(String origenDeseado){
			 	String h = "-" ;
			 	origen.click();  
			 	for (int i = 2 ; i < 20 ; i++)
			 	{
			 		h = "/html/body/app-root/div/app-home/div/div/div/app-ibe/div/div/div[2]/div[1]/app-station[1]/div[2]/div[2]/div[1]/span["+ i + "]/div[1]";
			 		if (origenDeseado.equalsIgnoreCase(driver.findElement(By.xpath(h)).getText()))
			 		{
			 			WebElement ElementToClick = driver.findElement(By.xpath(h));
	 					JavascriptExecutor executor = (JavascriptExecutor) driver;
	 				    executor.executeScript("arguments[0].click();", ElementToClick );
			 			break;
			 		}
			 	}
		}
		 public void setFechaIda(String dia, String mes){
		
			 String xpatDiaDeseado = "/html/body/app-root/div[2]/app-home/div/div/div/app-ibe/div/div/div[2]/lib-date-picker/div[2]/lib-date-picker-calendar/div/div[2]/div[2]/div[3]/div["+ dia +"]";
			 WebElement diaDeseado = driver.findElement(By.xpath(xpatDiaDeseado));
			 JavascriptExecutor executor = (JavascriptExecutor) driver;
			 executor.executeScript("arguments[0].click();", diaDeseado );		    
			 }
		
		 public void setSoloIda ()
		 {
			 soloIdaButton.click();
			 
		 }
}
