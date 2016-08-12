package com.curve.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.curve.pages.HomePage;
import com.curve.pages.JoinNowPage;

import junit.framework.Assert;

public class HomeTest {
	
	private WebDriver driver;
	public HomePage home;
	public JoinNowPage join;
	public String baseUrl = "https://www.imaginecurve.com";
	
	@BeforeTest
	public void setUp(){
		driver = new FirefoxDriver();
		home = new HomePage(driver);
		join = new JoinNowPage(driver);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void execute() throws InterruptedException{
		HomePage home = new HomePage(driver);
		home.clickJoinNow();
		JoinNowPage join = new JoinNowPage(driver);
		join.enterPhoneNumber("1234567");
		Assert.assertEquals(join.getValue(), "1234567");
		
		
		
		
		
		
		
		
	}
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
