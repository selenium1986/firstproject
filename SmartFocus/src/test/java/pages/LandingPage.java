package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	private BrowserActions browser;
	private By country = By.cssSelector("a[class='antigua_storeview']");
	
	public LandingPage(WebDriver driver){
		this.driver = driver;
		 browser = new BrowserActions(driver);
		
	}
	public void navigateToPage(String url){
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	public HomePages clickCount(){
		driver.findElement(country).click();
		return new HomePages(driver);

}
}