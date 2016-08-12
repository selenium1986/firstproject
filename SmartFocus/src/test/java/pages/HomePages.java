package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePages {

	private WebDriver driver;
	//private BrowserActions browser = new BrowserActions(driver);
	private BrowserActions browser;
	private By signIn = By.cssSelector("a[class='link-signin']");
	
	public HomePages(WebDriver driver){
		this.driver = driver;
		 browser = new BrowserActions(driver);
	}
	
	public LoginPages clickSignIn(){
		driver.findElement(signIn).click();
		return new LoginPages(driver);
		
	}
}
