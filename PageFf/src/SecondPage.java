import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SecondPage {
	
	private WebDriver driver;
	@FindBy (id = "name")
	WebElement login;
	@FindBy (id = "home_id")
	WebElement verify1;
	
	public SecondPage(WebDriver driver){
		this.driver = driver;
		
	}
	
	public SecondPage Clicklogin(){
		login.click();
		return PageFactory.initElements(driver, SecondPage.class);
	}
	public HomePage ClickVerify1(){
		verify1.click();
		return PageFactory.initElements(driver, HomePage.class);
	}
	public String getText(){
		return getText();
	
	}

}
