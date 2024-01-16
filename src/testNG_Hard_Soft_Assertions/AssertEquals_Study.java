package testNG_Hard_Soft_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals_Study {
  @Test
  public void f() 
  {
	  String a = "Pune";
	  String b = "Pune";
	  
	  
	  Assert.assertEquals(a, b, "a is notEqual to b , Tc is failed");
	  
  }
}
