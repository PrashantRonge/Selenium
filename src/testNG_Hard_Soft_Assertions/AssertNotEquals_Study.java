package testNG_Hard_Soft_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals_Study {
  @Test
  public void f() 
  {
	  
	  String b = "Pune";
	  String c = "Mumbai";
	  
	  Assert.assertNotEquals(b, c, "b and c are Equal , TC is Failed");
  }
}
