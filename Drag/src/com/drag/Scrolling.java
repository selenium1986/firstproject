package com.drag;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Scrolling {
	
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
	/*
	@Test
	public void scroll(){
		driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
		driver.scrollTo("Views");
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.scrollTo("Tabs");
		driver.findElementByXPath("//android.widget.TextView[@text='Tabs']").click();
		driver.findElementByName("5. Scrollable").click();
		
		driver.findElementByName("Tab 3").click();
		for(int i=0;i<10;i++){
			//System.out.println(i);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElements(By.name("Tab 8")).size()!=0){
				System.out.println("tab 8 found");
				driver.findElementByName("Tab 8").click();
				break;
			}
				else{
					System.out.println("not clickable");
					//Locate parent element of text area.
					  WebElement ele1 = (WebElement) driver.findElements(By.id("android:id/tabcontent")).get(0);
					  //Locate text area of Tab 11 using It's parent element.
					  WebElement ele2 = ele1.findElement(By.className("android.widget.TextView"));
					  //Get text from text area of Tab 11 and print It In console.
					  System.out.println("Text under selected tab is -> "+ele2.getText());
					
				}
		
			}
		
		
	}
	*/
	@Test
	public void seek(){
		ScreenOrientation or = driver.getOrientation();
		System.out.println(or);
		driver.rotate(org.openqa.selenium.ScreenOrientation.LANDSCAPE);
		driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
		boolean isElementPresent = driver.findElementsByName("API Demos").size()!=0;
		Assert.assertTrue(isElementPresent, "Element is not present on the page");
		System.out.println("element is present on the page = "+ isElementPresent);
		driver.scrollTo("Views");
		//boolean isElementPresentOnThePage = driver.findElementsByName("Loader").size()!=0;
		//Assert.assertTrue(isElementPresentOnThePage, "not present on the page");
		//System.out.println("Loader is not present on the page : "+ isElementPresentOnThePage);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.scrollTo("Seek Bar");
		driver.findElement(By.name("Seek Bar")).click();
		driver.rotate(org.openqa.selenium.ScreenOrientation.PORTRAIT);
		WebElement seekbar = driver.findElement(By.id("seek"));
		int startx = seekbar.getLocation().getX();
		System.out.println(startx);
		int endx = seekbar.getSize().getWidth();
		System.out.println(endx);
		int yaxis = seekbar.getLocation().getY();
		System.out.println(yaxis);
		
		int moveseekbar = (int)(endx*.80);
		System.out.println(moveseekbar);
		
		TouchAction act = new TouchAction(driver);
		act.press(startx, yaxis).moveTo(moveseekbar, yaxis).release().perform();
		
		
		
	}
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
