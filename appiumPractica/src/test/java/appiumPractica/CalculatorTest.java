package appiumPractica;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	
	static AppiumDriver<MobileElement> driver;
	

	public static void main(String[] args) {
		try {
			openCalculator();
		}catch (Exception e) {
			System.out.print(e.getCause());
			System.out.print(e.getMessage());
			e.printStackTrace();
		}
		

	}
	public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Android SDK built for x86");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL ("http://127.0.0.1:4723/wd/hub");
	
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("está sirviendo");		
		
		MobileElement dos = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
		MobileElement cinco = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
		MobileElement mas = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		MobileElement igual = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		
		
		dos.click();
		mas.click();
		cinco.click();
		igual.click();
		//Assert.assertEquals(driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText(), "7");
		System.out.print(driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText());
		
		
	}

}