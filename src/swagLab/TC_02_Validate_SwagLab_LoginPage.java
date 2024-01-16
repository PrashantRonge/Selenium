package swagLab;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02_Validate_SwagLab_LoginPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//craete obj of POM class loginpage
		SwagLabLoginPage loginpage = new SwagLabLoginPage(driver);
		loginpage.enterUserName();
		loginpage.enterPassword();
		loginpage.clickLoginPage();
		
		//craete obj of POM class SwagLabInventoryPage
		SwagLabInventoryPage inventoryPage = new SwagLabInventoryPage(driver);
		inventoryPage.clickBackPack();
		inventoryPage.clickfleeceJacket();
		inventoryPage.clickCartBox();
		
		

	}

}
