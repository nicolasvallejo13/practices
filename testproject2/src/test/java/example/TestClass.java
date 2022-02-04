package example;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class TestClass {
	WebDriver driver;
	@BeforeTest
	public void setup () 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	}
	@Test (dataProvider="citiesprovider",dataProviderClass=DataProviderClass.class)
	public void VivaAirTest(String origenCity,String destinoCity, String dia, String mes) throws InterruptedException
	{		System.out.print("sdfsdf");
			driver.get("https://www.vivaair.com/#/co/es");
			
			MainPage homePage = new MainPage(driver);
			homePage.setorigen(origenCity);
			homePage.setDestino(destinoCity);
			homePage.setFechaIda(dia, mes );
			homePage.setSoloIda();
			homePage.ClickBuscar();
			ReservarVueloPage reservarVuelo = new ReservarVueloPage(driver);
			reservarVuelo.SeleccionarSegundoVuelo();
	}
	@Test				
	public void test() {	
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();		
		System.out.print("obsaiudfb!");
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}	
	@AfterTest
	public void Cerrar ()
	{
		driver.close();
	}
}
