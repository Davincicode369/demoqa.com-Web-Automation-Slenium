package TestPages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.PracticePage;
import Pages.loginPage;
import baseClass.BaseClass;

public class LoginTestPage extends BaseClass{
	PracticePage practicepage;
	loginPage loginpage;

	@BeforeClass
	public void setup() {
		initialize();
		practicepage = new PracticePage(getDriver());
		loginpage = new loginPage(getDriver());

	}
	
	@Test
	public void verifyValidLogin() {
		practicepage.clickOnTestLOgin();
		loginpage.enterUsername("student");
		loginpage.enterPassword("Password123");
		loginpage.clickLoginBtn();
		loginpage.VisibilityLoginSuccefull();
		loginpage.visibilityofLogoutBtn();
		
	}
	
	@AfterClass
	public void quit() {
		if(getDriver()!=null)
		getDriver().quit();
	}
	
}
