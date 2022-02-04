package newproject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetAllTheValuesOfTable 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/table.html");
		WebElement table = driver.findElement(By.xpath("//html/body/table"));
		List < WebElement > rows_table = table.findElements(By.tagName("tr"));
		int rows_count = rows_table.size();
		System.out.println("number of rows " + rows_count);
		for (int row = 0; row < rows_count; row++) {
    	    List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
    	    int columns_count = Columns_row.size();
    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
    	   
    	    for (int column = 0; column < columns_count; column++) {
    	        String celtext = Columns_row.get(column).getText();
    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
    	    }
    	    System.out.println("-------------------------------------------------- ");
    	}
	 }

}
