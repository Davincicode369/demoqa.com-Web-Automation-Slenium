package TestPages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.PracticePage;
import Pages.loginPage;
import TestData.LoginTestdata;
import baseClass.BaseClass;

public class LoginTestPage extends BaseClass {

    PracticePage practicepage;
    loginPage loginpage;

    @BeforeClass
    public void setup() {
        initialize();
        loginpage = new loginPage(getDriver());
    }

    @BeforeMethod
    public void openLoginPage() {
        getDriver().get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(dataProvider = "Invalidlogindata", dataProviderClass = LoginTestdata.class)
    public void verifyInvallidLogin(String username, String password) {
        loginpage.enterUsername(username);
        loginpage.enterPassword(password);
        loginpage.clickLoginBtn();

        Assert.assertTrue(loginpage.errorMessage(), "Error message not displayed");
    }

    @Test(dataProvider = "ValidLOginData", dataProviderClass = LoginTestdata.class)
    public void verifyValidLogin(String Username, String Password) {
        loginpage.enterUsername(Username);
        loginpage.enterPassword(Password);
        loginpage.clickLoginBtn();

        Assert.assertTrue(loginpage.VisibilityLoginSuccefull(), "Login Successful Message not displayed");
        Assert.assertTrue(loginpage.visibilityofLogoutBtn(), "Logout button not displayed");
    }

    @AfterClass
    public void teardown() {
        quit();
    }
}