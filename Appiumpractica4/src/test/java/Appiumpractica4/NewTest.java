package Appiumpractica4;


import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NewTest {
	static AppiumDriver<MobileElement> driver;
  @Test
  public void f() {
	  HomePageViva paginaPrincipal = new HomePageViva(driver);
	  paginaPrincipal.setSoloIda();
	  paginaPrincipal.clickOriegn();
  }
  
  @AfterTest
	public void Cerrar ()
	{
		//driver.close();
	}
	
	@BeforeTest
	public void beforeTest()  {	
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "Android SDK built for x86");
			cap.setCapability("udid", "emulator-5554");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "10");
			cap.setCapability("appPackage", "com.vivaair.viva_web_view");
			cap.setCapability("appActivity", "com.vivaair.viva_web_view.MainActivity");
			
			URL url = new URL ("http://127.0.0.1:4723/wd/hub");
		
			driver = new AppiumDriver<MobileElement>(url, cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("está sirviendo");
		}catch (Exception e) {
			System.out.print(e.getCause());
			System.out.print(e.getMessage());
			e.printStackTrace();
		}
	
	} 
}
