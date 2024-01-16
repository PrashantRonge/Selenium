package testNGkEYwORDS;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
  @Test(timeOut = 6000)   //if time is <5000 then timeout exception
  public void Payment() throws InterruptedException 
  {
	  Thread.sleep(5000);
	  Reporter.log("Payment done sucessfully", true);
  }
}
