package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestTables {
	
	WebDriver driver;
	WebDriverWait wait;
	
	private By TestTable = By.linkText("Test Table");
	
	public TestTables(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public boolean isTestTblePresent() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(TestTable)).isDisplayed();
	}
	
	public void clickTestTable() {
		wait.until(ExpectedConditions.elementToBeClickable(TestTable)).click();
	}

}
