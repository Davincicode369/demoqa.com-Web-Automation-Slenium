package TestData;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import FrameWorkConstant.frameWorkConstant;
import utility.utilities;

public class LoginTestdata {

@DataProvider(name="Invalidlogindata")
public Object[][] getValidlogindata(){
	return new Object[][] {
		 {"wrongcred", "Password123" },
         {"student", "wrongpasscred" },
         {"wronguser", "Password123" },
         {"", "" }
	};
}

@DataProvider(name="ValidLOginData")
public Object[][] getValidLogindata(){
	return new Object[][] {
		{"student","Password123"}
	};
}	

@DataProvider(name="getExcelData")
public Object[][]exceldata() throws IOException{
	String filepath = frameWorkConstant.ExcelFilePath;
	return utilities.getExcedata(filepath, "LoginData");
}
	
}
