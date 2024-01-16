package coverfox_UsingTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coverfox_health_plan 
{
	@FindBy(xpath = "//div[@class='next-btn']") private WebElement health_plan_NextButton ;

	public Coverfox_health_plan(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNextButton()
	{
		health_plan_NextButton.click();
	}
	





}