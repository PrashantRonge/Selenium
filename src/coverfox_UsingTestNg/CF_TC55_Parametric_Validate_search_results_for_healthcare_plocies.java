package coverfox_UsingTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CF_TC55_Parametric_Validate_search_results_for_healthcare_plocies {
  
	WebDriver driver;
	Coverfox_Homepage home;
	Coverfox_health_plan healthPlan;
	Coverfox_MemberDetails memberDetail ;
	CoverfoxAddressDetails adress;
	CoverfoxHealthPlanResults result;
	
	@BeforeClass
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		home = new Coverfox_Homepage(driver);
		healthPlan = new Coverfox_health_plan (driver);
		memberDetail = new  Coverfox_MemberDetails(driver);
		adress  = new CoverfoxAddressDetails (driver);
		result  = new  CoverfoxHealthPlanResults (driver);
		
		Reporter.log("Opening Chrome Brwoser", true);
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
	}
	@BeforeMethod
	public void enterMemberDetails() throws InterruptedException
	{
		Reporter.log("Clicking on Gender Button", true);
		home.clickGetStartedButton();
		Thread.sleep(1000);
		
		Reporter.log("Clicking on next Button", true);
		healthPlan.clickOnNextButton();
		Thread.sleep(1000);
		
		Reporter.log("Handling AgeDropDown ", true);
		memberDetail.handleAgedropdown("25");
		Reporter.log("Clicking on next Button", true);
		memberDetail.clicknextButton();
		Thread.sleep(1000);
		
		Reporter.log("Entering PinCode ", true);
		adress.enterPincode("431508");
		Reporter.log("Entering MObile NO ", true);
		adress.enterMobileNumber("9856547859");
		Thread.sleep(1000);
		Reporter.log("Clicking on Continue Button", true);
		adress.clickContinueButton();
		
	}
	
	@Test
  public void validateTestPlansFromTextAndBanners() throws InterruptedException 
  {
		Thread.sleep(5000);
		Reporter.log("Fetching No of Details from Text", true);
		int textReult = result.availableNoFromText();
		Reporter.log("Fetching No of Details from Banner", true);
		int bannerResult = result.availablePlanNumberFromBanner();
		
		Assert.assertEquals(textReult, bannerResult,"textreult and bannerResult are not matching");
		Reporter.log("Tc is Passed", true);
  }
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Reporter.log("Closing the Browser", true);
		Thread.sleep(10000);
		driver.close();
	}
}
