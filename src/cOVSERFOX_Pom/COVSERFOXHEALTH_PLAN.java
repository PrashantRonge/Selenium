package cOVSERFOX_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class COVSERFOXHEALTH_PLAN 
{
	@FindBy(className = "next-btn") private WebElement nextButton;
	
	public COVSERFOXHEALTH_PLAN(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickNextButton()
	{
		nextButton.click();
	}
	

}
