package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {
	WebDriver driver;
	WebDriverWait wait;
	
	private By useranme = By.xpath("//input[@id='username']");
	private By Password = By.xpath("//input[@id='password']");
	private By loginButton = By.xpath("//button[@id='submit']");
	private By loginSuccessMessage = By.xpath("//div//h1[contains (text(),'Logged In Successfully')]");
	private By ErrorMessage = By.xpath("//div//div[@id='error']");
	private By LogoutBtn = By.xpath("//div//a[contains(text(),'Log out')]");
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public void enterUsername (String username) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(useranme)).sendKeys(username);
	}

	public void enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Password)).sendKeys(password);
	}
	
	public void clickLoginBtn() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
	}
	
	public boolean VisibilityLoginSuccefull() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(loginSuccessMessage)).isDisplayed();
	}
	
	public boolean errorMessage() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(ErrorMessage)).isDisplayed();
	}
	
	public boolean visibilityofLogoutBtn () {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(LogoutBtn)).isDisplayed();
	}
	
}
