package appiumPractica3;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PruebaVivaAir {
	
	static AppiumDriver<MobileElement> driver;
	

	public static void main(String[] args) throws Exception {
	
			openCalculator();
		
		

	}
	public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Android SDK built for x86");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.vivaair.viva_web_view");
		cap.setCapability("appActivity", "com.vivaair.viva_web_view.MainActivity");
		
		URL url = new URL ("http://127.0.0.1:4723/wd/hub");
	
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("está sirviendo");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String path = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.view.View[4]/android.widget.EditText";
		MobileElement OrigenButton =	driver.findElement(By.xpath(path));
		OrigenButton.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		}
		String pathDeCiudades = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.view.View[";
		for ( int i = 3 ; i< 10 ; i++  )
		{
			System.out.println(driver.findElement(By.xpath(pathDeCiudades + i +"]")).getText());
			if ( driver.findElement(By.xpath(pathDeCiudades + i +"]")).getText() == "Cali" )
			{
				System.out.println("entró");
				driver.findElement(By.xpath(pathDeCiudades + i +"]")).click();
			}
		}
		System.out.println("se acabó");
	}

}