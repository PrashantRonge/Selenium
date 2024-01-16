package coverfox.Auto;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHealthPlanResults 
{
	@FindBy(xpath = "//div[contains(text(),'49 matching Health')]") private WebElement resultInString;
	@FindBy(id = "plans-list")private List<WebElement> planList;
	
	
	public CoverfoxHealthPlanResults(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validatePlanlistwithresultList()
	{
		String test = resultInString.getText();
		String[] array = test.split(" ");
		String numOfResultInString = array[0];
		//convert string to Integer
		int numOfResultInInteger = Integer.parseInt(numOfResultInString);
		int totalNoPlans = planList.size();
		if(numOfResultInInteger==totalNoPlans)
		{
			System.out.println("plans no is matching is sujjested plans --->test pass");
		}
		else
		{
			System.out.println("plans no isnot  matching is sujjested plans --->test fail");
		}
	}

}
