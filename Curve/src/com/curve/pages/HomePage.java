package com.curve.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	By join = By.xpath("html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/ul/li[3]/a/span");
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		
	}
	public void navigateToUrl(String url){
		driver.get(url);
		
	}
	public void clickJoinNow(){
		driver.findElement(join).click();
		
		
	}

}
