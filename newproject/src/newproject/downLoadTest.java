package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;


public class downLoadTest 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		WebElement downLoadImage = driver.findElement(By.id("messenger-download"));
		String sourceLink =  downLoadImage.getAttribute("href");
		String wget_command = "cmd /c wget -P c: " + sourceLink;
		try
		{
			Process exec = Runtime.getRuntime().exec(wget_command);
			int exitVal = exec.waitFor();
			System.out.println("exit value: " + exitVal);
			
		}catch(InterruptedException | IOException ex)
		{
			System.out.println(ex.toString());
		}
		
		
	}

}
