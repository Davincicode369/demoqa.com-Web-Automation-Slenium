package baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import FrameWorkConstant.frameWorkConstant;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.utilities;


public class BaseClass {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	protected Properties prop;
	protected utilities util;
	
	
	
	String propertyFile = frameWorkConstant.configFilePath;
	String baseUrl = utilities.getPropertyValue("baseUrl");
	
	
	public static WebDriver getDriver() {
	    return driver.get();
	}
	
	public void initialize() {
	   WebDriverManager.chromedriver().setup();
	   ChromeOptions options = new ChromeOptions();
	   options.addArguments("--headless=New");
	   options.addArguments("--window-size=1920,1080");
       driver.set(new ChromeDriver());
       getDriver().get(baseUrl);
       getDriver().manage().window().maximize();
       getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	}
	
	public void quit() {
		if(getDriver()!=null) {
			getDriver().quit();
			driver.remove();
		}
	}

}
