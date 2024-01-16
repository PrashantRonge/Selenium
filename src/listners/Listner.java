package listners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String tcName = result.getName();
		Reporter.log("Tc "+tcName+" is complites sucessfully ", true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		String tcName = result.getName();
		Reporter.log("Tc "+tcName+" is skipped , please check dependant method ", true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String tcName = result.getName();
		Reporter.log("Tc "+tcName+" is failed , Please check again ", true);
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		String tcName = result.getName();
		Reporter.log("Tc "+tcName+" Execution is Started ", true);
	}

}
