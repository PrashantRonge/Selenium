package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void TC1() 
  {
	  Reporter.log("Running TC1", true);
  }
  @Test
  public void TC2() 
  {
	  Reporter.log("Running TC2", true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("BeforeMethod is running", true);
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("AfterMethod is running", true);
  }
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("BeforeClass is running", true);
  }
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("AfterClass is running", true);
  }
  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("BeforeSuite is running", true);
  }
  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("AfterSuite is running", true);
  }
  
}
