package segurosBolivar;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestClass {
	WebDriver driver;
	@BeforeTest
	public void setup () 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	}
	@Test(dataProvider="SearchProvider",dataProviderClass=DataproviderClass.class)
	public void VerifyVivaAir(String origenCity,String destinoCity, String dia, String mes) throws InterruptedException
	{
			driver.get("https://www.vivaair.com/#/co/es");
			HomePageViva homePage = new HomePageViva(driver);
			homePage.setorigen(origenCity);
			homePage.setDestino(destinoCity);
			homePage.setFechaIda(dia, mes );
			homePage.setSoloIda();
			homePage.ClickBuscar();
			ReservarVueloPage reservarVuelo = new ReservarVueloPage(driver);
			reservarVuelo.SeleccionarSegundoVuelo();
	}
	@AfterTest
	public void Cerrar ()
	{
		driver.close();
	}
}
