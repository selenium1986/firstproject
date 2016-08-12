package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class SetUp {
	private WebDriver driver;
	static String driverPath = "//D://chrome//exe";
	
	public WebDriver getDriver(){
		return driver;
		
	}
	public void setDriver(String browserType, String url){
		switch(browserType){
		case "chrome":
			driver = initChromeDriver(url);
			break;
		case "firefox":
			driver = initFirefoxDriver(url);
			break;
			default:
				System.out.println("browser :" + browserType + " default browser is running");
		}
		
	}
	private static WebDriver initFirefoxDriver(String url){
		System.out.println("Launching firefox browser");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		return driver;
		
		
	}
	private static WebDriver initChromeDriver(String url){
		System.out.println("Chrome browser is starting");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	@Parameters ({"browserType", "url"})
	@BeforeClass
	public void intializeBaseTestSetUp(){
		try{
			setDriver("browserType", "url");
		} catch (Exception e){
			System.out.println(e.getStackTrace());
		}
		
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
		
	}
		
	}


