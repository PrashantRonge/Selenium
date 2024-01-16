package coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxAddressDetails 
{
	@FindBy(xpath = "//input[@placeholder='6 Digit Pincode']") private WebElement pinCode;
	@FindBy(xpath = "//input[@placeholder='Your mobile number']") private WebElement mobileNumber;
	@FindBy(xpath = "//div[text()='Continue']")private WebElement continueButton;
	
	public CoverfoxAddressDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void enterPincode()
	{
		pinCode.sendKeys("431506");
	}
	public void enterMobileNumber()
	{
		mobileNumber.sendKeys("7507789497");
	}
	public void clickContinueButton()
	{
		continueButton.click();
	}
	
}
