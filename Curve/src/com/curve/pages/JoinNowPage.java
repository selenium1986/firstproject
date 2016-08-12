package com.curve.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JoinNowPage {
	private WebDriver driver;
	By phoneNumber = By.id("field_38kar");
	
	public JoinNowPage(WebDriver driver){
		this.driver = driver;
		
	}
	public void enterPhoneNumber(String text){
		driver.findElement(phoneNumber).clear();
		driver.findElement(phoneNumber).sendKeys(text);
		System.out.println(text);
		
		
	}
	public String getValue(){
	 WebElement my = driver.findElement(phoneNumber);
	 String value = my.getAttribute("value");
	 System.out.println("my number :"+ value);
	 return value;
	 


	 
	 
		
		
	}

}
