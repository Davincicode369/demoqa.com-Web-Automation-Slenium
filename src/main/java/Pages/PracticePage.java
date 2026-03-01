package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticePage {
	private  WebDriver driver;
	private   WebDriverWait wait;
	
	
	private By TestLoginPage = By.xpath("//div//p//a[contains(text(),'Login')]");
	
	public PracticePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public void isTesLoginPagePresent() {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(TestLoginPage)).isDisplayed();
	}
	
	public void clickOnTestLOgin() {
		WebElement testLogin = driver.findElement(TestLoginPage);
		testLogin.click();
	}
	
	

}
