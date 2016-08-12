package com.drag;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Swipping {
	
	AndroidDriver driver;
	Dimension size;
	
	@BeforeTest
	public void setup() throws MalformedURLException{
		DesiredCapabilities c = new DesiredCapabilities();
		c.setCapability("DeviceName", "49G6IV9DINLJZHRS");
		c.setCapability(CapabilityType.BROWSER_NAME, "Android");
		c.setCapability(CapabilityType.VERSION, "5.1.1");
		c.setCapability("platformName", "Android");
		c.setCapability("appPackage", "com.fortysevendeg.android.swiplistview");
		c.setCapability("appActivity", "com.fortysevendeg.android.swiplistview.sample.activity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),c);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	@Test
	public void swipeHorizontal() throws InterruptedException{
		size = driver.manage().window().getSize();
		System.out.println(size);
		//horizontal swiping line straight
		int startx = (int)(size.width*0.70);  //starting line
		int endx = (int)(size.width*0.30);    // ending line
		int starty = (int)(size.height/2);   //swipe from the middle of the screen
		//driver.swipe(startx, starty, endx, endy, duration);
		System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);
		
		//SWIPE FROM RIGHT TO LEFT
		driver.swipe(startx, starty, endx, starty, 3000);
		Thread.sleep(2000);
		
		
		//SWIPE FROM LEFT TO RIGHT
		driver.swipe(endx, starty, startx, starty, 3000);
		Thread.sleep(1000);
	}
	@Test
	public void verticalSwiping() throws InterruptedException{
		size = driver.manage().window().getSize();
		System.out.println(size);
		
		int starty = (int)(size.height*0.80);
		int endy = (int)(size.height*0.20);
		int startx = (int)(size.width/2);
		
		System.out.println("starty ="+starty+",endy ="+endy+"startx = "+startx);
		
		driver.swipe(starty, startx, endy, startx, 2000);// FROM TOP TO BOTTOM
		
		Thread.sleep(2000);
		driver.swipe(startx, endy, startx, starty, 2000); // FROM BOTTOM TO TOP
				
	}
	@AfterTest 
	public void tearDown(){
		driver.quit();
		
	}

}
