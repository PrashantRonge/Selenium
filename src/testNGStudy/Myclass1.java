package testNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listners.Listner.class)
public class Myclass1 {
  @Test
  public void a() 
  {
	  Reporter.log("Hi a is Running ", true);
  }
  @Test
  public void b() 
  {
	  Assert.fail();
	  Reporter.log("Hi b is Running ", true);
  }
  @Test(dependsOnMethods = {"b"})
  public void c() 
  {
	  Reporter.log("Hi c is Running ", true);
  }
  @Test
  public void d() 
  {
	  Reporter.log("Hi d is Running ", true);
  }
}
