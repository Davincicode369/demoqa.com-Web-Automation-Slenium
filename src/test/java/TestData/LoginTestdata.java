package TestData;

import org.testng.annotations.DataProvider;

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
	
}
