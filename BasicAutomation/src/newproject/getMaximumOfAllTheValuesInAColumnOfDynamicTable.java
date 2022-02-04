package newproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMaximumOfAllTheValuesInAColumnOfDynamicTable 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List  col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("Total No of columns are : " +col.size());
        //No.of rows
        List  rows = driver.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("Total No of rows are : " + rows.size());	
        double maxValueYet = 0 ;
        for (int i =1;i<rows.size();i++)
        {
        	String numberToCompareString = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
        	System.out.println(numberToCompareString );
        	double numberToCompare = Double.parseDouble(numberToCompareString);
        	if (numberToCompare > maxValueYet )
        	{
        		maxValueYet = numberToCompare;
        	}
        }
        System.out.println( "the biggest value is:  " + maxValueYet);
    }
}
