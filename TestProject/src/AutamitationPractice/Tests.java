package AutamitationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {
	
	HomePage homePage;
	ShopPage shopPage;
	WebDriver driver;
	
	@BeforeTest
	public void setup () 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.automationtesting.in/");
	}
	
	
	
	
	  @Test
	  public void VerifyThreeArrivalsOnly() 
	  {
		 // driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
		  homePage = new HomePage(driver);
		  homePage.ClickShop();
		  shopPage = new ShopPage(driver);
		  shopPage.ClickHome();
		  String x = "products";
		  boolean r = false;
		  int numberofArraivals =0;
		  List<WebElement> arraivals = driver.findElements(By.tagName("ul"));
		 System.out.println(arraivals.size()); 
		 for (int i= 0 ; arraivals.size() > i ; i ++)
		 {
			
			 System.out.println(arraivals.get(i).getAttribute("class")); 
			 if ((arraivals.get(i).getAttribute("class").equals(x) ))
					 {
				 numberofArraivals ++;
				 
				 
					 }
		 }
		 if (numberofArraivals == 3)
		 {
			 System.out.println("true");
			 r = true;
		 }
		 Assert.assertTrue(r);
		  
	  }
	  @Test
	  public void VerifyThreeArrivalsNavegate() 
	  {
		 // driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
		  homePage = new HomePage(driver);
		  homePage.ClickShop();
		  shopPage = new ShopPage(driver);
		  shopPage.ClickHome();
		  String x = "products";
		  boolean r = false;
		  int numberofArraivals =0;
		  List<WebElement> arraivals = driver.findElements(By.tagName("ul"));
		 System.out.println(arraivals.size()); 
		 for (int i= 0 ; arraivals.size() > i ; i ++)
		 {
			
			 System.out.println(arraivals.get(i).getAttribute("class")); 
			 if ((arraivals.get(i).getAttribute("class").equals(x) ))
					 {
				 numberofArraivals ++;
				 
				 
					 }
		 }
		 if (numberofArraivals == 3)
		 {
			 System.out.println("true");
			 r = true;
		 }
		 
		 homePage.ClickArraival1();
		 SeleniunRubyBuyShop seleiumRubyBuypage = new SeleniunRubyBuyShop(driver);
		 System.out.print(seleiumRubyBuypage.getTitle());
		 
		 
		 
		 
		 
		 Assert.assertTrue(r);
		  
	  }
}
