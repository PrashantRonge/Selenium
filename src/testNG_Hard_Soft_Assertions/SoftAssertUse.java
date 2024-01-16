package testNG_Hard_Soft_Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void f() 
  {
	  String a = "Hi";
	  String b = "Hello";
	  
	  SoftAssert s1 = new SoftAssert();
	  //TC FAIL
	  s1.assertEquals(a, b,"a and b are not Equal, TC is failed");
	  s1.assertNull(b , "b is not null , TC is failed");
	  
	  s1.assertAll();
  }
  @Test
  public void e() 
  {
	  String a = "Hi";
	  String b = "Hello";
	  
	  SoftAssert s2 = new SoftAssert();
	  
	  //TC PASS
	  s2.assertNotEquals(a, b,"a and b are  Equal, TC is failed");
	  s2.assertNotNull(b , "b is  null , TC is failed");
	  
	  s2.assertAll();
  }
}
