package testNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listners.Listner.class)
public class Myclass2 {
  @Test
  public void e() 
  {
	  Reporter.log("Hi e is Running ", true);
  }
  @Test
  public void f() 
  {
	  Assert.fail();
	  Reporter.log("Hi f is Running ", true);
  }
  @Test(dependsOnMethods = {"f"})
  public void g() 
  {
	  Reporter.log("Hi g is Running ", true);
  }
  @Test
  public void h() 
  {
	  Reporter.log("Hi h is Running ", true);
  }
}
