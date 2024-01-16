package testNGkEYwORDS;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType;

public class MixUsedKeyWords 
{
  @Test(dependsOnMethods  = {"d"},priority = -1)
  public void a() 
  {
	  Reporter.log("TC a is running", true);
  }
  @Test
  public void b() 
  {
	  Reporter.log("TC b is running", true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("TC c is running", true);
  }
  @Test(invocationCount = 3)
  public void d() 
  {
	  Reporter.log("TC d is running", true);
  }
}
