package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	  public void TC3() 
	  {
		  Reporter.log("Running TC3", true);
	  }
	  @Test
	  public void TC4() 
	  {
		  Reporter.log("Running TC4", true);
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
	  @BeforeTest
	  public void beforeTest()
	  {
		  Reporter.log("BeforeTest is running", true);
	  }
	  @AfterTest
	  public void afterTest()
	  {
		  Reporter.log("AfterTestt is running", true);
	  }
}
