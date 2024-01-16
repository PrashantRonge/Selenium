package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Sendkeys_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		WebElement fNamae = driver.findElement(By.name("firstname"));
		
		Actions act = new Actions(driver);
//		act.sendKeys(fNamae, "prashant").perform();

		Thread.sleep(1000);
		// send keys in UPPERCASE
//		act.keyDown(fNamae, Keys.SHIFT).sendKeys("prashant").build().perform();
		
		// send keys in UPPERCASE & LOWERCASE
		act.keyDown(fNamae, Keys.SHIFT).sendKeys("pra").keyUp(Keys.SHIFT).sendKeys("shant").build().perform();
		
		
	}

}
