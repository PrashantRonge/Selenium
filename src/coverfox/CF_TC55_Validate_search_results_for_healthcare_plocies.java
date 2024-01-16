package coverfox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CF_TC55_Validate_search_results_for_healthcare_plocies {
	
	//---SocketException= symantanously u close the page before in continous coding
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//POM1
		Coverfox_Homepage home = new Coverfox_Homepage(driver);
		home.clickGetStartedButton();
		
		//POM2
		Coverfox_health_plan healthPlan = new Coverfox_health_plan(driver);
		healthPlan.clickOnNextButton();
	
		//POM3
		Coverfox_MemberDetails memberDetails = new Coverfox_MemberDetails(driver);
		memberDetails.handleAgedropdown();
		memberDetails.clicknextButton();
		
		//POM4
		CoverfoxAddressDetails adressDetails = new CoverfoxAddressDetails(driver);
		adressDetails.enterPincode();
		adressDetails.enterMobileNumber();
		adressDetails.clickContinueButton();
		
		//POM5
		CoverfoxHealthPlanResults planResults = new CoverfoxHealthPlanResults(driver);
		planResults.validatePlanlistwithresultList();
		
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
