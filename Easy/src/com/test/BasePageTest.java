package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.SetUp;
import com.pages.objects.Landing;

public class BasePageTest extends Landing{
	public BasePageTest(WebDriver driver) {
		super(driver);
	}
	
	
	@BeforeClass
	public void set(){
		driver = getDriver();
		
	}
	@Test
	public void run(){
		Landing l = new Landing(driver);
		l.link();
		
		
	}

}
