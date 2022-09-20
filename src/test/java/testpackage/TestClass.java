package testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mainPackage.MainClass;
import pageobject.TestObject;

public class TestClass extends MainClass{
	@Test(dataProvider="sampledata", description = "TestCheck", priority = 1,
			enabled = true)
			public void homepage_keysenter(String UserName,String Password) {
			logger = extent.startTest("homepage_keysenter");
			TestObject obj=new TestObject(driver,logger);
			obj.veryHeader(UserName);
			}
			@DataProvider(name="sampledata")
			public Object[][] sampledata(){Object[][] data =getExcelData("WorkBook.xlsx", "data");
			return data;
			}
			}


