package listners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner2 implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String tcName = result.getName();
		Reporter.log("Tc "+tcName+" is complites sucessfully Listner 2 ", true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String tcName = result.getName();
		Reporter.log("Tc "+tcName+" is failed , Please check again Listner 2 ", true);
	}

}
