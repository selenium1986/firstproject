package stepDefinition;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
	public class Home {
	public WebDriver driver;
	public HomePage page1;
	public LoginPage log;
	public Home(){
		this.driver = driver;
		page1 = new HomePage(driver);
	}
	
	@Given("^user is on mypage$")
	public void setUp(){
	driver = new FirefoxDriver();
	page1 = new HomePage(driver);
	log = new LoginPage(driver);
	page1.navigateToUrl("http://www.shopcourts.com");
	driver.manage().window().maximize();
	
}
	@When("^I click on the country$")
	public void run(){
		page1.clickCountry();
	}
	@And("^I should navigate to loginpage$")	
    public void navLogin(){
		LoginPage log = page1.login();
		
	}
	@When("^I click on login link$")
	public void navRegister(){
		RegisterPage reg = log.register();
		
	}
	@After
	public void tearDown(){
		driver.quit();
		
	}
	
	
	

}
