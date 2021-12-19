import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class FirstTestNGFile 
{	
	
	WebDriver driver = new ChromeDriver();
	String homepage = "http://demo.guru99.com/test/newtours/register.php";
	  
	  @BeforeTest
	  public void beforeTest() 
	  {
		  	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver.manage().window().maximize();
			driver.get(homepage);
	  }
	  @Test (priority = 0)
	  public void CheckTitle() 
	  {
		  String Title = driver.getTitle();
		  String ExpectedTitle = "Register: Mercury Tours";
		  Assert.assertEquals(ExpectedTitle , Title );
		  
		  	
	  }
	  
	  @Test (priority = 1)
	  public void CheckIfColorChanges() 
	  {
		  	Actions builder = new Actions(driver);
			WebElement linkHome =driver.findElement(By.linkText("Home"));
			WebElement squareOfColor = driver.findElement(By.cssSelector("tr[class=\"mouseOut\""));
			org.openqa.selenium.interactions.Action mouseOverHome =  (org.openqa.selenium.interactions.Action) builder.moveToElement(linkHome).build();
			String bgColor1 = squareOfColor.getCssValue("background-color");
			System.out.println("Before hover color: " + bgColor1);
			mouseOverHome.perform();
			String bgColor = squareOfColor.getCssValue("background-color");
			System.out.println("After hover color: " + bgColor);
			Assert.assertTrue(bgColor != bgColor1);
	  }
	  @Test (priority = 2)
	  public void CheckSupportPage()
	  {
		  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]")).click();
		  String Title = driver.getTitle();
		  String ExpectedTitle = "Under Construction: Mercury Tours";
		  Assert.assertEquals(ExpectedTitle , Title );
		  
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  driver.close();
	  }

	}
