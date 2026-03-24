package TestPages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.PracticePage;
import baseClass.BaseClass;

public class PracticeTestPage extends BaseClass {
	PracticePage practicePage;
	String loginUrl ;
	
	@BeforeClass
	public void setUp() {
		initialize();
		practicePage = new PracticePage(getDriver());
		
	}
	
//	@Test
//	public void isLoginTestPagePresent() {
//		practicePage.isTesLoginPagePresent();
//	}
	
	@Test
	public void clickOnLoginTestPage() {

		practicePage.clickOnTestLOgin();
		
	}
	
	public String getLoginUrl() {
		return loginUrl = getDriver().getCurrentUrl();
	   
	}
	
	
	@AfterClass
public void quit() {
	getDriver().quit();
	}
}

