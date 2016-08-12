package com.drag;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobile {
	
	public AppiumDriver driver;
	@BeforeTest
	public void setUp() throws MalformedURLException{
		//DesiredCapabilities capa = new DesiredCapabilities();
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Android");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	    driver = new AndroidDriver(url, desiredCapabilities);
	}
	    @Test
	    public void run(){
		// Navigate to the page and interact with the elements on the guinea-pig page using id.
		driver.get("http://google.com");
		WebElement div = driver.findElement(By.id("i_am_an_id"));
		Assert.assertEquals("I am a div", div.getText()); //check the text retrieved matches expected value
		driver.findElement(By.id("comments")).sendKeys("My comment"); //populate the comments field by id.
	    }
	    @AfterTest
	    public void close(){
		//close the app.
		driver.quit();
		
		
		
		
		
	}

}
