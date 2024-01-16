package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassUse {
	@Test
    public void myMethod() 
	{
		Reporter.log("TC my method is running", true);
    }
	@Test
    public void myMethod1() 
	{
		Reporter.log("TC my method1 is running", true);
    }
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Log in sucessfully", true);
	}
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("LogOut sucessfully", true);
	}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("launch the browser", true);
	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("close the browser", true);
	}
}
