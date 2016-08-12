package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepDefinition.Home;

public class HomePage {
	public WebDriver driver;
	public Home home;
	By country = By.cssSelector("a[class='antigua_storeview']");
	By login_link = By.cssSelector("a[class='link-signin']");
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	public void navigateToUrl(String url){
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void clickCountry(){
		driver.findElement(country).click();
		
		
	}
	public LoginPage login(){
		driver.findElement(login_link).click();
		return new LoginPage(driver);
	}

}
