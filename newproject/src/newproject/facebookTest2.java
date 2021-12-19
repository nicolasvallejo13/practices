package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebookTest2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		WebElement imageLink = driver.findElement(By.cssSelector("svg[class=\"eltiug27 a8c37x1j\"]"));
		imageLink.click();
		if (driver.getTitle().equals("Facebook - Inicia sesión o regístrate")) //in spanish bc that how appears here 
			{							
	            System.out.println("We are back at Facebook's homepage");					
			} else {			
				System.out.println("We are NOT in Facebook's homepage");					
			}		
		driver.close();		
	}
} 	
