package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class movingMouseTestingAndHover 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Actions builder = new Actions(driver);
		WebElement linkHome =driver.findElement(By.linkText("Home"));
		WebElement squareOfColor = driver.findElement(By.cssSelector("tr[class=\"mouseOut\""));
		org.openqa.selenium.interactions.Action mouseOverHome =  (org.openqa.selenium.interactions.Action) builder.moveToElement(linkHome).build();
		String bgColor = squareOfColor.getCssValue("background-color");
		System.out.println("Before hover color: " + bgColor);
		mouseOverHome.perform();
		bgColor = squareOfColor.getCssValue("background-color");
        System.out.println("After hover color: " + bgColor);
	}

}