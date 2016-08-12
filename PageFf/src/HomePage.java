import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(className = "antigua_storeview")
	WebElement Chapter1;
	@FindBy(id = "search")
	WebElement Chapter2;
	@FindBy(linkText = "Home")
	WebElement Chapter3;
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	public FirstPage ClickChapter1(){
		Chapter1.click();
		return PageFactory.initElements(driver,  FirstPage.class);
		
	}
    public SecondPage ClickChapter2(){
    	Chapter2.sendKeys("tv");
		Chapter2.sendKeys(Keys.ENTER);
    	return PageFactory.initElements(driver, SecondPage.class);
    	
    }
    public HomePage ClickChapter3(){
    	Chapter3.click();
    	return PageFactory.initElements(driver, HomePage.class);
    	
    }
}
