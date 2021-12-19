package newproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

public class PG2 {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		 //  String baseUrl = "http://www.facebook.com";
	      
	      //String mensaje ;
	        
	        driver.get("http://demo.guru99.com/test/radio.html");
	        
	       WebElement boton1 = driver.findElement(By.id("vfb-7-2"));
	       boton1.click(); 
	       // WebElement email = driver.findElement(By.id("email"));
	        
	       // WebElement password = driver.findElement(By.name("passwd"));
	        
	       // email.sendKeys("abc@gmail.com");
	       // password.sendKeys("oanfeouin");
	      //  password.submit();
	        
	      //  password.clear();
	        
	       // WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
	        //loginButton.click();
	        
	        
	        
	        
	        
	      //  driver.switchTo().frame("classFrame");
	   //  driver.findElement(By.id("no")).click();
	     //mensaje = driver.switchTo().alert().getText();
	    // driver.switchTo().alert().accept();
	      //  List<WebElement> elements = driver.findElements(By.name("name"));
	       // System.out.println("Number of elements:" +elements.size());

	      //  for (int i=0; i<elements.size();i++){
	       //   System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	      //  }
	    // System.out.print(mensaje);
	      //  driver.close();  // using QUIT all windows will close
	       // System.exit(0);
       
    }

}