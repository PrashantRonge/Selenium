package testNG_Hard_Soft_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue_False_Study {
  @Test
  public void f()
  {
	  boolean a = true;
	  boolean b =  false;
	  
	  //if a is true
	  Assert.assertTrue(a, "a is not true");
	  
	//if b is false
	  Assert.assertFalse(b, "b is  true");
  }
}
