package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodUse {
  
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
	public void logIn()
	{
		Reporter.log("Log in sucessfully", true);
	}
	@BeforeMethod
	public void logIn1()
	{
		Reporter.log("Log1 in sucessfully", true);
	}
	@AfterMethod
	public void logOut()
	{
		Reporter.log("LogOut sucessfully", true);
	}
	
}
