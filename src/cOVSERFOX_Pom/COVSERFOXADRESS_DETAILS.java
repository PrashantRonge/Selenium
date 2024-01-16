package cOVSERFOX_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class COVSERFOXADRESS_DETAILS 
{
	@FindBy(className = "mp-input-text") private WebElement  pinCode;
	@FindBy(id = "want-expert") private WebElement mobileNumber;
	@FindBy(xpath = "//div[text()='Continue']") private WebElement continueButton;
	 @FindBy(className = "error-ui") private WebElement errorMsg;

	public COVSERFOXADRESS_DETAILS(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterPinCode(String pincode)
	{
		pinCode.sendKeys(pincode);
	}
	public void enterMobileNumber(String mobilenumber)
	{
		mobileNumber.sendKeys(mobilenumber);
	}
	public void clickContinueButton()
	{
		continueButton.click();
	}
	public boolean errorMsgElementPresency()
	{
		boolean value = errorMsg.isDisplayed();
		return value;
	}
}
