package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class HomeTest {
	public WebDriver driver;
	public LoginPage login;
	public HomePage page;
	public RegisterPage register;
	public String baseurl = "http://www.shopcourts.com";
	
	@BeforeTest
	public void setUp(){
		driver = new FirefoxDriver();
		page = new HomePage(driver);
		login = new LoginPage(driver);
		register = new RegisterPage(driver);
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Test
	public void run(){
		HomePage page = new HomePage(driver);
	    page.clickCountry();
		LoginPage login = new LoginPage(driver);
		login.clickSignInLink();
		login.loginTo("selenium1986@gmail.com", "Kshitij18");
		login.validation();
		RegisterPage register = new RegisterPage(driver);
		register.clickRegisterButton();
		register.fillRegisterForm();
		register.clickRegisterButton();
		
		
	}
	@AfterTest
	public void tearDown(){
		driver.quit();
		
	}

}
