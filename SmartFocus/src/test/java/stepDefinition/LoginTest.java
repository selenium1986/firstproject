package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BrowserActions;
import pages.CreateAccountPage;
import pages.HomePages;
import pages.LandingPage;
import pages.LoginPages;

public class LoginTest {
	public WebDriver driver;
	public LandingPage land;
	public HomePages home;
	public LoginPages login;
	public CreateAccountPage register;
	public BrowserActions browser;
	
	public LoginTest(){
		this.driver = new FirefoxDriver();
		land = new LandingPage(driver);
		home = new HomePages(driver);
		login = new LoginPages(driver);
		register = new CreateAccountPage(driver);
		browser = new BrowserActions(driver);
		
	}
	
	
	@Given("^I m on page$")
	public void navigate(){
		land.navigateToPage("http://shopcourts.com");
		land.clickCount();
		home.clickSignIn();
		
	}
	@When("^I enter (.*) and (.*) and submit$")
	public void enteruser_and_password(String username,String password){
		login.enterUserNameAndText(username, password);
		
		
	}
	@Then("^I logged in and see my name$")
	public void verifyAccount(){
		login.verifyAccount();
	}
	@And("^I can see my (.*)$")
	public void verifyMessage(String mess){
		
		login.verifyMessage(mess);
		
		
	}
	@After
	public void tearDown(){
		driver.quit();
		
	}

}
