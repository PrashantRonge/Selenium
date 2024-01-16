package testNG_Hard_Soft_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull_AssertNotNull_Study {
  @Test
  public void f() 
  {
	  String a = "Pune";
	  String b = null;
	  
// verify a is not null
	  Assert.assertNotNull(a , "a is null , TC is failed");
	 // Assert.assertNotNull(b , "b is null , TCis failed");
	
//verify b is  null	 
	  Assert.assertNull(b , "b is not null , TC is failed");
	  
  }
}
