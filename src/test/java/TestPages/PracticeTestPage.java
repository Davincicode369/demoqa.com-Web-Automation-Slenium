package TestPages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.PracticePage;
import baseClass.BaseClass;

public class PracticeTestPage extends BaseClass {
	PracticePage practicePage;
	
	@BeforeClass
	public void setUp() {
		initialize();
		practicePage = new PracticePage(getDriver());
		
	}
	
	@Test
	public void isLoginTestPagePresent() {
		practicePage.isTesLoginPagePresent();
	}
	
	@Test
	public void clickOnLoginTestPage() {
		practicePage.clickOnTestLOgin();
	}
	
	@AfterClass
public void quit() {
	if(getDriver()!=null) {
		getDriver().quit();
	}
}
}
