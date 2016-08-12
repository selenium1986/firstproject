
package com.bridge;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class MyScenario {
	
	public AndroidDriver driver;
	 
	@BeforeTest
	public void setup() throws MalformedURLException{	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "49G6IV9DINLJZHRS");
		cap.setCapability(CapabilityType.BROWSER_NAME, "Android");
		cap.setCapability(CapabilityType.VERSION, "5.1.1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage","com.unicomer.cookapp");
		cap.setCapability("appActivity", "com.unicomer.cookapp.SplashActivity");
		driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	    @Test
		public void register() throws InterruptedException{
		driver.findElement(By.id("com.unicomer.cookapp:id/btn_register")).click();
		driver.findElement(By.id("textfield_et_label_input")).sendKeys("test");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Last Name']")).sendKeys("test2");
		Thread.sleep(10);
		driver.findElement(By.id("password")).sendKeys("testing3");
		//driver.scrollTo("Register");
		
		driver.scrollToExact("Register");
		driver.findElement(By.id("retype_password")).sendKeys("testing3");
		WebElement b = driver.findElement(By.xpath("//android.widget.EditText[@text='Email Address']"));//.sendKeys("selenium1986@gmail.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Email Address']")).sendKeys("selenium1986@gmail.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile Number']")).sendKeys("0123456");
	    	
	    }
        @AfterTest
		public void tearDown(){
        	driver.quit();
			
		}
	}


