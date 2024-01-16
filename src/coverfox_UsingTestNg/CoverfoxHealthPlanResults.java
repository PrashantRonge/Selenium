package coverfox_UsingTestNg;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHealthPlanResults 
{
	//Variables
	@FindBy(xpath = "//div[contains(text(),'49 matching Health')]") private WebElement resultInString;
	@FindBy(id = "plans-list")private List<WebElement> planList;
	
	//Constructor
	public CoverfoxHealthPlanResults(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public int availableNoFromText()
	{
		String test = resultInString.getText();
		String[] array = test.split(" ");
		String numOfResultInString = array[0];
		//convert string to Integer
		int numOfResultInInteger = Integer.parseInt(numOfResultInString);
		return numOfResultInInteger;
	}
	
	public int availablePlanNumberFromBanner()
	{	
		int totalNoPlans = planList.size();
		return totalNoPlans;
    }

}
