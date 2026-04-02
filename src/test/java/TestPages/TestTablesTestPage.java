package TestPages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.TestTables;
import baseClass.BaseClass;

public class TestTablesTestPage extends BaseClass {
	TestTables table;
	
	@BeforeClass
	public void setup() {
		initialize();
		table = new TestTables(getDriver());
	}
	
	@Test (priority = 1)
	public void isTestTablePresent() {
		table.isTestTblePresent();
	}
	
	@Test (priority = 2)
	public void clickOnTestTable() {
		table.clickTestTable();
	}
	
	@AfterClass
	public void quit() {
		getDriver().quit();
	}
	

}
