package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class HomePage {
	private WebDriver driver;
	public LoginPage login;
	By country = By.cssSelector("a[class='antigua_storeview']");
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void navigateToHomePage(String url){
		driver.get(url);
		
	}
	public LoginPage clickCountry(){
		driver.findElement(country).click();
		String a = driver.getTitle();
		System.out.println(a);
		return login;
		
		 
		
		
		
	}
	
	}


