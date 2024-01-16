package testNGkEYwORDS;

import org.testng.Reporter;
import org.testng.annotations.Test;
//if configurating is wrong then TESTNG excection came(dependant method is enable)
//if dependant method is fail then TESTNG EXCEPTION came
//one method can depend on multiple methods
//first priority fot TestNg keyword id = DependsOnMethods
public class DependsOnMethodUse {
	@Test
	  public void a() 
	  {
		  Reporter.log("TC a is running", true);
	  }
	  @Test(dependsOnMethods = {"d"})
	  public void b() 
	  {
		  Reporter.log("TC b is running", true);
	  }
	  @Test
	  public void c() 
	  {
		  Reporter.log("TC c is running", true);
	  }
	  @Test
	  public void d() 
	  {
		  Reporter.log("TC d is running", true);
	  }
}
