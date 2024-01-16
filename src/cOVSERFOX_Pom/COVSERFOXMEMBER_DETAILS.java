package cOVSERFOX_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class COVSERFOXMEMBER_DETAILS 
{
	@FindBy(id = "Age-You") private WebElement ageDropDown;
	@FindBy(className = "next-btn") private  WebElement nextButton;
	
	public COVSERFOXMEMBER_DETAILS(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void handleAgeDropDown(String age)
	{
		Select s = new Select(ageDropDown);
		s.selectByValue(age+"y");
	}
	public void clickNextBurron() 
	{
		nextButton.click();
		
	}

}
