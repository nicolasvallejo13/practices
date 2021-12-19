package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebookTest1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement button1 = driver.findElement(By.id("persist_box"));
		for ( int i = 0 ; i< 2 ; i ++)
		{
			button1.click();
			System.out.print(button1.isSelected() + "\n");
		}
	}
}
