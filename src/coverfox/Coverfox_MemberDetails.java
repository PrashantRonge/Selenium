package coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Coverfox_MemberDetails 
{
	@FindBy(id = "Age-You")private WebElement ageDropDown;
	@FindBy(xpath = "//div[text()='Next']")private WebElement nextButton;
	
	public Coverfox_MemberDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void handleAgedropdown()
	{
		Select s =  new Select(ageDropDown);
		s.selectByValue("27y");
		
	}
	public void clicknextButton()
	{
		nextButton.click();
	}
	
	
	

}
