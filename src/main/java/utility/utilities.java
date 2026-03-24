package utility;
import baseClass.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Driver;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.utilities;
import FrameWorkConstant.frameWorkConstant;
import io.github.bonigarcia.wdm.WebDriverManager;

//common methods

public class utilities {
	
	public static String getPropertyValue(String property) {
		Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(frameWorkConstant.configFilePath);
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop.getProperty(property);
	}
	
	 public static String takeScreenshot(WebDriver driver, String testName) {
	        String timeStamp = LocalDateTime.now()
	                .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

	        String destinationPath = "./screenshots/" + testName + "_" + timeStamp + ".png";

	        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        File destinationFile = new File(destinationPath);

	        try {
	            destinationFile.getParentFile().mkdirs();
	            Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return destinationPath;
	    }

}
