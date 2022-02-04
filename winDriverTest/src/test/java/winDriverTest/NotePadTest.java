package winDriverTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.windows.WindowsDriver;

import java.net.URL;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;
public class NotePadTest {
	
private static WindowsDriver notepadSession = null;


public static String getDate(){
 LocalDate date = LocalDate.now();
 return date.toString();
 }

@BeforeClass
 public static void setUp() {
 try {
 DesiredCapabilities capabilities = new DesiredCapabilities();
 String direccionApp = "C:\\\\Windows\\System32\\notepad.exe";
 System.out.println(direccionApp);
 capabilities.setCapability("app", direccionApp);
 capabilities.setCapability("platformName","Windows");
 capabilities.setCapability("deviceName", "WindowsPC");
 notepadSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
 notepadSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
} catch (Exception e) {
 e.printStackTrace();
  }
 }
@AfterMethod
 public void cleanApp(){
 notepadSession.quit();
 setUp();
 }

@AfterSuite
 public void tearDown(){
 notepadSession.quit();
 }
@Test
 public void checkAboutWindow() {
notepadSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 notepadSession.findElementByName("Ayuda").click();
 notepadSession.findElementByAccessibilityId("65").click();
 notepadSession.findElementByAccessibilityId("1").click();
 }
@Test
 public void sendTestText(){
 notepadSession.findElementByClassName("Edit").sendKeys(getDate());
 notepadSession.findElementByClassName("Edit").clear();
 }
@Test()
 public void pressTimeAndDateButton(){
 notepadSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 notepadSession.findElementByClassName("Edit").sendKeys("fsf");
 notepadSession.findElementByName("Edición").click();
 notepadSession.findElementByAccessibilityId("26").click();
Assert.assertNotNull(notepadSession.findElementByClassName("Edit"));
 notepadSession.findElementByClassName("Edit").clear();
  }
 }