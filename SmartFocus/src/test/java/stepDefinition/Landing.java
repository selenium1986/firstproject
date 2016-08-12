package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePages;
import pages.LandingPage;
import pages.LoginPages;
import pages.BrowserActions;
import pages.CreateAccountPage;

public class Landing {
	public WebDriver driver;
	public LandingPage land;
	public HomePages home;
	public LoginPages login;
	public CreateAccountPage register;
	public BrowserActions browser;
	
	public Landing(){
		this.driver = new FirefoxDriver();
		land = new LandingPage(driver);
		home = new HomePages(driver);
		login = new LoginPages(driver);
		register = new CreateAccountPage(driver);
		browser = new BrowserActions(driver);
		
	}
	@Given("^I am on the homepage$")
	public void nav(){
	land.navigateToPage("http://shopcourts.com");
	}
	@When("^I click on the country$")
	public void country(){
	HomePages home = land.clickCount();
	}
	@When("^I click on the signin link$")
	public void sign(){
	LoginPages login = home.clickSignIn();
		
	}
    @When("^I click on register button$")
	public void ClickRegister(){
	CreateAccountPage register = login.Register();
		
	}
    @Then("^I enter all following details$")
    public void enterRegisterDetails(){
    	LoginPages login = register.enterDetails();
    	
    	

  
    	
    }
    @After
    public void tearDown(){
    	driver.quit();
    }
    }


