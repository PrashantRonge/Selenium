package coverfox_UsingTestNg;

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

	public void enterPincode(String zipcode)
	{
		pinCode.sendKeys(zipcode);
	}
	public void enterMobileNumber(String mobno)
	{
		mobileNumber.sendKeys(mobno);
	}
	public void clickContinueButton()
	{
		continueButton.click();
	}
	
}
