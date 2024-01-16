package coverfox.Auto;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import miscellaneous.CommonlyUsedMethodS;

public class CF_TC55_Automated_Validate_search_results_for_healthcare_plocies2 {
	
	//---SocketException= symantanously u close the page before in continous coding
	

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
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
		Thread.sleep(1500);
		memberDetails.handleAgedropdown(CommonlyUsedMethodS.excelTableDataRead("Coverfox", 2, 0));
		memberDetails.clicknextButton();
		
		//POM4
		CoverfoxAddressDetails adressDetails = new CoverfoxAddressDetails(driver);
		Thread.sleep(1500);
		adressDetails.enterPincode(CommonlyUsedMethodS.excelTableDataRead("Coverfox", 2, 1));
		Thread.sleep(1500);
		adressDetails.enterMobileNumber(CommonlyUsedMethodS.excelTableDataRead("Coverfox", 2, 2));
		adressDetails.clickContinueButton();
		Thread.sleep(2000);
		
		//POM5
		CoverfoxHealthPlanResults planResults = new CoverfoxHealthPlanResults(driver);
		planResults.validatePlanlistwithresultList();
		
		Thread.sleep(20000);
		driver.close();
		
		

	}

}
