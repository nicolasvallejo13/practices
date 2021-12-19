package newproject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GettingAllLinksOfAPage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement link:allLinks)
		{
			System.out.println ( link.getText());
			System.out.println ( link.getAttribute("href"));
		}
		
		
	}
	

}
