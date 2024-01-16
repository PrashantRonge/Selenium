package swagLab;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//------------POM follow ENCAPSULATION Properties---------------------------//

public class SwagLabLoginPage 
{
	
//1.Variables   --------->WebElements
	      //Annotation means -------------------->>>@
	
	@FindBy(id = "user-name") private WebElement userName;
	// when we create obj of POM CLASS in another class
	//automatically replace by --->drive.findElement(By,("---------"))
	@FindBy(id = "password") private WebElement password;
	@FindBy(id = "login-button")private WebElement loginButton;
	
//Constructor   --------->
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	
	
	
//Methods       --------->
	
	public void enterUserName()
	{
		userName.sendKeys("standard_user");
	}
	
	public void  enterPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void clickLoginPage()
	{
		loginButton.click();
	}
	

}
