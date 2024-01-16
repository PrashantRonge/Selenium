package coverfox.Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coverfox_Homepage 
{
	//variables
	@FindBy (xpath = "//button[text()='Get Started']")private WebElement homeGetStarted;
	
	//constructor
	public Coverfox_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}

	//Methods
	public void clickGetStartedButton()
	{
		homeGetStarted.click();
	}
	
	
	
	
}
