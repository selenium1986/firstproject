import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	protected static WebDriver driver;
	protected FirstPage first;
	protected SecondPage second;
	protected HomePage page;
	protected static String baseurl;
	
	
	@BeforeClass
	public static void setUp(){
		driver = new FirefoxDriver();
		baseurl = "http://www.shopcourts.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public static void tearDown(){
		driver.quit();
		
	}

}
