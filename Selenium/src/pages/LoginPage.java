package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {
	public WebDriver driver;
	By sign_in = By.xpath("//*[@id='header']/div/div[3]/div[1]/ul/li[1]/a");
	By login_email = By.id("email");
	By login_pass = By.id("pass");
	By click_button = By.id("send2");
	By text = By.xpath("//span[contains(text(), 'Invalid login or password.')]");
	
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		
	}
	public void clickSignInLink(){
		driver.findElement(sign_in).click();
		
		
	}
	public void setEmail(String emal){
		driver.findElement(login_email).sendKeys(emal);
		
	}
	public void setPassword(String text){
		driver.findElement(login_pass).sendKeys(text);
	}
	public void clickButton(){
		driver.findElement(click_button).click();
		
	}
	public String validation(){
		return driver.findElement(text).getText();
	}
	public void loginTo(String userName,String password){
		this.setEmail(userName);
		this.setPassword(password);
		this.clickButton();
		
	}
	
	

}
