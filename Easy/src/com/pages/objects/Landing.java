package com.pages.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pages.SetUp;

public class Landing extends SetUp{
	
	protected WebDriver driver;
	private By country = By.cssSelector("a[class = 'antigua_storeview']");
	
	public Landing(WebDriver driver){
		this.driver = driver;
	}
	
	public void link(){
		try{
			driver.findElement(country).click();
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
