package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgClass2 
{
	
  @Test
  public void myMethod() 
  {
	  System.out.println("Hi this is console pritnting statement");
	  Reporter.log("Hi this is Reporter , without boolean parameter");
	  Reporter.log("this is reporter with bollean parameter", true);
	  
  }
  
  
  
}
