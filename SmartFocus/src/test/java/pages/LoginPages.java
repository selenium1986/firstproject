package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages {
	private WebDriver driver;
	private BrowserActions browser;
	private By user_name = By.id("email");
	private By password = By.id("pass");
	private By login_buton = By.xpath("//span[contains(text(), 'Login')]");
	private By register_button = By.xpath("//span[contains(text(), 'Register')]");
	private By verify_username = By.xpath("//p[contains(text(), 'selenium1986')]");
	private By verify_userid = By.xpath("//p[contains(text(), 'selenium1986@gmail.com')]");
	private By verify_message = By.xpath("//strong[contains(text(), 'Hello, selenium 1986!')]");
	private By invalid_email = By.xpath("//strong[contains(text(), 'Hello, selenium 1986!')]");
	
	
	public LoginPages(WebDriver driver){
		this.driver = driver;
		browser = new BrowserActions(driver);
	}
	
	public CreateAccountPage Register(){
		browser.clickElement(register_button);
		return new CreateAccountPage(driver);
		
		
	}
	public CreateAccountPage enterUserNameAndText(String user, String pass){
		browser.inputField(user_name, user);
		browser.inputField(password, pass);
		browser.clickElement(login_buton);
		return new CreateAccountPage(driver);
		
	}
	public void verifyAccount(){
		browser.isElementPresent(verify_username);
		browser.isElementPresent(verify_userid);
	}

	public void verifyMessage(String compare){
		browser.getText(verify_message, compare);
		System.out.println(compare);
		
		
		
		
	}
	public void verifyInvalidEmail(String invalid){
		browser.getText(invalid_email, invalid);
		System.out.println(invalid);
		
	}

}
