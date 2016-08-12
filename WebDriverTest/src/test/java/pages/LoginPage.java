package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver;
	By register_link = By.cssSelector("a[title='Register']");
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public RegisterPage register(){
		driver.findElement(register_link).click();
		return new RegisterPage(driver);
	}
	

}
