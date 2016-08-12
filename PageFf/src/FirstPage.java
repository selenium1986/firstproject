import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FirstPage{
	private WebDriver driver;
	
	@FindBy (id = "button")
	WebElement Ajaxclick;
	@FindBy (xpath ="//select[@id='selecttype']")
	WebElement dropdown;
	@FindBy (css = "a[name = 'ababbab']")
	WebElement button;
	
	public FirstPage(WebDriver driver){
		this.driver = driver;
	}
		public FirstPage firstClickAjax(){
			Ajaxclick.click();
			return PageFactory.initElements(driver, FirstPage.class);
			
		}
		public FirstPage clickDropdown(){
			//dropdown.click();
			new Select(dropdown).selectByVisibleText("abcbbb");
			dropdown.click();
			return PageFactory.initElements(driver, FirstPage.class);
		}
		public FirstPage clickVerify(){
			button.click();
			return PageFactory.initElements(driver, FirstPage.class);
		}
		
	}


