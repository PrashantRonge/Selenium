package testNGkEYwORDS;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation1 {
	@Test
	  public void a() 
	  {
		  Reporter.log("TC a is running", true);
	  }
	  @Test(invocationCount = 4)
	  public void b() 
	  {
		  Reporter.log("TC b is running", true);
	  }
	  @Test
	  public void c() 
	  {
		  Reporter.log("TC c is running", true);
	  }
}
