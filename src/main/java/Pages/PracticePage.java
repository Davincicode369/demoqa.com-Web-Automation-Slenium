package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticePage {
	  WebDriver driver;
	  WebDriverWait wait;
	
	
	private By testLoginPage = By.linkText("Test Login Page");
	
	public PracticePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public boolean isTesLoginPagePresent() {
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(testLoginPage)).isDisplayed();
	}
	
	public void clickOnTestLOgin() {
        wait.until(ExpectedConditions.elementToBeClickable(testLoginPage)).click();
        
		
	}
	
	

}
