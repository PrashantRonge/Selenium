package testNGkEYwORDS;

import org.testng.Reporter;
import org.testng.annotations.Test;
// default priority is 0

public class PrioRity1 {
  @Test
  public void a() 
  {
	  Reporter.log("TC a is running", true);
  }
  @Test(priority = 2)
  public void b() 
  {
	  Reporter.log("TC b is running", true);
  }
  @Test(priority = -2)
  public void c() 
  {
	  Reporter.log("TC c is running", true);
  }
  @Test(priority = -6)
  public void d() 
  {
	  Reporter.log("TC d is running", true);
  }
}
