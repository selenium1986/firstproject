import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TestRun extends BaseTest{
	
	@Test
	public void run(){
		page = PageFactory.initElements(driver, HomePage.class);
		driver.get(baseurl);
		page.ClickChapter1();
		second = page.ClickChapter2();
		page = page.ClickChapter3();
		
		
		
	}

}
