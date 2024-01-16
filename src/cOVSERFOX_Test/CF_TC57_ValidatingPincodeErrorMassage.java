package cOVSERFOX_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cOVSERFOX_Base.Base;
import cOVSERFOX_Pom.COVSERFOXADRESS_DETAILS;
import cOVSERFOX_Pom.COVSERFOXHEALTH_PLAN;
import cOVSERFOX_Pom.COVSERFOXHOMEPAGE;
import cOVSERFOX_Pom.COVSERFOXMEMBER_DETAILS;
import cOVSERFOX_Utility.Utility;



public class CF_TC57_ValidatingPincodeErrorMassage extends Base
{

	COVSERFOXHOMEPAGE home;
	COVSERFOXHEALTH_PLAN healthplan;
	COVSERFOXMEMBER_DETAILS memberDetail;
	COVSERFOXADRESS_DETAILS adressdetail; 
	
	@BeforeClass
	public void LaunchCoverfox() throws InterruptedException
	{
		launchCoverfox();
		home = new COVSERFOXHOMEPAGE(driver);
		healthplan = new COVSERFOXHEALTH_PLAN(driver);
		memberDetail = new COVSERFOXMEMBER_DETAILS(driver);
		adressdetail = new COVSERFOXADRESS_DETAILS(driver);
	}
	
	
	@BeforeMethod
	public void EnterMemberDetails() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("Clicking on Gender Button", true);
        home.clickGetStartedButton();
        Thread.sleep(1000);
		
        Reporter.log("Clicking on next Button", true);
		healthplan.clickNextButton();
		Thread.sleep(1000);
		
		Reporter.log("Handling AgeDropDown ", true);
		memberDetail.handleAgeDropDown(Utility.readDataFromExcelsheet(2, 0));
		Thread.sleep(1000);
		Reporter.log("Click On Next Button  ", true);
		memberDetail.clickNextBurron();
		Thread.sleep(1000);
		
		adressdetail.enterMobileNumber(Utility.readDataFromExcelsheet(2, 2));
		Thread.sleep(1000);
		adressdetail.clickContinueButton();
		Thread.sleep(5000);
	}
	
	@Test
	public void ValidateerrorMsg()
	{
		Assert.assertTrue(adressdetail.errorMsgElementPresency(),"Member DEtails is not Present");
	}
	

}
