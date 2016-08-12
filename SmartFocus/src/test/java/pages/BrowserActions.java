package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserActions {
	public WebDriver driver;
	
	public BrowserActions(WebDriver driver){
		this.driver = driver;
		
	}
	public void clickElement(By locator){
		driver.findElement(locator).click();
	}
	
	public void inputField(By locator, String text){
		driver.findElement(locator).sendKeys(text);
		
	}
	
	public String getText(By locator, String compare){
		String text = driver.findElement(locator).getText();
		text.contains(compare);
		return text;
	}
	
	public boolean isElementPresent(By locator){
		try{
		 driver.findElement(locator);
		}catch (Exception e){
			return false;
		}
		return true;
	  
      
}
}