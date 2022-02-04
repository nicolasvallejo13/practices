package tecnica;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {private WebDriver driver;	

@Test 
public void Test ( ) 
		
{
		driver.get("https://www.vivaair.com/#/co/es");
		
}


@AfterTest
public void Cerrar ()
{
	driver.close();
}

@BeforeTest
public void beforeTest() {	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	} 
		

}
