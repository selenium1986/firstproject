package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	private WebDriver driver;
	public Action act;
	By register_button = By.cssSelector("a[class='button']");
	By first_name = By.id("firstname");
	By last_name = By.id("lastname");
	By email_address = By.id("email_address");
	By password = By.id("password");
	By confirm_password = By.id("confirmation");
	By month = By.id("month");
	By day = By.id("day");
	By year = By.id("year");
	By gender = By.id("gender-1");
	
	
	public RegisterPage(WebDriver driver){
		this.driver = driver;	
		
	}
	public void clickRegisterButton(){
		driver.findElement(register_button).click();
	}
	public void setFirstName(String name){
		driver.findElement(first_name).sendKeys(name);
		
	}
	public void setLastName(String last){
		driver.findElement(last_name).sendKeys(last);
	}
	public void setEmail(String email){
		driver.findElement(email_address).sendKeys(email);
	}
	public void setPassword(String pass){
		driver.findElement(password).sendKeys(pass);
	}
	public void setConfirmPass(String confirm){
		driver.findElement(confirm_password).sendKeys(confirm);
		
	}
	public void setdate(String date){
		driver.findElement(day).sendKeys(date);
	}	
   public void setMonth(String month1){
	   driver.findElement(month).sendKeys(month1);
   }
   public void setYear(String years){
	   driver.findElement(year).sendKeys(years);
	   driver.findElement(register_button);
	   Actions act = new Actions(driver);
	  WebElement all = driver.findElement(register_button);
	  act.moveToElement(all).build().perform();
	   
	   
	   
   }
   public void fillRegisterForm(){
	   this.setFirstName("SELENIUM");
	   this.setLastName("PRACTICE");
	   this.setPassword("selenium1986");
	   this.setConfirmPass("selenium1986");
	   this.setEmail("selenium1986@gmail.com");
	   this.setdate("05");
	   this.setMonth("11");
	   this.setYear("1986");
	   
   }
}
