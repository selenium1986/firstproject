package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {
	
	private WebDriver driver;
	//private BrowserActions browser = new BrowserActions(driver);
	private BrowserActions browser;
	private By first_name = By.id("firstname");
	private By last_name = By.id("lastname");
	private By emailid = By.id("email_address");
	private By male = By.id("gender-1");
	private By password = By.id("password");
	private By confirm_pass = By.id("confirmation");
	private By continue_button = By.xpath("//span[contains(text(), 'Continue')]");
	private By text = By.xpath("//span[contains(text(),'There is already an account with this email address. If you are sure that it is your email address,')]");
	
	
	public CreateAccountPage(WebDriver driver){
		this.driver = driver;
		 browser = new BrowserActions(driver);
	}
	
	public void enterFirstname(String text){
		//driver.findElement(first_name).sendKeys(text);
		browser.inputField(first_name, text);
        
        }
	public void enterLastname(String last){
		//driver.findElement(last_name).sendKeys(last);
		browser.inputField(last_name, last);
	}
		
		public void enterEmail(String text){
			//driver.findElement(emailid).sendKeys(text);
			browser.inputField(emailid, text);
			
		}
		public void clickGender(){
			//driver.findElement(male).click();
			browser.clickElement(male);
			
		}
		public void enterPassword(String pass){
			//driver.findElement(password).sendKeys(pass);
			browser.inputField(password, pass);
		}
		public void confirmPassword(String confirm){
			//driver.findElement(confirm_pass).sendKeys(confirm);
			browser.inputField(confirm_pass, confirm);
		}
			public void clickContinue(){
				//driver.findElement(continue_button).click();
				browser.clickElement(continue_button);
			
		}
			public String verifyText(){
				driver.findElement(text).getText();
				return verifyText();
			}
		
	    public LoginPages enterDetails(){
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(confirm_pass));		
		enterFirstname("selenium");
		enterLastname("1986");
		enterEmail("selenium1986@gmail.com");
		clickGender();
		enterPassword("selenium1986");
		confirmPassword("selenium1986");
		clickContinue();
		browser.isElementPresent(text);
		return new LoginPages(driver);
	}
		
	}
	
	

