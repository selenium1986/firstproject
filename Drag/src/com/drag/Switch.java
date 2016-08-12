package com.drag;

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

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Switch {
public AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws MalformedURLException{
		DesiredCapabilities d = new DesiredCapabilities();
		d.setCapability("deviceName", "49G6IV9DINLJZHRS");
		d.setCapability("platformName", "Android");
		d.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");
		d.setCapability("appPackage", "com.touchboarder.android.api.demos");
		d.setCapability(CapabilityType.BROWSER_NAME, "Android");
		d.setCapability(CapabilityType.VERSION, "5.1.1");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), d);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void switching() throws InterruptedException{
		driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
		driver.scrollTo("Views");
		driver.findElementByName("Views").click();
		driver.scrollTo("Switches");
		driver.findElementByName("Switches").click();
		String value = driver.findElement(By.id("monitored_switch")).getText();
		System.out.println(value);
		if(value.trim().equals("monitored switch off"));
		System.out.println("doing switch on");
		
		MobileElement off = (MobileElement) driver.findElementByName("Monitored switch Off");
		
		
		off.tap(1, 1);
		System.out.println("Swithc is on");
		Thread.sleep(5000);
		String value2 = driver.findElementById("monitored_switch").getText();
		System.out.println(value2);
		if(value2.trim().equals("monitored switch on"));
		System.out.println("doing switch off");
		
		MobileElement off2 = (MobileElement) driver.findElementByName("Monitored switch ON");
		off2.tap(1, 1);
		System.out.println("doing switch on");
		
	}
	@AfterTest
	public void tearDown(){
		driver.quit();
		
	}
}
