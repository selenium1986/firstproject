package com.drag;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class Dragging {
	 AndroidDriver driver;
	 
		@BeforeTest
		public void setup_inital() throws MalformedURLException{	
			
			//File f = new File(System.getProperty("user.dir"));
			//File appdir = new File(f,"/Apps");
			//File app = new File(appdir, "com.mobeta.android.demodslv-0.5.0-3_APKdot.com.rar");  
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "49G6IV9DINLJZHRS");
			cap.setCapability(CapabilityType.BROWSER_NAME, "Android");
			cap.setCapability(CapabilityType.VERSION, "5.1.1");
			cap.setCapability("platformName", "Android");
			cap.setCapability("appPackage","com.mobeta.android.demodslv");
			cap.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
			driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			
		}
		@Test
		public void run() throws InterruptedException{
			driver.findElement(By.id("activity_title")).click();
			WebElement chick = (WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(2);
			Thread.sleep(5000);
			WebElement wayne = (WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(5);
			
			
			//Perform drag and drop
			//TouchAction action = new TouchAction(driver);
			TouchAction action = new TouchAction((MobileDriver) driver);
			action.longPress(chick).moveTo(wayne).release().perform();
			//WebElement dd = (WebElement) driver.findElements(By.id("text")).get(5);
			//Assert.assertEquals(chick, dd);
			System.out.println("Performed drag and drop successfully");
			
			
		}
		@AfterTest
	    public void tearDown(){
			driver.quit();
			
		
	}
	

}
