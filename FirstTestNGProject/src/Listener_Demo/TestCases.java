package Listener_Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_Demo.ListenerTest.class)
public class TestCases 
{
	WebDriver driver = new ChromeDriver();
	String homepage = "http://demo.guru99.com/V4/";
	
	@BeforeTest
	  public void beforeTest() 
	  {
		  	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver.manage().window().maximize();
			driver.get(homepage);
	  }
	  @Test (priority = 0)
	  public void LogIn() 
	  {
		  
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr373026");
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("rapepUv");
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	  }
	  public void TestToFail()				
	  {		
	      System.out.println("This method to test fail");					
	      Assert.assertTrue(false);			
	  }
	
  
}
