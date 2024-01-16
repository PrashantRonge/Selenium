package swagLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInventoryPage {

	
	//1.Variable
	@FindBy(xpath = "(//button[text()='ADD TO CART'])[4]")private WebElement fleeceJacketAddToCart;
	@FindBy(xpath = "(//button[text()='ADD TO CART'])[1]")private WebElement backPackAddToCart;
	@FindBy (id = "shopping_cart_container") private WebElement cartBoxButton;
	
	
	//2.Constructor
	SwagLabInventoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
		
	}
	
	
	//Methods
	public void clickfleeceJacket()
	{
		fleeceJacketAddToCart.click();
	}
	public void clickBackPack()
	{
		backPackAddToCart.click();
	}
	public void clickCartBox()
	{
		cartBoxButton.click();
	}
	
	

}
